package main.java.org.lld.Step_32_All_Creational_Patterns.Prototype_Pattern.problem;

public class Main {
    public static void main(String[] args) {
        Student obj = new Student(21, 100, "Ktp");

        // Creating clone o obj
        Student cloneObj = new Student();
        cloneObj.age = obj.age;
        cloneObj.name = obj.name;
        // While cloning using normal way, we cannot access the private variables of the original object -> This is one problem
        // even if we have a getter method, and it is also private then also we face this problem

        // The client who is cloning should know all the entities present in the original object in order to clone entire object
//        cloneObj.rollNumber = obj.rollNumber;

    }
}
