package exam;

public class exam1 {
    public static void main(String[] args) {
        // 문제 1
        int num1 = 15;
        int num2 = 4;
        System.out.printf("num1을 num2로 나눈 몫은 %f입니다.\n", (float)num1 / num2);

        // 문제 2
        int a1 = 10;
        int a2 = a1;
        System.out.printf("a2는 a1과 같은 값 %d 입니다.\n", 10);

        // 문제 3
        for(int num = 1; num <= 5; num++){
            System.out.println(num);
        }

        // 문제 4
        String str1 = "hello";
        String str2 = "world";
        System.out.println(str1 + ", " + str2);

        // 문제 5
        float[] arr = new float[10];
        System.out.println(arr.length);

        // 문제 6
        Dog dog1 = new Dog(5, "Max");
        System.out.printf("%d살 강아지 %s\n", dog1.age, dog1.name);

        // 문제 7
        Dog.classInfo();
        dog1.bark();
    }
}
class Dog{
    public String name;
    public int age;
    Dog(int age, String name){
        this.age = age;
        this.name = name;
    }
    public static void classInfo(){
        System.out.println("이름과 나이를 이용해 Dog를 만드는 Dog Class 입니다.");
    }

    void bark(){
        System.out.printf("%s가 멍멍하고 짖습니다.\n", this.name);
    }
}
