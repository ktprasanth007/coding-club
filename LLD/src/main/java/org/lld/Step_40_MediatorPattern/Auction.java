package main.java.org.lld.Step_40_MediatorPattern;

import main.java.org.lld.Step_40_MediatorPattern.interfaces.AuctionMediator;
import main.java.org.lld.Step_40_MediatorPattern.interfaces.Colleague;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator {

    List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void addBidder(Colleague bidder) {
        colleagues.add(bidder);
    }
    @Override
    public void placeBid(Colleague bidder, int bidAmount) {
        for (Colleague colleage : colleagues) {
            if (!colleage.getName().equals(bidder.getName())) {
                colleage.receiveBidNotification(bidAmount);
            }
        }
    }
}
