package day2.function;

public class Function1 {
    public static void test(){
        System.out.println("hi");
        System.out.println("hello");
        System.out.println("안녕");
    }

    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        // 변수 : 동일한 값을 재사용
        // 함수 : 동일한 코드를 재사용
        test();
        System.out.println(add(3, 5));

    }
}
