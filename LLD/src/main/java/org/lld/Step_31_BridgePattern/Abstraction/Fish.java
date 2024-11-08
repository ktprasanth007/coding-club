package main.java.org.lld.Step_31_BridgePattern.Abstraction;

import main.java.org.lld.Step_31_BridgePattern.Implementation.BreatheImplementor;

public class Fish extends LivingThings{
    public Fish(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        breatheImplementor.breatheProcess();
    }
}
