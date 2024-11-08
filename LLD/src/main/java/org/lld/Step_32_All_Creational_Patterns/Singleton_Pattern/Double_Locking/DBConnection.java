package main.java.org.lld.Step_32_All_Creational_Patterns.Singleton_Pattern.Double_Locking;

public class DBConnection {

    // To explain the bug we have introduced a member variable
    private static DBConnection conObject;
    private DBConnection() {
    }

    public static DBConnection getInstance() {

        if (conObject == null) {

            // So in the first attempt if the threads come simultaneously, they will reach here, but for the next time they won't reach this clock
            synchronized (DBConnection.class) {
                if (conObject == null) {
                    return new DBConnection();
                }
            }
        }
        System.out.println("Returning the existing connection object!!");
        return conObject;
    }
}
