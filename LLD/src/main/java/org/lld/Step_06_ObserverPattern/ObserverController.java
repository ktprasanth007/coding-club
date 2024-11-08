package main.java.org.lld.Step_06_ObserverPattern;

import main.java.org.lld.Step_06_ObserverPattern.Observable.BooksObservableImpl;
import main.java.org.lld.Step_06_ObserverPattern.Observable.IphoneObservableImpl;
import main.java.org.lld.Step_06_ObserverPattern.Observable.StockObservable;
import main.java.org.lld.Step_06_ObserverPattern.Observer.EmailAlertObserverImpl;
import main.java.org.lld.Step_06_ObserverPattern.Observer.MobileAlertObserverImpl;

public class ObserverController {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneObservableImpl();
        StockObservable booksStockObservable = new BooksObservableImpl();

        EmailAlertObserverImpl emailAlertObserver = new EmailAlertObserverImpl("ktp@gmail.com", iphoneStockObservable);
        MobileAlertObserverImpl mobileAlertObserver = new MobileAlertObserverImpl("kt", iphoneStockObservable);

        iphoneStockObservable.add(emailAlertObserver);
        iphoneStockObservable.add(mobileAlertObserver);

        iphoneStockObservable.setStockCount(10);
    }
}
