package day3.Input;

import java.util.*;
public class Input3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("첫번째 숫자를 입력해주세요 : ");
        int num1 = scan.nextInt();
        System.out.printf("두번째 숫자를 입력해주세요 : ");
        int num2 = scan.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));

        System.out.printf("몇 단을 계산할지 입력 : ");
        int dan = scan.nextInt();
        for(int i = 1; i < 10; i ++){
            System.out.printf("%d * %d = %d\n", dan, i, dan*i);
        }

        scan.nextLine();    // 전에 입력받았을 때 엔터(\n)을 빼줌
        System.out.printf("이름을 입력해주세요 : ");
        String name = scan.nextLine();
        System.out.printf("나이를 입력해주세요 : ");
        int age = scan.nextInt();
        System.out.println("안녕하세요 " +  age + "세 " + name + "입니다.");
    }
}
