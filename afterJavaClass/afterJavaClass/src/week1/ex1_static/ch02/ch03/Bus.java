package week1.ex1_static.ch02.ch03;

public class Bus implements Take{
    private String number;
    private int passengerCount;
    private int money;
    public Bus(String number){
    }
    @Override
    public void take(int money) {
        passengerCount++;
        this.money+=money;
    }
    @Override
    public void showInfo(){
        System.out.println("번호: "+number +" 누적 이용 고객 수: "+ passengerCount + " 수입: "+money);
    }
}
