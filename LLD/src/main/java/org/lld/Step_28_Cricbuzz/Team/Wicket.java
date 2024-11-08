package main.java.org.lld.Step_28_Cricbuzz.Team;


import main.java.org.lld.Step_28_Cricbuzz.Inning.BallDetails;
import main.java.org.lld.Step_28_Cricbuzz.Inning.OverDetails;
import main.java.org.lld.Step_28_Cricbuzz.Team.Player.PlayerDetails;

public class Wicket {

    public WicketType wicketType;
    public PlayerDetails takenBy;
    public OverDetails overDetail;
    public BallDetails ballDetail;

    public Wicket(WicketType wicketType, PlayerDetails takenBy, OverDetails overDetail, BallDetails ballDetail){

        this.wicketType = wicketType;
        this.takenBy = takenBy;
        this.overDetail = overDetail;
        this.ballDetail = ballDetail;
    }
}
