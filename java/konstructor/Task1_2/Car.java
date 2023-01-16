package Task1_2;

public class Car {
    // fields
    private String manufacturer;
    private String colour;
    private String type;
    private int year;
    private int numberOfDoors;

    // constructor

    public Car(String manufacturer, String colour, String type, int year, int numberOfDoors) {
        this.manufacturer = manufacturer;
        this.colour = colour;
        this.type = type;
        this.year = year;
        this.numberOfDoors = numberOfDoors;
    }


    // getters, setters


    public String getManufacturer() {
        return manufacturer;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Konstruktor.Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", colour='" + colour + '\'' +
                ", type='" + type + '\'' +
                ", year=" + year +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }

}
