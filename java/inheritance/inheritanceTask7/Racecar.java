package inheritanceTask7;

public class Racecar extends Car {
    private final Boolean extraTransvenselyRigid;
    private final Boolean ignitionSystem;

    public Racecar(String manufacturer, String type, String colour, int numberOfPassengers, boolean selfDriving, Boolean extraTransvenselyRigid, Boolean ignitionSystem) {
        super(manufacturer, type, colour, numberOfPassengers, selfDriving);
        this.extraTransvenselyRigid = extraTransvenselyRigid;
        this.ignitionSystem = ignitionSystem;
    }

    public void race() {
        System.out.println("Versenyzés");
    }

    public Boolean getExtraTransvenselyRigid() {
        return extraTransvenselyRigid;
    }

    public Boolean getIgnitionSystem() {
        return ignitionSystem;
    }

    @Override
    public String toString() {
        return "Racecar{" +
                "extraTransvenselyRigid=" + extraTransvenselyRigid +
                ", ignitionSystem=" + ignitionSystem +
                ", selfDriving=" + selfDriving +
                '}';
    }
}
