package Prac3;

import java.util.*;
public class prac3 {
    public static void main(String[] args) {
            /*
                Bank 클래스를 생성하고, 은행의 이름과 계좌 목록을 나타내는 인스턴스 변수를 가지도록 합니다.
                                     BankName   numList
                BankAccount 클래스를 생성하고, 계좌의 소유자, 계좌 번호, 잔액을 나타내는 인스턴스 변수를 가지도록 합니다.
                                            accountHolder accountNumber  balance
                Bank 클래스에는 다음과 같은 기능을 추가합니다:
                addAccount() 메서드를 작성하여 계좌를 은행에 추가합니다.
                getAccount() 메서드를 작성하여 계좌 번호를 입력받아 해당 계좌를 반환합니다.
                printAccountList() 메서드를 작성하여 은행에 등록된 모든 계좌의 정보를 출력합니다.
                depositToAccount() 메서드를 작성하여 계좌 번호와 입금액을 입력받아 해당 계좌에 입금을 수행합니다.
                withdrawFromAccount() 메서드를 작성하여 계좌 번호와 출금액을 입력받아 해당 계좌에서 출금을 수행합니다.
                */
                BankAccount user1 = new BankAccount("홍길동", "33-412-58", 30000);
                BankAccount user2 = new BankAccount("홍길순", "14-629-88", 16000);
                BankAccount user3 = new BankAccount("이순신", "85-226-31", 120000);
                BankAccount user4 = new BankAccount("정약용", "67-138-27", 200000);

                Bank bank1 = new Bank("농협");

                bank1.addAccount(user1);
                bank1.addAccount(user2);
                bank1.addAccount(user3);
                bank1.printAccountList();

                bank1.depositToAccount("33-412-57", 5000);
                bank1.printAccountList();

                bank1.withdrawFromAccount("85-226-31", 70000);
                bank1.printAccountList();
        }
}
class BankAccount{
    private String accountHolder;
    private String accountNumber;
    private double balance;
    public BankAccount(String accountHolder, String accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void setBalance(double money){
        balance = money;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public String getAccountHolder(){
        return this.accountHolder;
    }
    public double getBalance(){
        return this.balance;
    }
}
class Bank{
    private String BankName;
    private List<BankAccount> numList;
    public Bank(String BankName){
        this.BankName = BankName;
        this.numList = new ArrayList<>();
    }
    public void addAccount(BankAccount account){
        numList.add(account);
    }
    public BankAccount getAccount(BankAccount accountNumber){ // 계좌번호로 계좌 검색
        for(BankAccount account : numList){
            if(account.getAccountNumber().equals(accountNumber)){
                return account;
            }
        }
        return null;
    }
    public void printAccountList(){
        System.out.println("은행 : " + BankName);
        for(BankAccount account : numList){
            System.out.println("계좌 번호 : " + account.getAccountNumber());
            System.out.println("계좌 소유주 : " + account.getAccountHolder());
            System.out.printf("계좌 잔액 : %.0f\n", account.getBalance());
            System.out.println("");
        }
    }
    public void depositToAccount(String accountNumber, double money){
        for(BankAccount account : numList){
            if(account.getAccountNumber().equals(accountNumber)){
                account.setBalance(account.getBalance() + money);
                return;
            }
        }
        System.out.println("입금 실패 : 계좌 번호를 다시 입력해주세요.");
    }
    public void withdrawFromAccount(String accountNumber, double money){
        for(BankAccount account : numList){
            if(account.getAccountNumber().equals(accountNumber)){
                account.setBalance(account.getBalance() - money);
                return;
            }
        }
        System.out.println("출금 실패 : 계좌 번호를 다시 입력해주세요.");
    }
}

