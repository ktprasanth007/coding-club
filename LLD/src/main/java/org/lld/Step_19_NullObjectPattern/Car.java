package main.java.org.lld.Step_19_NullObjectPattern;

public class Car implements Vehicle{

    @Override
    public int getTankCapacity() {
        return 40;
    }

    @Override
    public int getSeatingCapacity() {
        return 5;
    }
}
