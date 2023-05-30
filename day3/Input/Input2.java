package day3.Input;

import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 숫자 입력
//        int num = scan.nextInt();
//        System.out.println("출력 : " + num);

        // 문자 한줄 입력
//        String str = scan.nextLine();
//        System.out.println("출력 : " + str);

        // 단어 한개 입력
//        String str1 = scan.next();
//        System.out.println("출력 : " + str1);
//
//      // 단어 두개 입력
//        String str2 = scan.next();
//        String str3 = scan.next();
//        System.out.println("출력1 : " + str2);
//        System.out.println("출력2 : " + str3);

        // 숫자를 입력해서 해당 숫자의 구구단이 나오는 프로그램 작성
          System.out.printf("몇 단을 계산할지 입력 : ");
          int dan = scan.nextInt();
          for(int i = 1; i < 10; i ++){
              System.out.printf("%d * %d = %d\n", dan, i, dan*i);
          }
    }
}
