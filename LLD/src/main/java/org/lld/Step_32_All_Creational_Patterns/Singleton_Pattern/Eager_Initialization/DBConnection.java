package main.java.org.lld.Step_32_All_Creational_Patterns.Singleton_Pattern.Eager_Initialization;

public class DBConnection {

    // we are making it static so that we can access this single object from anywhere as the static variables are related to class
    // we are making it final so that this object value cannot be manipulated
    private static final DBConnection conObject = new DBConnection();
    private DBConnection() {
    }

    // If we don't make this method as static,
    // then we cannot create the object of this class as the DBConnection constructor is a private Constructor
    public static DBConnection getInstance() {
        System.out.println("Returning the existing connection object!!");
        return conObject;
    }
}
