package main.java.org.lld.Step_32_All_Creational_Patterns.Singleton_Pattern.Lazy_Initialization;

public class DBConnection {

    // In Eager Initialize technique, we initialize the object here only
    private static DBConnection conObject;
    private DBConnection() {
    }

    public static DBConnection getInstance() {

        // The problem with the Lazy initialization will be solved here

        if (conObject == null) {
            conObject = new DBConnection();
        }

        System.out.println("Returning the existing connection object!!");
        return conObject;
    }
}
