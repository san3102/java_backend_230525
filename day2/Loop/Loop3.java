package day2.Loop;

public class Loop3 {
    public static void main(String[] args) {
        int n = 4; // 시작
        int m = 20; // 끝
        int limit = 10; // 곱의 개수

        if(n % 2 == 0){
            n = n+1;
        }

        for(int i = n; i < m; i+=2){
            for(int j = 2; j <= limit; j+=2){
                System.out.printf("%d * %d = %d\n", i, j, i*j);
            }
        }

        int y = 7;
        int count = 1;

        for(int i = 0; i < y; i++) {
            for(int j = 0; j < count; j++){
               System.out.printf("*");
           }
            count += 2;
           System.out.println("");
        }
    }
}
