package day3.Function;

public class function3 {
    public static boolean isEven(int num) {
        if(num % 2 == 0){
            return true;
        }
        return false;

    }

    public static void printEven(int n) {
        for(int i=1; i <= n; i++){
            if(isEven(i)){
                System.out.printf("%d ", i);
            }
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        printEven(10); // 출력: 2 4 6 8 10
        printEven(20); // 출력: 2 4 6 8 10 12 14 16 18 20
        printEven(5); // 출력: 2 4
    }
}
