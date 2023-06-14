package ch08;

public class AddExam {
    public static void main(String[] args) {
        Add add = new Add();
        System.out.println(add.sum(10, 20));
        System.out.println(add.sum("Busan", "meister"));
    }
}
