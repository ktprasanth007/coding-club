package main.java.org.lld.Step_28_Cricbuzz;

public class T20MatchType implements MatchType{

    @Override
    public int noOfOvers() {
        return 20;
    }

    @Override
    public int maxOverCountBowlers() {
        return 5;
    }


}
