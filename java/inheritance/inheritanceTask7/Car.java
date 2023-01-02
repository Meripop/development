package inheritanceTask7;

public class Car {
    private String manufacturer;
    private String type;
    private String colour;
    private int numberOfPassengers;
    boolean selfDriving;

    public Car(String manufacturer, String type, String colour, int numberOfPassengers, boolean selfDriving) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.colour = colour;
        this.numberOfPassengers = numberOfPassengers;
        this.selfDriving = selfDriving;
    }

    public void acceleration() {
        System.out.println("Gyorsulás");
    }

    public void stop() {
        System.out.println("Stop");
    }

    public void honk() {
        System.out.println("Dudálás");
    }

    public void index() {
        System.out.println("Indexelés");
    }

    @Override
    public String toString() {
        return "Car{" + "manufacturer='" + manufacturer + '\'' + ", type='" + type + '\'' + ", colour='" + colour + '\'' + ", numberOfPassengers=" + numberOfPassengers + ", selfDriving=" + selfDriving + '}';
    }
}
