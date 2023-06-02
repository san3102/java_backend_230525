package prac;

public class Bus extends Car {
    /*
    public void ppang(){
        System.out.println("빵빵");
    }

     */ // main에서 Bus 상속 부분 코드

    /*
    public Bus(){
//        super(); // 자식의 생성자가 생성될 때 부모의 기본생성자도 자동생성되는 코드, 일반적으로 따로 super()를 쓰지 않아도 Java에서 기본적으로 생성해줌.
        super("Car"); // 하지만 부모의 생성자가 기본생성자가 아닐때에는 반드시 직접 호출해줘야함.
        System.out.println("Bus의 기본 생성자입니다. ");
    }

     */ // main super() 키워드부분

    /*
    public void run(){
        super.run(); // super()를 통해 오버라이딩 된 부모의 메서드도 실행가능
        System.out.println("Bus의 run 메서드");
    }

     */ // main Overriding 부분

    /*
    public void ppang(){
        System.out.println("빵빵!");
    }

     */ // 클래스 형변환
}
