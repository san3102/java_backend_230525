package day7.constructorOverriding;

public class ReplitExam {
    public static void main(String[] args) {
        System.out.println("== 사람객체 생성시작 ==");
        new 사람2();
        System.out.println("== 사람객체 생성끝 ==");

        System.out.println("== 청둥오리객체 생성시작 ==");
        new 청둥오리();
        System.out.println("== 청둥오리객체 생성끝 ==");
		/* 출력
		== 청둥오리객체 생성시작 ==
		생물이 생성되었습니다.
		동물이 생성되었습니다.
		오리가 생성되었습니다.
		청둥오리 생성되었습니다.
		== 청둥오리객체 생성끝 ==
		*/

        // 문제 : 아래가 오류없이 실행되도록 해주세요.
        // 조건 : 사람 클래스만 수정할 수 있습니다.
        new 사람3();

        // 문제 : 아래와 같이 출력되도록 해주세요. init() 메세드에 의해서 출력되어야 합니다.
        // 조건 : 사람 클래스의 생성자는 사용할 수 없습니다, 동물 클래스를 수정하여 문제를 풀어주세요.
        // 힌트 : 모든 생성자는 자신의 일을 하기 전에 super(); 부터 실행합니다.
        // 힌트 : 모든 생성자는 자신의 일을 하기 전에 부모클래스의 생성자 부터 실행합니다.
        new 사람4();
        // 출력 : 사람이 초기화 됩니다.
    }
}
class 생물 {
    생물() {
        // 이 함수는 부모 클래스 생성자를 자동으로 호출합니다.
        System.out.println("생물이 생성되었습니다.");
    }
}
class 동물 extends 생물 {
    동물() {
        // super(); // 부모 클래스의 생성자를 호출합니다. 생략가능합니다.
        // 이 함수는 부모 클래스 생성자를 자동으로 호출합니다.

        System.out.println("동물이 생성되었습니다.");
    }

}
class 사람2 extends 동물 {

    사람2() {
        super(); // 부모 클래스의 생성자를 호출합니다.
        // 이 함수는 부모 클래스 생성자를 자동으로 호출합니다.

        System.out.println("사람이 생성되었습니다.");
    }
}
class 오리 extends 동물{
    오리(){
        System.out.println("오리가 생성되었습니다.");
    }
}
class 청둥오리 extends 오리{
    청둥오리(){
        System.out.println("청둥오리가 생성되었습니다.");
    }
}

class 동물2 {
    // 동물2() {} 기본 생성자는 클래스내부에 생성자가 하나도없을때 자바가 알아서 생성해줌
    동물2(String 이름) { // 매개변수가 있는 생성자라도 있는경우 자바는 동물2(){} 기본생성자를 생성해주지 않는다.
        System.out.println("동물(String 이름) 실행됨!");
        System.out.println("이름 : " + 이름);
    }
    동물2(String 이름, int 나이) {
        System.out.println("동물(String 이름, int 나이) 실행됨!");
        System.out.println("이름 : " + 이름);
        System.out.println("나이 : " + 나이);
    }
}
class 사람3 extends 동물2 {
    사람3(){
        super("홍길동", 26); // 부모 생성자가 모두 매개변수를 받는 생성자이기 때문에 super에서 매개변수에 맞게 넣어주어야 동작함.
    }
}

class 동물3 {
    // 수정가능지역 시작
    동물3(){
        init();
    }
    void init(){}
    // 수정가능지역 끝
}
class 사람4 extends 동물3{
    void init() {
        System.out.println("사람이 초기화 됩니다.");
    }
}