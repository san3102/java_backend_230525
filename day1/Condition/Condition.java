package day1.Condition;

import java.util.Random;

public class Condition {

    public static void main(String[] args) {

        // 실행이 될 때도 있고 안될 때도 있다. if(조건문)

        System.out.println("코드1");

        // 만약 변수 a의 값이 1이면
        int a = 1;

        if(a == 1) {
            System.out.println("코드2");
            System.out.println("코드3");
        }
        System.out.println("코드4");

        // 날씨에 따른 인삿말.
        // 1. 비  2. 맑음  3. 미세먼지
        Random ran = new Random();

        int weather = ran.nextInt(3) + 1;

        System.out.println(weather);
        if(weather == 2) {
            System.out.println("안녕하세요. 날씨가 맑군요. 날들이 나가세요.");
        }else if(weather == 1) {
            System.out.println("안녕하세요. 비가 많이 오네요. 우산챙겨나가세요");
        }else if(weather == 3){
            System.out.println("안녕하세요. 오늘은 미세먼지가 심합니다. 마스크 꼭 쓰세요.");
        }

        // num이 짝수면 even, 홀수면 odd 출력해주세요.
        // 짝수 판별 : 2로 나누어서 떨어지면 짝수

        int num = ran.nextInt(100) + 1;
        if(num % 2 == 0){
            System.out.printf("num은 %d이므로 even%n", num);
        }else{
            System.out.printf("num은 %d이므로 odd%n", num);
        }

        // 두수 num1과 num2가 주어집니다.
        // 두 수중 더 큰수에서 더 작은 수를 뺀 결과를 출력해주세요.

        int num1 = ran.nextInt(100) + 1;
        int num2 = ran.nextInt(100) + 1;

        if(num1 > num2){
            System.out.printf("%d - %d = %d%n", num1, num2, num1 - num2);
        }else if(num1 < num2){
            System.out.printf("%d - %d = %d%n", num2, num1, num2 - num1);
        }else{
            System.out.println("두 값이 동일하므로 0");
        }

        // 문제 : 할인 대상인지 아닌지 출력해주세요.
        // 조건 : 나이가 19세 이하이거나 60세 이상이면 할인 대상입니다.
        // 조건 : 출력예시 처럼 출력되어야 합니다.
        // 조건 : `구현시작` 부분만 수정 할 수 있습니다..
        // 조건 : 2가지 이상의 방법으로 풀어야 합니다.

        int age = 18;

        System.out.println("당신의 나이는 " + age + "살 입니다.");

        if(19 >= age && 60 <= age){
            System.out.println("할인 대상입니다.");
        }else {
            System.out.println("할인 대상이 아닙니다.");
        }

    }

}
