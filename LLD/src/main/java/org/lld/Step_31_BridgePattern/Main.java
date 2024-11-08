package main.java.org.lld.Step_31_BridgePattern;

import main.java.org.lld.Step_31_BridgePattern.Abstraction.Dog;
import main.java.org.lld.Step_31_BridgePattern.Abstraction.LivingThings;
import main.java.org.lld.Step_31_BridgePattern.Implementation.LandBreathingProcess;
import main.java.org.lld.Step_31_BridgePattern.Implementation.WaterBreathingProcess;

public class Main {
    public static void main(String[] args) {
        LivingThings fishObject = new Dog(new WaterBreathingProcess());
        LivingThings dogObject = new Dog(new LandBreathingProcess());
        dogObject.breatheProcess();
        fishObject.breatheProcess();
    }
}