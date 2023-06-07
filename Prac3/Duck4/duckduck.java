package Prac3.Duck4;

public class duckduck {
    public static void main(String[] args) {
        Duck duck1 = new WhiteDuck("흰오리");
        Duck duck2 = new MallardDuck("청둥오리");
        Duck duck3 = new RubberDuck("고무오리");
        Duck duck4 = new AsuraDuck("아수라오리");

        duck1.doAction();
    }
}
class Duck{
    private String name;
    private Action action;
    Duck(String name, Action action){
        this.name = name;
        this.action = action;
    }
    public void doAction(){
        action.doIt(name);
    }
}
class WhiteDuck extends Duck{
    WhiteDuck(String name){
        super(name, new WhiteDuckAction());
    }
}
class MallardDuck extends Duck{
    MallardDuck(String name){
        super(name, new MallardDuckAction());
    }
}
class RubberDuck extends Duck{
    RubberDuck(String name){
        super(name, new RubberDuckAction());
    }
}
class AsuraDuck extends Duck{
    AsuraDuck(String name){
        super(name, new AsuraDuckAction());
    }
}
class Action{
    public void doIt(String name){}
}
class WhiteDuckAction extends Action{
    public void doIt(String name){
        System.out.printf("%s가 날개로 날아갑니다.\n", name);
        System.out.printf("%s가 오리발로 헤엄칩니다.\n", name);
    }
}
class MallardDuckAction extends Action{

}
class RubberDuckAction extends Action{

}
class AsuraDuckAction extends Action{

}