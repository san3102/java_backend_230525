package Prac3.Duck3;

import javax.xml.namespace.QName;

public class PracDuck3 {
    public static void main(String[] args) {
        Duck duck1 = new WhiteDuck("흰오리");
        Duck duck2 = new MallardDuck("청둥오리");
        Duck duck3 = new RubberDuck("고무오리");
        Duck duck4 = new AsuraDuck("아수라오리");

        duck1.doAction();
        duck2.doAction();
        duck3.doAction();
        duck4.doAction();
    }
}
class Duck{
    private String kind;
    private Action type;
    public Duck(String kind, Action type){
        this.kind = kind;
        this.type = type;
    }
    public void doAction(){
        type.doIt(kind);
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
class WhiteDuckAction extends Action {
    public void doIt(String name) {
        System.out.printf("%s가 날개로 날아갑니다.\n", name);
        System.out.printf("%s가 오리발로 헤엄칩니다.\n", name);
        System.out.println();
    }
}
class MallardDuckAction extends Action{
    public void doIt(String name){
        System.out.printf("%s가 날개로 날아갑니다.\n",name);
        System.out.printf("%s가 둥둥 떠다닙니다.\n", name);
        System.out.println();
    }
}
class RubberDuckAction extends Action{
    public void doIt(String name){
        System.out.printf("%s는 날 수 없어요.ㅠㅠ\n",name);
        System.out.printf("%s가 둥둥 떠다닙니다.\n", name);
        System.out.println();
    }
}
class AsuraDuckAction extends Action{
    public void doIt(String name){
        System.out.printf("%s는 날 수 없어요.ㅠㅠ\n",name);
        System.out.printf("%s가 오리발로 헤엄칩니다.\n", name);
        System.out.println();
    }
}


