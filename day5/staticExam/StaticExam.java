package day5;

public class StaticExam {
    static int num = 10;
    public static void main(String[] args) {

        자동차.달리다();

        System.out.println(num); // 출력 : 10

        printValue("안녕");
        // 출력 : 안녕

        사람 a사람1 = new 사람();
        a사람1.이름 = "홍길동";
        a사람1.나이 = 22;

        a사람1.자기소개();
        // 출력 : 저는 22살 홍길동 입니다.

        사람 a사람2 = new 사람();
        a사람2.이름 = "홍길순";
        a사람2.나이 = 25;

        a사람2.자기소개();
        // 출력 : 저는 25살 홍길순 입니다.

        a사람1.자기소개();
        // 출력 : 저는 22살 홍길동 입니다.
    }

    public static void printValue (String a){
        System.out.println(a);
    }
}

class 자동차{
    public static void 달리다(){

    }
}

class 사람 {

    int 나이;
    String 이름;

    public void 자기소개() {
        System.out.println("저는 " + 나이 + "살 " + 이름 + " 입니다.");
    }
}
