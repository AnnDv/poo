package lab1;

public class Student {
    private String name;
    private int age;
    private float mark;


    Student(String name, int age, float mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }
    public float getMark(){

        return mark;
    }
    public String getStudent() {
        return name;
    }


}
