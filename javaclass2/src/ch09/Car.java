package ch09;
public class Car {
    private String color;
    private String company;
    private String model;
    private int speed;

    public Car(String color, String company, String model) {
        this.color = color;
        this.company = company;
        this.model = model;
    }

    public void startCar() {
        if(speed == 0) {
            speedUp();
            System.out.println("출발합니다");
        }
        return;
    }

    public void speedUp() {
        System.out.println("속도를 올립니다");
        speed += 10;
    }

    public void stopCar() {
        while(speed != 0) {
            speedDown();
        }
        System.out.println("정지합니다");
    }

    public void speedDown() {
        if(speed == 0) {
            System.out.println("정지한 상태입니다");
            return;
        }
        speed -= 10;
        System.out.println("속도를 내리다");
    }

    public void showInfo() {
        System.out.println("제조사는 " + company + "이고, 차종은 " + model + "이고, 색깔은 " + color + "입니다.");
    }

}
