package main.java.org.lld.Step_24_AdapterPattern.Client;


import main.java.org.lld.Step_24_AdapterPattern.Adaptee.WeightMachineForBabies;
import main.java.org.lld.Step_24_AdapterPattern.Adapter.WeightMachineAdapter;
import main.java.org.lld.Step_24_AdapterPattern.Adapter.WeightMachineAdapterImpl;

public class Main {

    public static void main(String args[]){

        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
