package Prac3.Duck1;

public class PracDuck {
    /*
    - D1 요구 : 오리를 생성하고 날게하시오.
    - D3 요구 : 오리 계열의 클래스에 날다 메서드가 중복되었습니다. 중복을 제거해주세요.
    - D4 요구 : 게임의 재미를 위하여 고무오리를 추가하고 날게 하시오.
    - D5 요구 : 주말 주주회의에서 고무오리가 하늘을 날아다니는 것에 대해서 태클이 들어왔습니다. 고무오리 계열은 하늘을 날 수 없게 해주세요.
    - D6 요구 : 고무오리가 반응이 좋습니다. 고무2오리를 추가하고 날게 해주세요.
    - D7 요구 : 새로운 기능인 헤엄치기를 추가하고 오리처럼 날고 고무오리처럼 헤엄치는 아수라 오리를 추가해주세요.
    */
    public static void main(String[] args) {
        오리 a오리 = new 오리();
        a오리.날다();
        a오리.헤엄치다();
        // 출력 : 오리가 날개로 날아갑니다.
        // 출력 : 오리가 오리발로 헤엄칩니다.

        청둥오리 a청둥오리 = new 청둥오리();
        a청둥오리.날다();
        a청둥오리.헤엄치다();
        // 출력 : 오리가 날개로 날아갑니다.
        // 출력 : 오리가 오리발로 헤엄칩니다.

        흰오리 a흰오리 = new 흰오리();
        a흰오리.날다();
        a흰오리.헤엄치다();
        // 출력 : 오리가 날개로 날아갑니다.
        // 출력 : 오리가 오리발로 헤엄칩니다.

        고무오리 a고무오리 = new 고무오리();
        a고무오리.날다();
        a고무오리.헤엄치다();
        //출력 : 저는 날 수 없어요. ㅜㅠ
        // 출력 : 오리가 둥둥 떠다닙니다.

        고무2오리 a고무2오리 = new 고무2오리();
        a고무2오리.날다();
        a고무2오리.헤엄치다();
        // 출력 : 저는 날 수 없어요. ㅜㅠ
        // 출력 : 오리가 둥둥 떠다닙니다.

        아수라오리 a아수라오리 = new 아수라오리();
        a아수라오리.날다();
        a아수라오리.헤엄치다();
        // 출력 : 오리가 날개로 날아갑니다.
        // 출력 : 오리가 둥둥 떠다닙니다.
    }
}
class 오리 {
    public void 날다() {
        System.out.println("오리가 날개로 날아갑니다.");
    }
    public void 헤엄치다(){
        System.out.println("오리가 오리발로 헤엄칩니다.");
    }
}
class 청둥오리 extends 오리{

}
class 흰오리 extends 오리{

}
class 고무오리 extends 오리{
    public void 날다(){
        System.out.println("저는 날 수 없어요. ㅜㅠ");
    }
    public void 헤엄치다(){
        System.out.println("오리가 둥둥 떠다닙니다.");
    }
}
class 고무2오리 extends 고무오리{

}
class 아수라오리 extends 고무오리{
    public void 날다(){
        System.out.println("오리가 날개로 날아갑니다.");
    }
}
