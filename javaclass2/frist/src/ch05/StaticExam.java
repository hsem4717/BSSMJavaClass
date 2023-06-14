package ch05;

public class StaticExam {
    public static void main(String[] args) {
        Student s1;
        System.out.println(Student.group);
        Student.group = "EB";
        System.out.println(Student.group);


    }
}
