package main.java.org.lld.Step_05_StrategyPattern.withStrategy;

import main.java.org.lld.Step_05_StrategyPattern.withStrategy.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {

    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
