package week1.ex1_static.ch02.ch03;

public class Subway implements Take{
    private int number;
    private int passengerCount;
    private int money;
    @Override
    public void take(int money) {
        this.passengerCount++;
        this.money+=money;
    }
    @Override
    public void showInfo(){
        System.out.println("번호: " + number +" 누적 이용 고객 수: " +passengerCount + " 수입: "+money);
    }
    public Subway(int number){
        this.number = number;
    }
}
