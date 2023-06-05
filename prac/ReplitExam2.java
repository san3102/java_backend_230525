package prac;

public class ReplitExam2 {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        String 이름 = "칸";
        a전사.이름 = 이름;
        a전사.나이 = 20;
        a전사.자기소개();

        a전사.나이++;
        a전사.자기소개();

        a전사.나이 = 30;
        a전사.이름 = "카니";
        a전사.자기소개();

        전사 b전사 = new 전사();
        b전사.이름 = "칸나";
        b전사.나이 = 27;
        b전사.자기소개();

        a전사.a무기 = new 활();
        a전사.공격();
        a전사.공격1();
        a전사.스킬사용();
//         출력 : 카니가 활로 공격합니다.
        // 출력 : 카니가 활로 10의 데미지를 입힙니다.
        // 출력 : 불화살 스킬을 사용합니다. 1.5배의 피해를 입힙니다.
        a전사.a무기 = new 칼();
        a전사.공격();
        a전사.공격1();
        a전사.스킬사용();
//         출력 : 카니가 칼로 공격합니다.
        // 출력 : 카니가 칼로 15의 데미지를 입힙니다.
        // 출력 : 연속 베기 스킬을 사용합니다. 2배의 피해를 입힙니다.

//        활 a활 = new 활();
//        a활.사용(a전사.이름);
    }
}

class 전사{
    int 나이;
    String 이름;
    무기 a무기;
    void 자기소개(){
        System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
    }

//    void 공격(){
//        if(a무기 instanceof 활){
//            System.out.println(this.이름 + "가 활로 공격합니다.");
//        }else if(a무기 instanceof 칼){
//            System.out.println(this.이름 + "가 칼로 공격합니다.");
//        }
//    }
    void 공격(){
        a무기.사용(이름);
    }

    void 공격1(){
        a무기.사용2(이름);
    }
    void 스킬사용(){
        a무기.스킬사용();
    }

}
class 무기{
    void 사용(String 사용자명){

    }
    void 사용2(String 사용자명){

    }
    void 스킬사용(){

    }
}
class 활 extends 무기{
    int 데미지 = 10;
    String 스킬 = "불화살";
    void 사용(String 사용자명){
        System.out.printf("%s가 활로 공격합니다.\n", 사용자명);
    }
    void 사용2(String 사용자명){
        System.out.printf("%s가 활로 %d의 데미지를 입힙니다.\n", 사용자명, 데미지);
    }
    void 스킬사용(){
        System.out.printf("%s 스킬을 사용합니다. 1.5배(%.0f)의 피해를 입힙니다.\n", 스킬, 데미지 * 1.5);
    }
}
class 칼 extends 무기{
    int 데미지 = 15;
    String 스킬 = "연속 베기";
    void 사용(String 사용자명){
        System.out.printf("%s가 칼로 공격합니다.\n", 사용자명);
    }
    void 사용2(String 사용자명){
        System.out.printf("%s가 칼로 %d의 데미지를 입힙니다.\n", 사용자명, 데미지);
    }
    void 스킬사용(){
        System.out.printf("%s 스킬을 사용합니다. 2배(%.0f)의 피해를 입힙니다.\n", 스킬, 데미지 * 2.0);
    }
}

