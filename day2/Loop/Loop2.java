package day2.Loop;

public class Loop2 {
    public static void main(String[] args) {
        // 2중 반복문
        // 1~5 10번 출력

//        for(int i = 1; i<= 10; i++){
//            System.out.println("--" + i + "--" );
//            for(int j =1; j <= 5; j++) {
//                System.out.println(j);
//            }
//        }

        // 구구단

        for(int i = 1; i < 10; i++){
            System.out.println(i + "단");
            for(int j = 1; j < 10; j++){
//                System.out.println(i + " * " + j + " = " + i*j);
                System.out.println(String.format("%d * %d = %d", i, j, i*j));
            }
        }

        String first = "홍";
        String second = "길동";
        int age = 24;
        String country = "Korea";

        System.out.println("제 이름은 " + first + second + "이고, 나이는 " + age + "이며, " + country + "에 살고 있습니다.");
        System.out.printf("제 이름은 %s%s이고, 나이는 %d이며, %s에 살고 있습니다.", first, second, age, country);
    }
}
