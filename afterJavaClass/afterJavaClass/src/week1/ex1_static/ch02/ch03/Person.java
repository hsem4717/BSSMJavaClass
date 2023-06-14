package week1.ex1_static.ch02.ch03;

public class Person {
    private String name;
    private int money;
    private boolean transfer;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
        transfer = false;
    }

    public void takeSubway(Subway subway){
        if(money<1300){
            System.out.println("잔액이 부족합니다");
            return;
        }
        subway.take(1300);
        this.money-=1300;
        this.transfer = true;
    }

    public void showInfo(){
        System.out.println(name+"의 잔돈: "+money);
    }

    public void takeBus(Bus bus){
        if(transfer == false){
            return;
        }
        bus.take(200);
        this.money-=200;
    }
    public void takeCar(Car car, int km){
        if(car.getLiter()==0){
            System.out.println("기름 없음");
            return;
        }

    }
    public void take(Take take){
        if(take instanceof Subway){
            takeSubway((Subway) take);
        } else if (take instanceof Bus) {
            takeBus((Bus) take);

        }
    }
    public void oiling(Car myCar, int i, GassStatoin suyeong){
        this.money -= suyeong.oiling(myCar, liter);
    }

}
