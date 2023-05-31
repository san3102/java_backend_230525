package day4.reference;

public class localVariable {
    public static void test(){
        int a = 10; // test()함수의 호출이 끝나는 순간 이 값은 사라짐
    }

    // 메인 메서드
    public static void main(String[] args) {
        {
            int a = 10; // 지역변수
            System.out.println(a);
        }

        // 지역변수 -> 자원관리, 문제의 범위를 지역으로 국한.
//        test();
//        System.out.println(a);

        // primitive type - 기본타입 8종(stack)
        // byte, char, short, int, long, float, double, boolean

        // reference type - 그 외(heap)
    }
}
