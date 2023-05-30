package day3.Function;

public class function2 {
    public static void greeting1(int a){
        if(a == 1){
            System.out.println("안녕~");
        } else if (a == 2) {
            System.out.println("하이");
        }else{
            System.out.println("봉쥬");
        }
    }
    public static void greeting2(int a, int b){
       for(int i = 0; i < b; i++){
           greeting1(a);
       }
    }
    public static void main(String[] args) {
        // 프로그래밍을 잘하고 싶다 -> 코드들의 중복을 없앤다.

        // 매개변수는 인사말 언어를 의미
        // 1은 한국어, 2는 영어, 3은 프랑스어

        greeting1(2);
        greeting1(3);
        greeting1(1);

        // 첫번째는 언어, 두번째는 횟수를 의미

        greeting2(1, 3);
        greeting2(2, 5);
        greeting2(3, 7);
    }
}
