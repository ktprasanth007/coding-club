package main.java.org.lld.Step_16_ProxyPattern.caching;

// Proxy with Caching
public class CachedDataFetcherProxy implements DataFetcher {
    private RemoteDataFetcher dataFetcher;
    private String cachedData;

    public CachedDataFetcherProxy() {
        dataFetcher = new RemoteDataFetcher();
    }

    public String getData() {
        if (cachedData == null) {
            cachedData = dataFetcher.getData();
            System.out.println("Caching data...");
        } else {
            System.out.println("Using cached data...");
        }
        return cachedData;
    }
}

