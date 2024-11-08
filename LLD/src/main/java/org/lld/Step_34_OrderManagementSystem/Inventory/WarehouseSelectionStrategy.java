package main.java.org.lld.Step_34_OrderManagementSystem.Inventory;

import java.util.List;

public abstract class WarehouseSelectionStrategy {

    public abstract Warehouse selectWarehouse(List<Warehouse> warehouseList);
}
