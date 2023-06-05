package day5.modifier;
import day5.modifier.test.Test;
public class AccessModifier1 { // 접근제어자
    public static void main(String[] args) {
        // 객체지향 3요소 - 캡슐화, 상속, 다형성
        Test2 t1 = new Test2();
        Test t2 = new Test();

        System.out.println(t1.num);
//        System.out.println(t2.num); // 20 -> 캡슐화 X
        t2.printNum(); // 20 -> 캡슐화 O
    }
}

class Test2{
    int num = 10;   // default 접근제어자
}