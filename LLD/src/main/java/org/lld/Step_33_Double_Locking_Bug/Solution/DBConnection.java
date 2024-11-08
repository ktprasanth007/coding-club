package main.java.org.lld.Step_33_Double_Locking_Bug.Solution;

public class DBConnection {

    // There is a bug in this method which will be resolved in next video
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
