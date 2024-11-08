package main.java.org.lld.Step_32_All_Creational_Patterns.Prototype_Pattern.Solution;

public class Student implements Prototype {
    int age;
    private int rollNumber;
    String name;

    public Student(int age, int rollNumber, String name) {
        this.age = age;
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public Student() {
    }

    @Override
    public Prototype cloner() {
        return new Student(age, rollNumber, name);
    }
}

