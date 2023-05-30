package day3.Array;

import java.util.*;

public class Array2 {
    public static void main(String[] args) {
        // arr 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100을 저장하고 출력해주세요.
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        for(int a : arr){
            System.out.println(a);
        }
        System.out.println("---------------");

        // 배열을 두번 출력해주세요.
        for(int i = 0; i < 2; i++){
            for(int a : arr){
                System.out.println(a);
            }
        }
        System.out.println("---------------");

        // 배열을 이용해 5개의 숫자를 입력받고 출력해주세요.
        Random ran = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] arr2 = new int[5];
        for(int i = 0; i < 5; i++){
//            int a = ran.nextInt(100) + 1;
            int a = scanner.nextInt();
            arr2[i] = a;
            System.out.println(arr2[i]);
        }
        System.out.println("---------------");

        // 배열에 5개의 값을 입력하고 거꾸로 출력해주세요.
        for(int i = arr2.length-1; i >= 0; i--){
            System.out.println(arr2[i]);
        }
        System.out.println("---------------");

        // 배열을 이용해 5개의 문장을 입력받고 출력해주세요.
        String[] str1 = {"안녕, ","나는 ","java", "배우고", "있어"};
        for(int i = 0; i < str1.length; i++){
            System.out.println(str1[i]);
        }
    }
}
