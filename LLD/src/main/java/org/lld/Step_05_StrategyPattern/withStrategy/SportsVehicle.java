package main.java.org.lld.Step_05_StrategyPattern.withStrategy;

import main.java.org.lld.Step_05_StrategyPattern.withStrategy.strategy.DriveStrategy;

public class SportsVehicle extends Vehicle{

    public SportsVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
