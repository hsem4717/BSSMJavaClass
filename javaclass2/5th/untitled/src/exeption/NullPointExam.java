package exeption;

public class NullPointExam {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("무조건 실행");
        }
    }
}
