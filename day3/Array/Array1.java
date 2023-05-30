package day3.Array;

public class Array1 {
    public static void main(String[] args) {
        // 변수 선언
        int f;

        // 변수 초기화
        f = 10;

        // 변수 선언 및 초기화
        int g = 10;

        // 배열 선언
        int[] arr = new int[5];

        // 배열 초기화
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        // 배열 선언 및 초기화
        int[] arr2 = {10,20,30,40,50}; // 길이 지정 x

        System.out.println(arr[0]); // 배열의 시작은 0이다.
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        // 배열을 사용하면 일괄처리가 쉽다.
        for(int i = 0; i< 5; i++){
            System.out.println(arr[i]);
        }
    }
}
