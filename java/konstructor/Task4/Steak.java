package Task4;

public class Steak {
    private String typeOfMeat;
    private int timeOfCooking;
    private String typeOfCooking;
    private String seasoning;
    private String curing;

    public Steak(String typeOfMeat, int timeOfCooking, String typeOfCooking, String seasoning, String curing) {
        this.typeOfMeat = typeOfMeat;
        this.timeOfCooking = timeOfCooking;
        this.typeOfCooking = typeOfCooking;
        this.seasoning = seasoning;
        this.curing = curing;
    }

    public String getTypeOfMeat() {
        return typeOfMeat;
    }

    public void setTypeOfMeat(String typeOfMeat) {
        this.typeOfMeat = typeOfMeat;
    }

    public int getTimeOfCooking() {
        return timeOfCooking;
    }

    public void setTimeOfCooking(int timeOfCooking) {
        this.timeOfCooking = timeOfCooking;
    }

    public String getTypeOfCooking() {
        return typeOfCooking;
    }

    public void setTypeOfCooking(String typeOfCooking) {
        this.typeOfCooking = typeOfCooking;
    }

    public String getSeasoning() {
        return seasoning;
    }

    public void setSeasoning(String seasoning) {
        this.seasoning = seasoning;
    }

    public String getCuring() {
        return curing;
    }

    public void setCuring(String curing) {
        this.curing = curing;
    }

    @Override
    public String toString() {
        return "Steak{" +
                "typeOfMeat='" + typeOfMeat + '\'' +
                ", timeOfCooking=" + timeOfCooking +
                ", typeOfCooking='" + typeOfCooking + '\'' +
                ", seasoning='" + seasoning + '\'' +
                ", curing='" + curing + '\'' +
                '}';
    }
}
