package day8.exception1;

public class Exception1 {
    public static void main(String[] args) {
//        int[] arr = new int[2];
//
//
//        // 예외 상황을 염두에 두고 처리 -> 예외 처리
//        try{
//            // 예외가 발생할 만한 코드 작성
//            arr[0] = 1;
//            arr[1] = 2;
//            arr[2] = 3;
//        }
//        catch (ArrayIndexOutOfBoundsException error1){
//            // 해당 예외가 발생했을 때 처리 방법
//            System.out.println("배열에 값 똑바로 넣으세요.");
//        }
//
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);

        // 예외를 위임
        test();
    }
    public static void test() throws ArrayIndexOutOfBoundsException{
        int[] arr = new int[2];
        // 예외 상황을 염두에 두고 처리 -> 예외 처리
        // 예외가 발생할 만한 코드 작성
            arr[0] = 1;
            arr[1] = 2;
            arr[2] = 3;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
