package day5.inheritance;

public class Inheritance1 {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.meow();
        c1.move();

        Dog d1 = new Dog();
        d1.bark();
        d1.move();

        // 클래스 안에서 중복된 코드가 발생하는 경우가 있다.
        // 상속 -> 더 상위 개념을 만들어라 (코드를 전부 물려받는다.)

    }
}

class Animal{
    public void move(){
        System.out.println("움직입니다 ~");
    }
}
class Cat extends Animal{
    public void meow(){
        System.out.println("야옹");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("멍멍");
    }
}