package prac;

public class ReplitExam {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.id = 20;

        System.out.println("제 번호는 " + p1.id + " 입니다.");
        // 출력 : 제 번호는 20 입니다.


        // 문제 : 사람의 id를 출력해주세요.
        // 조건 : 사람의 id를 20으로 설정해주세요.
        // 조건 : 사람 클래스의 id 필드의 private 속성은 수정할 수 없습니다.
        // 조건 : 사람 클래스에서 출력할 수 없습니다.
        Person2 p2 = new Person2();
        // 구현시작
        p2.setId(20);        // 메서드를 통해서 접근한다 -> 메서드에서는 처리가 가능 (들어가면 안되는 값들을 메서드를 통해 처리가능)
        System.out.println("제 번호는 " + p2.getId() + " 입니다.");
        // 구현끝
        // 출력 : 제 번호는 20 입니다.
    }
}
class Person {
    // private => 외부로 공개되지 않는다., 리모콘에 노출되지 않는다.
    int id;
}

class Person2 {
    private int id;
    // 힌트 : 여기에 메소드 2개 추가해야 합니다.
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
}
