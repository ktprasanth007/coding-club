package main.java.org.lld.Step_31_BridgePattern.Abstraction;

import main.java.org.lld.Step_31_BridgePattern.Implementation.BreatheImplementor;

public class Tree extends LivingThings{
    public Tree(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        breatheImplementor.breatheProcess();
    }
}
