package day4.reference;

public class PrimitiveVsReference {
    public static void main(String[] args) {

        //
        String str1 = new String("Hello world");
        String str2 = new String("Hello world");

        System.out.println(str1);
        System.out.println(str1 == str2);

        if(str1 == str2){
            System.out.println("str1과 str2는 같은 인스턴스를 참조합니다.");
        }
        else{
            System.out.println("str1과 str2는 다른 인스턴스를 참조합니다.");
        }
    }
}
