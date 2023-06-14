package week1.ex1_static.ch02;

public class School {
    private static School instance = new School();
    private School(){
    }
    public static School getInstance(){
        if(instance == null){
            instance = new School();
        }
        return instance;
    }

}
