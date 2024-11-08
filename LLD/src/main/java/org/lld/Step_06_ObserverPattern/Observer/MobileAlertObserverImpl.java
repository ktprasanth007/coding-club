package main.java.org.lld.Step_06_ObserverPattern.Observer;

import main.java.org.lld.Step_06_ObserverPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String userName;
    StockObservable stockObservable;

    public MobileAlertObserverImpl(String userName, StockObservable observable) {
        this.userName = userName;
        this.stockObservable = observable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(userName, "product is in stock, hurry!!");
//         Let's say we need to update notification received count for each observable class
//         Then we must know which observable class we are referring to
//         unless we create constructor dependency we will not know for which Observable class we are sending this notification
//         once we made constructor injection we can now easily access data of that particular observable class it is referring to
        stockObservable.setNotificationReceivedCount(stockObservable.getNotificationReceivedCount()+1);

        // if this is not injected then we need to do it using if conditions and in params of update we will get the object of Observable class
        // if (observableObj == StockObservable.IphoneObservable) -> then get that notification count or else check remaining all one by one
    }

    void sendMsgOnMobile(String userName, String msg) {
        System.out.println("msg sent to " + userName);
    }
}
