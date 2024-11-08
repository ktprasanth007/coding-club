package main.java.org.lld.Step_33_Double_Locking_Bug.Problem;

// Singleton class without Synchronized Keyword

public class BillPughSingleton {
    // Private constructor to prevent instantiation from other classes
    private BillPughSingleton() {
        // Initialization code, if needed
    }

    // Inner static class to hold the Singleton instance
    private static class SingletonHelper {
        // The Singleton instance is created when the class is first referenced
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    // Public method to provide access to the Singleton instance
    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    // Other methods, fields, and functionality of the Singleton class
}
