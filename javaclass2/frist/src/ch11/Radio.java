package ch11;

public class Radio implements Sound{
    private int soundLevel;

    @Override
    public void soundUp() {
        soundLevel +=2;
    }

    @Override
    public void soundDown() {
        soundLevel -=2;
    }
}
