package day7.variableOverriding;

public class VariableOverriding {
    public static void main(String[] args) {
        동물 동물1 = new 강아지("맥스");
        동물 동물2 = new 고양이("아리");
        동물 동물3 = new 거북이("도니");

        동물1.이동하다();
        동물2.이동하다();
        동물3.이동하다();
    }
}

class 동물{
    private String name;         // 변수는 각 클래스에서 만들어진 변수를 우선적으로 사용한다. 오버라이딩 적용 X
    private 이동방식 a이동방식;

    public void setName(String name){
        this.name = name;
    }
    public void set이동방식(이동방식 a이동방식){
        this.a이동방식 = a이동방식;
    }
    public String getName(){
        return name;
    }
    void 이동하다(){
        a이동방식.이동(name);
    }

}
class 고양이 extends 동물{
//    String name;                // 만약 자식클래스에 변수가 정의되지 않았을 경우엔 부모클래스에서 변수를 가져와 쓴다.
    고양이(String name){
        this.setName(name);
        set이동방식(new 고양이이동방식());
    }

//    void 이동하다(){
//        System.out.printf("%s 이/가 사뿐사뿐 이동합니다.\n", name);
//    }
}

class 강아지 extends 동물{

    강아지(String name){
        this.setName(name);
        set이동방식(new 강아지이동방식());
    }

//    void 이동하다(){
//        System.out.printf("%s 이/가 힘차게 이동합니다.\n", name);
//    }
}

class 거북이 extends 동물{
    거북이(String name){
        this.setName(name);
        set이동방식(new 거북이이동방식());
    }
}
class 이동방식{
    void 이동(String name){}
}
class 고양이이동방식 extends 이동방식{
    void 이동(String name){
        System.out.printf("%s 이/가 사뿐사뿐 이동합니다.\n", name);
    }
}
class 강아지이동방식 extends 이동방식{
    void 이동(String name){
        System.out.printf("%s 이/가 힘차게 이동합니다.\n", name);
    }
}
class 거북이이동방식 extends 이동방식{
    void 이동(String name){
        System.out.printf("%s 이/가 느릿느릿 이동합니다.\n", name);
    }
}