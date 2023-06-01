package day5;

public class Static1 {
    public static void main(String[] args) {

        // static은 자원의 공유를 위해 사용, 모든 객체가 하나의 자원을 공유
        // static은 객체지향을 위반한다.

        Person p1 = new Person();
        p1.no = 1;
        p1.age = 28;
        p1.name = "홍길동";

        Person p2 = new Person();
        p2.no = 2;
        p2.age = 22;
        p2.name = "이순신";

        p1.introduce();
        p2.introduce();
        Person.introduce(); // static 메서드는 객체화 하지않고 클래스에서 바로 기능을 수행가능 -> new로 객체를 안만들어줘도 메서드는 사용가능.

        // static은 static 자원만 사용 가능
        // non-static은 static 사용가능

        // 변수든 메서드든 굳이 static을 붙여서 사용하지 않아도 거의 모든 작업이가능
        // 유틸 클래스같은 경우는 static을 붙여서 사용하면 편하긴함
    }
}

class Person{
    int no;     // 번호
    int age;    // 나이
    String name; // 이름

    public static void introduce(){
//        System.out.printf("%d번 %s입니다!\n", no, name);
        System.out.println("hi");
    }
}
