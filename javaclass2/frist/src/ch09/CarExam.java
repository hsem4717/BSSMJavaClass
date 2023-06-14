package ch09;

public class CarExam {
    public static void main(String[] args) {
        Car k3 = new Car("white", "kia", "k3");

        k3.showInfo();
        k3.startCar();
        k3.speedUp();
        k3.stopCar();

        Taxi taxi = new Taxi("black", "tesla", "model 3");
        Truck truck = new Truck("black", "tesla", "model 3");
    }
}
