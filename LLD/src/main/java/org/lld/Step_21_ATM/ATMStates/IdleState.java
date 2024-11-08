package main.java.org.lld.Step_21_ATM.ATMStates;


import main.java.org.lld.Step_21_ATM.ATM;
import main.java.org.lld.Step_21_ATM.Card;

public class IdleState extends ATMState {

    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setCurrentATMState(new HasCardState());
    }
}
