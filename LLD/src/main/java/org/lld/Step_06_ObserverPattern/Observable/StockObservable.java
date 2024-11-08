package main.java.org.lld.Step_06_ObserverPattern.Observable;

import main.java.org.lld.Step_06_ObserverPattern.Observer.NotificationAlertObserver;

public interface StockObservable {

    void add(NotificationAlertObserver observer);

    void remove(NotificationAlertObserver observer);

    void notifySubscribers();

    void setStockCount(int stockCount);

    int getStockCount();

    int getNotificationReceivedCount();

    int setNotificationReceivedCount(int count);
}
