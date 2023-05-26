package day2.function;

public class Function2 {
    public static void print(int a){
        System.out.println(a);
    }

    public static void greeting(int a, int b){
        for(int i = 0; i < b; i++) {
            if (a == 1) {
                System.out.println("안녕하세요");
            } else if (a == 2) {
                System.out.println("하이~");
            } else {
                System.out.println("봉주르~");
            }
        }
    }

    public static boolean isNegative(int a){
        if(a < 0){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isEven(int num) {
        if(num % 2 == 0) {
            return true;
        }else{
            return false;
        }
    }

    public static void printEven(int n) {
        if(isEven(n)){
            for(int i = 1; i <= n; i +=2) {
                System.out.printf("%d ",i+1);
            }
            System.out.println("");
        }else{
            for(int i = 1; i < n; i +=2){
                System.out.printf("%d ", i+1);
            }
            System.out.println("");

        }
    }
    public static void main(String[] args) {
        print(4); // 출력: 4
        print(10); // 출력: 10
        print(100); // 출력: 100

        greeting(1, 3);
        greeting(2, 5);
        greeting(3, 7);

        int no = 7;
        if(isNegative(no)) {
            System.out.println("음수입니다.");
        } else {
            System.out.println("양수입니다.");
        }

        printEven(10); // 출력: 2 4 6 8 10
        printEven(20); // 출력: 2 4 6 8 10 12 14 16 18 20
        printEven(13); // 출력: 2 4

    }
}
