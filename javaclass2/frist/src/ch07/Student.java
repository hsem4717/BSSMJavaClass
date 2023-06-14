package ch07;

public class Student {
    private String name;
    private int grade;
    private static int count;

    public Student(){
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public static int getCount() {
        return count;
    }
}
