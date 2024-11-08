package main.java.org.lld.Step_36_CommandPattern.Solution;

public class TurnOffCommand implements ICommand {

    AirConditioner airConditioner;

    TurnOffCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOff();
    }

    @Override
    public void undo() {
        airConditioner.turnOn();
    }
}
