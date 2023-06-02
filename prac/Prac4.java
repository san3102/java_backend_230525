package prac;

public class Prac4 {
    public static void main(String[] args) {
        /*
        BankAccount 클래스를 생성하고, 계좌의 소유자, 계좌 번호, 잔액을 나타내는 인스턴스 변수를 가지도록 합니다.
                                    accountHolder accountNumber  balance
        deposit() 메서드를 작성하여 계좌에 입금을 수행합니다.
        withdraw() 메서드를 작성하여 계좌에서 출금을 수행합니다.
        printAccountInfo() 메서드를 작성하여 계좌의 소유자, 계좌 번호, 잔액을 출력합니다.
        */
        BankAccount user1 = new BankAccount("홍길동", "33-412-58", 52769000);
        BankAccount user2 = new BankAccount("홍길순", "14-629-88", 13804000);

        user1.deposit(20000000);
        user2.deposit(6000000);
        user1.printAccountInfo();
        user2.printAccountInfo();

        user1.withdraw(3000000);
        user2.withdraw(10000000);
        user1.printAccountInfo();
        user2.printAccountInfo();
    }
}

class BankAccount{
    private String accountHolder;
    private String accountNumber;
    private int balance;
    public BankAccount(String accountHolder, String accountNumber, int balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(int money){
        this.balance += money;
    }
    void withdraw(int money){
        this.balance -= money;
    }
    void printAccountInfo(){
        System.out.println("---------------------------");
        System.out.println("계좌 번호 : " + accountNumber);
        System.out.println("계좌의 소유자 : " + accountHolder + " 님");
        System.out.println("잔액 : " + balance + "원");
        System.out.println("---------------------------");
    }
}
