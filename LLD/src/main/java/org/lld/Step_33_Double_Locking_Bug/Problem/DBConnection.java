package main.java.org.lld.Step_33_Double_Locking_Bug.Problem;

public class DBConnection {

    // There is a bug in this method which will be resolved in next video
    private static volatile DBConnection conObject;
    private int memberVariable;
    private DBConnection(int memberVariable) {
        this.memberVariable = memberVariable;
    }

    public static DBConnection getInstance() {

        if (conObject == null) {
            synchronized (DBConnection.class) {
                if (conObject == null) {
                    return new DBConnection(10);
                }
            }
        }
        System.out.println("Returning the existing connection object!!");
        return conObject;
    }
}


