package week1.ex1_static.ch02;

public class StaticExam {
    public static void main(String[] args) {
        Employee choi = new Employee();
        System.out.println(choi.getEmployeeeId());

        Employee kim = new Employee();
        System.out.println(kim.getEmployeeeId());

        System.out.println(Employee.getSerialNum());

    }
}
