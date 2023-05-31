package day4.clazz;

public class Class2 {
    //v1. 1개의 자동차가 3번 달리게 해주세요.

    //v2. 3개의 자동차가 1번씩 달리게 해주세요.

    //자동차가 달립니다.
    //자동차가 달립니다.
    //자동차가 달립니다.
    //자동차가 달립니다.
    //자동차가 달립니다.
    //자동차가 달립니다.

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.car = "아반떼";
        car1.run(3);

        Cars vehicles = new Cars();
        vehicles.car1 = "소나타";
        vehicles.car2 = "그랜저";
        vehicles.car3 = "스포티지";
        vehicles.run();

        CarMax carspeed = new CarMax();
        carspeed.speed = 220;
        carspeed.high();
        carspeed.speed = 250;
        carspeed.high();


    }
}

class Car {
    String car;

    public void run(int cnt){
        for(int i = 0; i < cnt; i++){
            System.out.println("자동차가 달립니다.");
        }
    }
}
class Cars {
    String car1;
    String car2;
    String car3;

    public void run(){
        System.out.println("자동차가 달립니다.");
    }
}

class CarMax{
    int speed;
    public void high(){
        System.out.printf("자동차가 최고속력 %dkm로 달립니다.\n", speed);
    }
}