package clubs;

public class Club {

    private Long id;
    private String name;
    private String stadium;

    public Club() {
    }

    public Club(Long id, String name, String stadium) {
        this.id = id;
        this.name = name;
        this.stadium = stadium;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }
}
