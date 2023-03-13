package ch09;

public class car {

    private int speed;
    private String company;
    private String model;
    private String color;

    public car(String company, String model, String color){
        this.company = company;
        this.model = model;
        this.color = color;
    }

    public void speedUp(){
        System.out.println("가속");
        speed += 10;
    }
    public void stopCar(){
        while(speed !=0){
            speedDown();
        }
    }

    private void speedDown() {
        if(speed <= 0){
            System.out.println("정지");
            return;
        }
        speed -=10;
        System.out.println("감속");
    }

    public void showInfo(){
        System.out.println("제조사: "+company+" 차종: "+model+" 색깔: "+color);
    }
}
