package main.java.org.lld.Step_16_ProxyPattern;


import main.java.org.lld.Step_16_ProxyPattern.caching.CachedDataFetcherProxy;
import main.java.org.lld.Step_16_ProxyPattern.caching.DataFetcher;

// Client code
public class Main {
    public static void main(String[] args) {
        DataFetcher dataFetcher = new CachedDataFetcherProxy();

        System.out.println(dataFetcher.getData()); // Fetches and caches data
        System.out.println(dataFetcher.getData()); // Uses cached data
    }
}
