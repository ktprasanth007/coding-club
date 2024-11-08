package main.java.org.lld.Step_32_All_Creational_Patterns.Singleton_Pattern.Eager_Initialization;

public class Main {
    public static void main(String[] args) {
        DBConnection connectionObj = DBConnection.getInstance();
    }
}
