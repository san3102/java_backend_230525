package day8.generic.generic1;

public class generic {
    public static void main(String[] args) {

//        사람 a사람 = new 사람();
//        int i = 10;
//        Object o = a사람;
//        o = i;  // 10이 그냥 들어가는게 아니고 객체화 되서 들어간다.
//        Integer io = Integer.valueOf(10);        // int의 래퍼 클래스
//        Double o2 = Double.valueOf(1.5);         // double의 래퍼 클래스
//        o = io; // o에 i 를 직접 넣는 것이 아닌 Integer로 바꿔서 넣는게 맞다.

        저장소.저장(10);
        저장소.저장("안녕");
        저장소.저장(new 사람());
        저장소.저장(new 사과());
        저장소.저장(5.5);
        저장소.저장(false);
        저장소.저장('a');

        // 정수 계열
        byte b = 0; // 1바이트
        char c = 1; // 2바이트
        short s = 2; // 2바이트
        int i = 3; // 4바이트
        long l = 4; // 8바이트

        // 실수 계열
        // 4.1f => float 형 실수를 의미
        float f = 3.14f; // 4바이트
        // 3.141592 => double 형 실수를 의미
        double d = 3.141592; // 8 바이트

        // 논리 계열
        boolean bl = false; // 1/8 바이트, 1비트

        저장소.저장(b);
        저장소.저장(s);
        저장소.저장(c);
        저장소.저장(i);
        저장소.저장(l);
        저장소.저장(f);
        저장소.저장(d);
        저장소.저장(bl);
    }
}
class 저장소{
    public static <T> void 저장(T data){
        System.out.println(data + " 작동확인");
    }
}
class 사람 {
    public String toString(){
        return "사람클래스";
    }
}
class 사과 {
    public String toString(){
        return "사과클래스";
    }
}

