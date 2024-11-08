package main.java.org.lld.Step_34_OrderManagementSystem.Inventory;

import lombok.Getter;
import lombok.Setter;
import main.java.org.lld.Step_34_OrderManagementSystem.Address;

import java.util.Map;

//warehouse or store, which generally manages the inventory or act as Inventory controller
@Getter
@Setter
public class Warehouse {

    Inventory inventory;
    Address address;

    //update inventory
    public void removeItemFromInventory(Map<Integer, Integer> productCategoryAndCountMap){

        //it will update the items in the inventory based upon product category.
        inventory.removeItems(productCategoryAndCountMap);
    }

    public void addItemToInventory(Map<Integer, Integer> productCategoryAndCountMap){

        //it will update the items in the inventory based upon product category.
    }
}
