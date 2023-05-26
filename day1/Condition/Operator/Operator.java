package day1.Condition.Operator;

public class Operator {

    public static void main(String[] args) {
        //  산술연산 ( +, -, *, /, % )
        System.out.println(10 / 3);     // 정수와 정수의 계산 결과 -> 정수, 실수와 실수 계산 결과 실수
        System.out.println(10.0 / 3.0);

        //  비교연산 ( <, >, <=, >=, =, ! )
        //  겨로가 참(true), 거짓(false) -> 논리값(불리언)
        System.out.println(10 > 5);
        System.out.println(10 < 5);
        System.out.println(true);
        System.out.println(false);

        //  논리연산
        //  and - 모두 참일 때만 참, 나머진 거짓
        //  or - 모두 거짓일 때만 거짓, 나머진 참
        System.out.println(true && false);
        System.out.println(true && true);
        System.out.println(false || false);
        System.out.println(true || false);
        System.out.println(true || true);

        System.out.println(true || false && 10 < 5);
        System.out.println("------------------------------");

        if ( true ) {
            System.out.println(true);
        }

        if ( false ) {
            System.out.println(false);
        }

        int a = 10;
        // `==` => 같다.
        if ( a == 10 ) {
            System.out.println(true);
        }

        // `!=` => 같지 않다.
        if ( a != 10 ) {
            System.out.println(false);
        }

        if ( a > 10 ) {
            System.out.println(false);
        }

        if ( a >= 10 ) {
            System.out.println(true);
        }

        int b = 10;

        if ( a == b ) {
            System.out.println(true);
        }

        //boolean c => c 에는 오직 true/false 만 담을 수 있다.

        boolean c = a != b;

        if ( c ) {
            System.out.println(false);
        }

        if ( c == false ) {
            System.out.println(true);
        }

        // `!` => 반전
        if ( !c ) {
            System.out.println(true);
        }

        // `!` => 반전
        if ( !(!c) ) {
            System.out.println(false);
        }

        boolean d = true;

        if ( c != d ) {
            System.out.println(true);
        }


    }

}
