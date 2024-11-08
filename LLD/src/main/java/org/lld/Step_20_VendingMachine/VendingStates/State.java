package main.java.org.lld.Step_20_VendingMachine.VendingStates;

import main.java.org.lld.Step_20_VendingMachine.Coin;
import main.java.org.lld.Step_20_VendingMachine.Item;
import main.java.org.lld.Step_20_VendingMachine.VendingMachine;

import java.util.List;

public interface State {

    // This will declare all the methods supported by the vending machine
    // Inside Each state it will only implement those methods which it cares perfectly and in other methods it will throw exception

    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception;

    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception;

    public void insertCoin(VendingMachine machine , Coin coin) throws Exception;

    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception;

    public int getChange(int returnChangeMoney) throws Exception;

    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception;

    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception;

    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception;


}
