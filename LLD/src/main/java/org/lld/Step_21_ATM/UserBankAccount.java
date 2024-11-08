package main.java.org.lld.Step_21_ATM;

public class UserBankAccount {

    int balance;

    public void withdrawalBalance(int amount) {
        balance = balance - amount;
    }
}
