package exeption;

public class ArrayIndexExam {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(arr[i]);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
