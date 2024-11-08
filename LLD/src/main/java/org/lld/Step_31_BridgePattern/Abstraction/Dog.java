package main.java.org.lld.Step_31_BridgePattern.Abstraction;

import main.java.org.lld.Step_31_BridgePattern.Implementation.BreatheImplementor;

public class Dog extends LivingThings{
    public Dog(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        breatheImplementor.breatheProcess();
    }
}
