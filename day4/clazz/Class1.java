package day4.clazz;


// 클래스 이름은 파스칼 표기법
public class Class1 {

    // 이름 짓는 법 -> 카멜표기법, 파스칼 표기법 ( 동작엔 이상이 없지만 개발자들간의 약속같은거 )
    // 메서드, 변수 -> 카멜표기법
    public static void printPersonInfo(int age, int height, int weight){
        System.out.println(age);
        System.out.println(height);
        System.out.println(weight);
        System.out.println("");
    }

    public static void printPersonInfo2(int[] person){
        System.out.println(person[0]);
        System.out.println(person[1]);
        System.out.println(person[2]);
        System.out.println("");
    }
    public static void main(String[] args) {
        // 정보 3개 -> 나이, 키, 몸무게

        // 1. 그냥
        System.out.println(20);
        System.out.println(170);
        System.out.println(60);
        System.out.println("");

        // 2. 변수 사용
        int age = 20;
        int height = 170;
        int weight = 60;

        int age2 = 30;
        int height2 = 160;
        int weight2 = 58;

        System.out.println(age);
        System.out.println(height);
        System.out.println(weight);
        System.out.println("");

        printPersonInfo(age, height, weight);
        printPersonInfo(age2, height2, weight2);

        // 3. 배열
        int[] person1 = {20, 170, 60};
        int[] person2 = {30, 160, 58};

        printPersonInfo2(person1);

        // 4. 클래스 사용해서 객체 만들기 -> 내가 표현하고자 하는 대상을 정의해서 자바한테 알려주기
        // 사용자 전용 배열 만들기

        // 개발자 1이 생각한 사람
        String name3 = "홍길동";
        String address = "서울";
        double height3 = 176.9;

        // 클래스를 이용해 객체 만들기
        Person hong = new Person();

        hong.name = "홍길동";
        hong.address = "서울";
        hong.height = 176.9;

        System.out.println(hong.name);
        System.out.println(hong.address);
        System.out.println(hong.height);
        hong.introduce();

        System.out.println("");

        // 개발자 2가 생각한 사람
        String name4 = "홍길동";
        int age4 = 30;
        double height4 = 182.1;

        Person2 hong2 = new Person2();
        hong2.name = "홍길동";
        hong2.age = 30;
        hong2.height = 182.1;

        System.out.println(hong2.name);
        System.out.println(hong2.age);
        System.out.println(hong2.height);
        System.out.println("");

        Person lee = new Person();
        lee.name = "이순신";
        lee.height = 183.5;
        lee.address = "서울";
        lee.introduce();


    }
}

class Person{
    String name;        // 사람 이름
    String address;     // 사람 주소
    double height;      // 사람 키
    public void introduce(){
        System.out.printf("저는 %s입니다. 키는 %.1fcm, %s에 살고 있습니다.\n", name, height, address);
    }
}

class Person2{
    String name;
    int age;
    double height;
}