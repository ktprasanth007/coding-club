package main.java.org.lld.Step_40_MediatorPattern.interfaces;

public interface Colleague {
    void placeBid (int bidAmount);
    void receiveBidNotification(int bidAmount);
    String getName();
}
