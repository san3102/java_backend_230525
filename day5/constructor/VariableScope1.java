package day5.constructor;

public class VariableScope1 {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.a = 20;
        t1.print();

        Test t2 = new Test();
        t2.a = 30;
        t2.print();
    }
}

class Test{
    int a = 10; // 객체 변수
    public void print(){
        int a = 100;
        System.out.println("지역변수 : " + a); // 동일한 이름의 변수가 2개이면 자신의 변수를 우선적으로 사용.
        System.out.println("객체변수 : " + this.a); // this <- print함수를 사용하고 있는 객체 자신
    }
}
