package interfaceTask12;

public class SemiFinal implements Sports, Event {


    private final String location;
    private String eventName;
    private String awayTeam;
    private String homeTeam;
    private final String sportType;

    public SemiFinal(String location, String sportType) {
        this.location = location;
        this.sportType = sportType;
    }

    @Override
    public void setEventName() {
        eventName = "World cup";
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void setHomeTeam(String name) {
        homeTeam = name;
    }

    @Override
    public void setAwayTeam(String name) {
        awayTeam = name;
    }

    @Override
    public String getSportType() {
        return null;
    }

    @Override
    public String toString() {
        return "SemiFinal{" +
                "location='" + location + '\'' +
                ", eventName='" + eventName + '\'' +
                ", awayTeam='" + awayTeam + '\'' +
                ", homeTeam='" + homeTeam + '\'' +
                ", sportType='" + sportType + '\'' +
                '}';
    }
}
