package ch01;

public class ArrayExam2 {
    public static void main(String[] args) {
        String[] str = new String[3];
        str[0] = "Hello";
        str[1] = "Java";
        str[2] = "World";

        //iter
        for (String s : str) {
            System.out.println(s);
        }
    }
}
