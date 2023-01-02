package interfaceTask13;

public class MercedesPilotOne implements Car, Racer {

    private String racername;
    private String nationality;
    private String manufacturer;
    private double time;

    public MercedesPilotOne(String racername, String nationality, String manufacturer) {
        this.racername = racername;
        this.nationality = nationality;
        this.manufacturer = manufacturer;
    }

    @Override
    public String getCarManufacturer() {
        return manufacturer;
    }

    @Override
    public String getNationality() {
        return nationality;
    }

    @Override
    public String getRacerName() {
        return racername;
    }

    @Override
    public void acceleration(double time) {
        this.time = time;
    }

    public String getRacername() {
        return racername;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "MercedesPilotOne{" +
                "racername='" + racername + '\'' +
                ", nationality='" + nationality + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", time=" + time +
                '}';
    }
}
