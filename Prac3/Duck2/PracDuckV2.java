package Prac3.Duck2;

import java.util.*;

public class PracDuckV2 {
    public static void main(String[] args) {
        Duck duck1 = new Duck("origin", true, true);
        Duck duck2 = new Duck("mallard", true,true);
        Duck duck3 = new Duck("white", false, true);
        Duck duck4 = new Duck("rubber", true, false);
        Duck duck5 = new Duck("asura", false, false);

        List<Duck> duckList = new ArrayList<>();

        duckList.add(duck1);
        duckList.add(duck2);
        duckList.add(duck3);
        duckList.add(duck4);
        duckList.add(duck5);

        Action action = new Action();

        for(Duck duck: duckList){
            action.printDuckName(duck);
            action.fly(duck);
            action.swim(duck);
            System.out.println();
        }
    }
}
class Duck{
    private String typeOfDuck;
    private boolean flyPossible;
    private boolean swimPossible;
    public Duck(String typeOfDuck, boolean flyPossible, boolean swimPossible){
        this.typeOfDuck = typeOfDuck;
        this.flyPossible = flyPossible;
        this.swimPossible = swimPossible;
    }
    public void setFlyPossible(boolean flyPossible){
        this.flyPossible = flyPossible;
    }
    public void setSwimPossible(boolean swimPossible){
        this.swimPossible = swimPossible;
    }
    public String getTypeOfDuck(){
        return typeOfDuck;
    }
    public boolean getFlyPossible(){
        return flyPossible;
    }
    public boolean getSwimPossible(){
        return swimPossible;
    }
}
class Action{
    public void swim(Duck duck){
        if(duck.getSwimPossible()){
            System.out.println("오리가 오리발로 헤엄칩니다.");
        }else {
            System.out.println("오리가 둥둥 떠다닙니다.");
        }
    }
    public void fly(Duck duck){
        if(duck.getFlyPossible()){
            System.out.println("오리가 날개로 날아갑니다.");
        }else {
            System.out.println("저는 날 수 없어요. ㅠㅠ");
        }
    }
    public void printDuckName(Duck duck){
        System.out.println(duck.getTypeOfDuck());
    }
}
