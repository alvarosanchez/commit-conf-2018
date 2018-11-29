package fixtures;

public class FixtureResponse {

    private String homeClub;
    private String awayClub;

    private Integer homeScore;
    private Integer awayScore;

    private String stadium;

    public FixtureResponse() {
    }

    public FixtureResponse(String homeClub, String awayClub, Integer homeScore, Integer awayScore, String stadium) {
        this.homeClub = homeClub;
        this.awayClub = awayClub;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        this.stadium = stadium;
    }

    public String getHomeClub() {
        return homeClub;
    }

    public void setHomeClub(String homeClub) {
        this.homeClub = homeClub;
    }

    public String getAwayClub() {
        return awayClub;
    }

    public void setAwayClub(String awayClub) {
        this.awayClub = awayClub;
    }

    public Integer getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(Integer homeScore) {
        this.homeScore = homeScore;
    }

    public Integer getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(Integer awayScore) {
        this.awayScore = awayScore;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }
}
