package ch10;

public abstract class Ship {
    public abstract int maxPassengers();
    public abstract int maxLuggage();
    public void startShip(){
        System.out.println("출항");
    }
}
