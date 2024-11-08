package main.java.org.lld.Step_28_Cricbuzz.ScoreUpdater;

import main.java.org.lld.Step_28_Cricbuzz.Inning.BallDetails;

public interface ScoreUpdaterObserver {

    public void update(BallDetails ballDetails);
}
