package ch04;

import java.sql.SQLOutput;

public class Student {
    String name;
    int num;
    String gender;


    void study(){
        System.out.println("공부하기");
    }
    void sleeping(){
        System.out.println("잠자기");
    }
    void morning(){
        System.out.println("아침 운동");
    }
    void showInfo(){
        System.out.println("이름: "+name+" 학번: "+num+" 성별: "+gender);
    }
}
