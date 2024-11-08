package main.java.org.lld.Step_16_ProxyPattern.caching;

// Real Subject
public class RemoteDataFetcher implements DataFetcher {
    public String getData() {
        // Simulate fetching data from a remote server
        System.out.println("Fetching data from the remote server...");
        return "Some important data";
    }
}
