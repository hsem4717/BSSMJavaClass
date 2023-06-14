package ch09;

public class Truck extends Car{
    public Truck(String color, String company, String model) {
        super(color, company, model);
    }
    public void load(){
        System.out.println("집을 싣다.");
        startCar();
    }
    public void offload(){
        System.out.println("짐을 내리다");
    }
}
