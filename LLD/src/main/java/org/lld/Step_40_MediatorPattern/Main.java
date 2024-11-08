package main.java.org.lld.Step_40_MediatorPattern;

import main.java.org.lld.Step_40_MediatorPattern.interfaces.AuctionMediator;
import main.java.org.lld.Step_40_MediatorPattern.interfaces.Colleague;

public class Main {
    public static void main(String args[]) {
        AuctionMediator auctionMediatorobj = new Auction();
        Colleague bidder1 = new Bidder("A", auctionMediatorobj);
        Colleague bidder2 = new Bidder("B", auctionMediatorobj);
        bidder1.placeBid(2000);
        bidder2.placeBid(3000);
        bidder1.placeBid(3001);
    }
}
