package day8.generic2;

public class generic2 {
    public static void main(String[] args) {
        // 3개의 자료형을 저장하기 위해 3개의 class를 만들었습니다. 그러나 저장소의 기능이 다 동일하므로 하나의 class만 만들어 3 자료형을 모두 저장하고 싶습니다. 가능하게 구현해주세요.

        통합저장소 a저장소1 = new 통합저장소();
        통합저장소 a저장소2 = new 통합저장소();
        통합저장소 a저장소3 = new 통합저장소();

        a저장소1.setData(30);
        Object a = a저장소1.getData();
        System.out.println(a);

        a저장소2.setData(5.5);
        Object b = a저장소2.getData();
        System.out.println(b);

        a저장소3.setData(new 사과());
        Object apple = a저장소3.getData();
        System.out.println(apple);
    }
}
class 통합저장소{
    Object data;
    public <T> void setData(T data){
        this.data = data;
    }
    public Object getData() {
        return data;
    }
}
//class ArrayList<E>{
//    private E[] data;
//    public void addData(E data){
//
//    }
//}
class 사과{}