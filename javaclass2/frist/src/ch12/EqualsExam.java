package ch12;

public class EqualsExam {
    public static void main(String[] args) {
        Student s1 = new Student(1, "choi");
        Student s2 = new Student(1, "choi");

        String str1 = "Busan";
        String str2 = "Busan";

        System.out.println(s1.equals(s2));
        System.out.println(str1.equals(str2));
    }
}
