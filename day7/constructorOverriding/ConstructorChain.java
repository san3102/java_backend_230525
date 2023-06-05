package day7.constructorOverriding;

public class ConstructorChain {
    public static void main(String[] args) {
        // 모든 객체는 생성자를 호출해서 만든다.
        // 생성자 연쇄호출 -> 자식 객체를 만들 때 부모 생성자를 먼저 호출

        new Animal(); // Animal 생성자 호출
        new Dog(); // Dog 생성자 호출
    }
}

class Animal{
    Animal(){
        System.out.println("Animal 생성자 호출");
    }
}
class Mammalia extends Animal{
    Mammalia(int age){
        System.out.println("Mammalia 생성자 실행 " + age);
    }
}
class Dog extends Mammalia{
    Dog(){
//        Mammalia(); // 부모를 언급할 때는 클래스 이름으로 언급 X, 부모를 언급하는 키워드 super
        super(10); // 부모생성자를 호출할 때, 무보 생성자 오버로딩에 유의한다.
        System.out.println("Dog 생성자 호출");
    }
}
