package ch05;

public class Student {
    String name;
    static String group="SW";
    static final String school = "Busan software meister";

    void showInfo(){
        System.out.println("이름: "+name + " 학과: "+ group);
    }
}
