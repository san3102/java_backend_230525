package day8.generic.generic2;

public class generic2 {
    public static void main(String[] args) {
        // 3개의 자료형을 저장하기 위해 3개의 class를 만들었습니다. 그러나 저장소의 기능이 다 동일하므로 하나의 class만 만들어 3 자료형을 모두 저장하고 싶습니다. 가능하게 구현해주세요.

        통합저장소 a저장소1 = new 통합저장소();
        통합저장소 a저장소2 = new 통합저장소();
        통합저장소 a저장소3 = new 통합저장소();
        통합저장소 a저장소4 = new 통합저장소();


        a저장소1.setData(30);
        Object a = a저장소1.getData();
        System.out.println(a);

        a저장소2.setData(5.5);
        Object b = a저장소2.getData();
        System.out.println(b);

        a저장소3.setData(new 사과());
        Object apple = a저장소3.getData();
        System.out.println(apple);

        // 아래처럼 Object로 받아서 모든 타입을 저장하는 방식은 거의 사용하지않음
        // 타입을 정해놓고 사용하는게 좋다.
        a저장소4.setData(10);
        a저장소4.setData(5.5);
        a저장소4.setData(new 사과());

        사과 d = (사과)a저장소4.getData(); // Object가 사과보다 상위타입이기 때문에 (사과) 수동 형변환.

        통합저장소<Integer> a저장소5 = new 통합저장소<Integer>(); // 이와 같이 타입을 정해놓고 사용하는게 좋다.
        a저장소5.setData(10);
    }
}
class 통합저장소<T>{
    T data;
    void setData(T data){
        this.data = data;
    }
    public T getData() {
        return (T)this.data;
    }
}
//class ArrayList<E>{
//    private E[] data;
//    public void addData(E data){
//
//    }
//}
class 사과{}
class Int저장소 {
    Object data;

    int getData() {
        return (int)data;
    }

    void setData(Object inputedData) {
        this.data = inputedData;
    }
}

class Double저장소 {
    Object data;

    double getData() {
        return (double)data;
    }

    void setData(Object inputedData) {
        this.data = inputedData;
    }
}
class 사과저장소 {
    Object data;

    사과 getData() {
        return (사과)data;
    }

    void setData(Object inputedData) {
        this.data = inputedData;
    }
}