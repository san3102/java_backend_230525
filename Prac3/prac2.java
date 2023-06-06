package Prac3;

import java.util.*;
        /*
        School 클래스를 생성하고, 학교의 이름과 학생 목록을 나타내는 인스턴스 변수를 가지도록 합니다.
        Student 클래스를 생성하고, 학생의 이름, 학년, 국어, 영어, 수학 성적을 나타내는 인스턴스 변수를 가지도록 합니다.
        School 클래스에는 다음과 같은 기능을 추가합니다:
        addStudent() 메서드를 작성하여 학생을 학교에 추가합니다.
        getStudent() 메서드를 작성하여 학생 이름을 입력받아 해당 학생을 반환합니다.
        printStudentList() 메서드를 작성하여 학교에 등록된 모든 학생의 정보를 출력합니다.
        getTopScorer() 메서드를 작성하여 각 과목별로 가장 높은 점수를 받은 학생을 출력합니다.
        */
public class prac2 {
    public static void main(String[] args) {
        Student student1 = new Student("홍길동", 6, 60, 80, 95);
        Student student2 = new Student("홍길순", 4, 80, 45, 60);
        Student student3 = new Student("이순신", 5, 95, 60, 70);
        Student student4 = new Student("이성계", 6, 90, 95, 90);


        School school = new School("코딩아카데미");
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.addStudent(student4);
        school.printStudentList();

        school.getTopScorer();
    }
}
class Student{
    private String name;
    private int grade;
    private int language_grade;
    private int english_grade;
    private int math_grade;
    Student(String name, int grade, int language_grade, int english_grade, int math_grade){
        this.name = name;
        this.grade = grade;
        this.language_grade = language_grade;
        this.english_grade = english_grade;
        this.math_grade = math_grade;
    }
    public String getName(){
        return name;
    }
    public int getGrade(){
        return grade;
    }
    public int getLanguage_grade(){
        return language_grade;
    }
    public int getEnglish_grade(){
        return english_grade;
    }
    public int getMath_grade(){
        return math_grade;
    }
}
class School{
    private String schoolName;
    private List<Student> studentList;
    School(String schoolName){
        this.schoolName = schoolName;
        this.studentList = new ArrayList<>();
    }
    public void addStudent(Student student){
        studentList.add(student);
    }

    public Student getStudent(Student student){
        for(Student stud : studentList){
            if(stud.getName().equals(student)){
                return stud;
            }
        }
        return null;
    }

    public void printStudentList(){
        System.out.println(schoolName + "의 학생 정보");
        for(Student student : studentList){
            System.out.println("이름 : " + student.getName());
            System.out.println("학년 : " + student.getGrade());
            System.out.println("영어 성적 : " + student.getEnglish_grade());
            System.out.println("국어 성정 : " + student.getLanguage_grade());
            System.out.println("수학 성적 : " + student.getMath_grade());
            System.out.println();
        }
    }

    public void getTopScorer(){
        int languageTopScore = 0;
        int englishTopScore = 0;
        int mathTopScore = 0;
        String languageTopStudent = null;
        String englishTopStudent = null;
        String mathTopStudent = null;

        for(Student student : studentList){
            if(student.getLanguage_grade() > languageTopScore){
                languageTopScore = student.getLanguage_grade();
                languageTopStudent = student.getName();
            }
            if(student.getEnglish_grade() > englishTopScore){
                englishTopScore = student.getEnglish_grade();
                englishTopStudent = student.getName();
            }
            if(student.getMath_grade() > mathTopScore){
                mathTopScore = student.getMath_grade();
                mathTopStudent = student.getName();
            }
        }
        System.out.println("---------------------------");
        System.out.println("국어 최고점수 : " + languageTopScore + ", " + languageTopStudent);
        System.out.println("영어 최고점수 : " + englishTopScore + ", " + englishTopStudent);
        System.out.println("수학 최고점수 : " + mathTopScore + ", " + mathTopStudent);
        System.out.println("---------------------------");
    }
}
