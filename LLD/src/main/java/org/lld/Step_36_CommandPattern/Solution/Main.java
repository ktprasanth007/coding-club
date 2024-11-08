package main.java.org.lld.Step_36_CommandPattern.Solution;

public class Main {

    public static void main(String[] args) {

        AirConditioner airConditioner = new AirConditioner();
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setICommand(new TurnOnCommand(airConditioner));

        remoteControl.pressButton();

        // using undo feature
        remoteControl.pressUndoButton();
    }
}
