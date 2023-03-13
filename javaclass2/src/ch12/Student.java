package ch12;

public class Student {
    private int num;
    private String name;

    public Student(int num, String name){
        this.num = num;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student){
            if(this.num == ((Student) obj).num){
                return true;
            }
        }

        return false;
    }
}
