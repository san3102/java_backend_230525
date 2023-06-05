package day5.composition;

public class Composition {
    public static void main(String[] args) {
        홍길동 a홍길동 = new 홍길동();
        a홍길동.자바();
        a홍길동.c언어();
        a홍길동.파이썬();


    }
}

class 길동회사{
    홍길동 a홍길동 = new 홍길동();
    홍길순 a홍길순 = new 홍길순();
}

class 홍길동{
    홍길순 a홍길순 = new 홍길순();
    public void 자바(){
        System.out.println("자바20 프로그래밍");
    }
    public void c언어(){
        System.out.println("C언어");
    }
    public void 파이썬(){
        a홍길순.파이썬();
    }
}

class 홍길순{
    public void 자바() {
        System.out.println("자바17 프로그래밍");
    }
    public void 파이썬(){
        System.out.println("파이썬");
    }
}
