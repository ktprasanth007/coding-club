package main.java.org.lld.Step_06_ObserverPattern.Observable;

import main.java.org.lld.Step_06_ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class BooksObservableImpl implements StockObservable {

    List<NotificationAlertObserver> observerList = new ArrayList<>();
    int stockCount = 0;
    int notificationReceivedCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver observer: observerList) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount) {
        if (stockCount == 0) {
            notifySubscribers();
        }
        stockCount += newStockCount;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }

    @Override
    public int getNotificationReceivedCount() {
        return notificationReceivedCount;
    }

    @Override
    public int setNotificationReceivedCount(int count) {
        return notificationReceivedCount = count;
    }
}
