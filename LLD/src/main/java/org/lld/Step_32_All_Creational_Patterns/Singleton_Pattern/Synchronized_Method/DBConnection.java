package main.java.org.lld.Step_32_All_Creational_Patterns.Singleton_Pattern.Synchronized_Method;

public class DBConnection {

    private static DBConnection conObject;
    private DBConnection() {
    }

    synchronized public static DBConnection getInstance() {

        if (conObject == null) {
            return new DBConnection();
        }

        System.out.println("Returning the existing connection object!!");
        return conObject;
    }
}
