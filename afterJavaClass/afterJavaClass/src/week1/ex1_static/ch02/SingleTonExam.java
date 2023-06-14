package week1.ex1_static.ch02;

public class SingleTonExam {
    public static void main(String[] args) {
        School busan = School.getInstance();
        School soft = School.getInstance();

        System.out.println(busan);
        System.out.println(soft);
    }

}
