package prac;

import java.util.*;
import com.cruz.javaPrac.*; // 해당 패키지 내의 클래스를 사용하기 위해 import

public class Prac1 {
    public static void main(String[] args) {
        // Car.java 클래스 활용
//        Car c2 = new Car("소방차");
//        Car c3 = new Car("구급차");
//
//        System.out.println(c2.name);

        // MyClass1 클래스 활용
//        MyClass1 m = new MyClass1();
//
//        System.out.println(m.plus(4, 5));
//        System.out.println(m.plus(3, 4, 5));
//        System.out.println(m.plus("hi", " everyone!"));

        // 다른 패키지 내의 클래스 사용
//        Hello hello = new Hello();
//        hello.Say();

        // Class 상속 -> 부모 클래스는 자식이 갖고있는 것을 사용할 수 없음
//        Bus bus = new Bus();
//        bus.run();
//        bus.ppang();
//
//        Car car = new Car();
//        car.run();

        // 접근제한자 간단예시
//        MyClass1 my = new MyClass1();
//        System.out.println(my.p);
//        System.out.println(my.p2);
//        System.out.println(my.i);  // private 제한자이기 때문에 불가능
//        System.out.println(my.k);

        // 추상클래스
//        Bird b = new Bird(); // 추상클래스이기 때문에 객체 생성불가
//        Duck duck = new Duck();
//        duck.sing();
//        duck.fly();

        // super와 부모생성자
//        Bus b = new Bus(); // Bus의 생성자만 생기는 것이 아닌 부모클래스의 생성자도 생기고 우선시 된다.

        // Overriding
//        Bus bus = new Bus();
//        bus.run();

        // Class 형변환
//        Car c = new Bus(); // 부모타입으로 자식객체를 참조가능
//        c.run();
////        c.ppang(); // 부모 타입으로 자식객체 참조했을 때, 부모타입이 갖고있는것만 사용가능
//        Bus bus = (Bus)c; // Car타입으로 만든 객체를 다시 Bus타입으로 변경
//        bus.run();
//        bus.ppang();
    }
}
