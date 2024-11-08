package main.java.org.lld.Step_40_MediatorPattern;

import main.java.org.lld.Step_40_MediatorPattern.interfaces.AuctionMediator;
import main.java.org.lld.Step_40_MediatorPattern.interfaces.Colleague;

public class Bidder implements Colleague {

    String name;
    AuctionMediator auctionMediator;

    Bidder(String name, AuctionMediator auctionMediator) {
        this.name = name;
        this.auctionMediator = auctionMediator;
        auctionMediator.addBidder(this);
    }

    @Override
    public void placeBid(int bidAmount) {
        auctionMediator.placeBid(this, bidAmount);
    }

    @Override
    public void receiveBidNotification(int bidAmount) {
        System.out.println(name + " received a notification for a bid of " + bidAmount);
    }

    @Override
    public String getName() {
        return name;
    }
}
