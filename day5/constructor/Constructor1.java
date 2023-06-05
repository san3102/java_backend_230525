package day5.constructor;

public class Constructor1 {
    public static void main(String[] args) {

        // 객체를 만들면 반드시! 데이터를 넣어줘야 한다.(초기화)
        Person2 p1 = new Person2(1, 21, "홍길동");

        // 객체 초기화
        // 1. 객체 초기화 불편, 귀찮.
        // 2. 초기화를 까먹는다.

        // >> 해결방안으로 생성자를 사용

//        p1.no = 1;
//        p1.age = 21;
//        p1.name = "홍길동";

        Person2 p2 = new Person2(2, 32, "홍길순");
//        p2.no = 2;
//        p2.age = 32;
//        p2.name = "홍길순";

        p1.introduce();
        p2.introduce();

    }
}

class Person2{
    int no;
    int age;
    String name;

    // 생성자 -> 메서드(함수)의 일종
    // 1. 리턴 타입 자체가 X
    // 2. 메서드이름을 꼭! 클래스명과 동일하게 지어야 함.
    // 3. 이 메서드는 반드시 실행됨.

    public Person2(int no, int age, String name){
        System.out.println("사람이 한명 생성됨.");
        System.out.println("번호 : " + no);
        System.out.println("나이 : " + age);
        System.out.println("이름 : " + name);
        this.no = no;
        this.age = age;
        this.name = name;
    }

    // 처리
    public void introduce(){
        System.out.printf("안녕하세요, %d살 %d번 %s입니다.\n", age, no, name);
    }
}

