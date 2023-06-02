package prac;

public abstract class Bird {
    public abstract void sing(); // 메서드가 하나라도 추상메서드이면 클래스는 무조건 추상클래스가 될 수 밖에없다.
    public void fly(){ // 추상클래스 내부에는 일반 메서드 구현가능
        System.out.println("날다~");
    }
}
