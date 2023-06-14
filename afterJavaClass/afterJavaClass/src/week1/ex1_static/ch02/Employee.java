package week1.ex1_static.ch02;

public class Employee {

    private static int serialNum = 1000;
    private int employeeeId;
    private String name;
    private String department;
    public Employee() {
        serialNum++;
        this.employeeeId = serialNum;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public int getEmployeeeId() {
        return employeeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
