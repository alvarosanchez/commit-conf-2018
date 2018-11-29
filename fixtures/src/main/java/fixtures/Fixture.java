package fixtures;

public class Fixture {

    private Long homeClubId;
    private Long awayClubId;

    private Integer homeScore;
    private Integer awayScore;


    public Fixture(Long homeClubId, Long awayClubId, Integer homeScore, Integer awayScore) {
        this.homeClubId = homeClubId;
        this.awayClubId = awayClubId;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }

    public Long getHomeClubId() {
        return homeClubId;
    }

    public void setHomeClubId(Long homeClubId) {
        this.homeClubId = homeClubId;
    }

    public Long getAwayClubId() {
        return awayClubId;
    }

    public void setAwayClubId(Long awayClubId) {
        this.awayClubId = awayClubId;
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
}
