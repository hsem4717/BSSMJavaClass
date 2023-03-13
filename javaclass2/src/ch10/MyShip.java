package ch10;

public class MyShip extends Ship{
    @Override
    public int maxPassengers() {
        return 100;
    }

    @Override
    public int maxLuggage() {
        return 1000;
    }
}
