package main.java.org.lld.Step_05_StrategyPattern.withStrategy;

import main.java.org.lld.Step_05_StrategyPattern.withStrategy.strategy.SportsDriveStrategy;

public class OffroadVehicle extends Vehicle {

    public OffroadVehicle() {
        super(new SportsDriveStrategy());
    }
}
