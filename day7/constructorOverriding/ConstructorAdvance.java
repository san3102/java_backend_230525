package day7.constructorOverriding;
import java.util.*;
public class ConstructorAdvance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Person person1 = new Person(1, 20, "홍길동");
        person1.introduce();
        person1.introduce(1);


    }
}

class Person{
    int num;
    int age;
    String name;

    // 같은 이름으로 메서드나 생성자를 여러개 만드는 것 -> 오버로딩
    // 조건 : 매개변수의 갯수, 매개변수의 타입
    Person(int num){
        this.num = num;
    }
    Person(int num, int age, String name){
        this.num = num;
        this.age = age;
        this.name = name;
    }

    void introduce(){
        System.out.printf("%d살 %s입니다.\n", age, name);
    }

    void introduce(int a){
        System.out.println("HI!");
    }
}
