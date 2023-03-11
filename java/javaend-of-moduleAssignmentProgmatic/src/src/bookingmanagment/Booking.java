package bookingmanagment;

public class Booking {
    private int roomPrice;
    private int numberOfPerson;
    private int days;
    private String bookingName;
    private int breakfastPrice;

    public Booking(int roomPrice, int numberOfPerson, int days, String bookingName, int breakfastPrice) {
        this.roomPrice = roomPrice;
        this.numberOfPerson = numberOfPerson;
        this.days = days;
        this.bookingName = bookingName;
        this.breakfastPrice = breakfastPrice;
    }

    public int getTotalCost() {
        if (numberOfPerson >= 2) {
            return roomPrice * days + (breakfastPrice * 2);
        } else {
            return roomPrice * days + breakfastPrice;
        }
    }


    public String toFile() {
        return "Reservation: " +
                " Booking Name: " + bookingName +
                " ,Number of person: " + numberOfPerson +
                " ,Days: " + days +
                " ,Room price: " + roomPrice +
                " ,Breakfast price: " + breakfastPrice;
    }

    @Override
    public String toString() {
        return "Reservation: " + '\n' +
                "Booking Name: " + bookingName + '\n' +
                "Number of person: " + numberOfPerson + '\n' +
                "Days: " + days + '\n' +
                "Room price: " + roomPrice + '\n' +
                "Breakfast price: " + breakfastPrice;
    }
}
