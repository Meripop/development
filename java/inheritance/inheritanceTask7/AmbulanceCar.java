package inheritanceTask7;

public class AmbulanceCar extends Car {
    private Boolean marked;

    public AmbulanceCar(String manufacturer, String type, String colour, int numberOfPassengers, boolean selfDriving, Boolean marked) {
        super(manufacturer, type, colour, numberOfPassengers, selfDriving);
        this.marked = marked;
    }

    public void hooter() {
        System.out.println("Szirénázás");
    }

    public void exaction() {
        System.out.println("Behajtás kórházba");
    }

    public Boolean getMarked() {
        return marked;
    }

    @Override
    public String toString() {
        return "AmbulanceCar{" +
                "marked=" + marked +
                ", selfDriving=" + selfDriving +
                '}';
    }
}
