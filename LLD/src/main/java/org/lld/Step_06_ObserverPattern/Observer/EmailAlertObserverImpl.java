package main.java.org.lld.Step_06_ObserverPattern.Observer;

import main.java.org.lld.Step_06_ObserverPattern.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    String emailId;
    StockObservable stockObservable;

    public EmailAlertObserverImpl(String emailId, StockObservable observable) {
        this.emailId = emailId;
        this.stockObservable = observable;
    }

    @Override
    public void update() {
        sendMail(emailId, "product is in stock, hurry!!");
        // Let's say we need to update notification received count for each observable class
        // Then we must know which observable class we are referring to
        // unless we create constructor dependency we will not know for which Observable class we are sending this notification
        // once we made constructor injection we can now easily access data of that particular observable class it is referring to
        stockObservable.setNotificationReceivedCount(stockObservable.getNotificationReceivedCount()+1);
    }

    void sendMail(String email, String msg) {
        System.out.println("mail sent to " + email);
    }
}
