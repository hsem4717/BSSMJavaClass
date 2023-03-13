package ch02;

public class SwitchExam {
    public static void main(String[] args) {
        int month = 1;
        switch (month) {
            default:
                System.out.println("31");
                break;
            case 2:
                System.out.println("28");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30");
                break;
        }

    }

}
