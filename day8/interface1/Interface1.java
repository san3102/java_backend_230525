package day8.interface1;

public class Interface1 {
    public static void main(String[] args) {
        전사 a전사 = new 전사();
        a전사.공격();

        사람 a사람 = new 사람();

        요리사 a요리사 = a사람;
        a요리사.조리();

        아버지 a아버지  = a사람;
        a아버지.애들케어();
    }
}
class 전사{
    무기 a무기 = new 칼();
    void 공격(){
        a무기.사용();
    }
}

// 구현과 형식을 분리(형식만)
interface 무기{
    // 추상메서드 -> 내용 없는 메서드(반드시 오버라이딩 해야됨)
    void 사용();
    void 무기정보();
    void 수리();
}
class 칼 implements 무기 {
    public void 사용(){
        System.out.println("칼로 공격");
    }
    public void 무기정보(){

    }
    public void 수리(){

    }
}
class 활 implements 무기 {
    public void 사용(){
        System.out.println("활로 공격");
    }
    public void 무기정보(){

    }
    public void 수리(){

    }
}

class 사람 implements 요리사, 아버지{
    public void 조리(){
        System.out.println("5성급 호텔 실력으로 조리합니다.");
    }
    public void 애들케어(){
        System.out.println("주말마다 애들과 놀아줍니다.");
    }
}
interface 요리사 {
    void 조리();
}
interface 아버지{
    void 애들케어();
}