package week1.ex1_static.ch02.ch03;

public class TakeExam {
    public static void main(String[] args) {
        Person choi = new Person("choi", 5000);
        Subway brown = new Subway(3);
        Bus bus7_2 = new Bus("7-2");
        Car myCar = new Car();

        choi.take(brown);
        brown.showInfo();
        choi.take(bus7_2);
        bus7_2.showInfo();
        choi.showInfo();

        choi.oiling(myCar, 2, suyeong);
        choi.takeCar(myCar, 30);
        choi.showInfo();
        suyeong.showInfo();
    }
}
