package day8.collections1;

import java.awt.datatransfer.ClipboardOwner;
import java.util.ArrayList;

public class ArrayListExam2 {
    public static void main(String[] args) {
        사람 사람1 = new 사람(20, "홍길동");
        사람 사람2 = new 사람(30, "이순신");
        사람 사람3 = new 사람(41, "을지문덕");
        사람 사람4 = new 사람(33, "황진이");

        // 1. 네 사람을 ArrayList에 저장
        // 2. 네 사람에게 자기소개 시키기
        // 3. 30대인 사람에게만 자기소개 시키기
        ArrayList<사람> list = new ArrayList<>();
        list.add(사람1);
        list.add(사람2);
        list.add(사람3);
        list.add(사람4);

        for(사람 person : list){
            person.introduce();
        }
        System.out.println();

        for(사람 person : list){
            if(person.getAge() >= 30 && person.getAge() < 40){
                person.introduce();
            }
        }
        System.out.println();
    }
}
class 사람{
    private int age;
    private String name;

    사람(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void introduce() {
        System.out.printf("%d살 %s입니다.\n", age, name);
    }

    int getAge() {
        return this.age;
    }

    String getName() {
        return this.name;
    }
}

