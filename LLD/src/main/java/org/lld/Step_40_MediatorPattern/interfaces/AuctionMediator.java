package main.java.org.lld.Step_40_MediatorPattern.interfaces;

public interface AuctionMediator {
    void addBidder(Colleague bidder);
    void placeBid(Colleague bidder, int bidAmount);
}
