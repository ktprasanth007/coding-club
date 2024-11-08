package main.java.org.lld.Step_32_All_Creational_Patterns.Prototype_Pattern.Solution;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(12, 100, "Kt");

        Student cloneObj = (Student) student.cloner();


    }
}
