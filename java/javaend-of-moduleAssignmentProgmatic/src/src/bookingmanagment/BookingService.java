package bookingmanagment;

import rooms.KingRoom;
import rooms.StrandardRoom;
import rooms.SuperiorRoom;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class BookingService implements BookingInterface {
    private static void toFile(int total, String toFile) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        String formattedDate = today.format(dateTimeFormatter);
        try {
            FileWriter fileWriter = new FileWriter("src/resources/foglalasiadatok-" + formattedDate + ".txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(toFile + " Total cost: " + total);
            printWriter.close();
        } catch (IOException ex) {
            System.out.println("File dosen't exist");
        }
    }

    @Override
    public void newBooking(ArrayList<String> list) {
        int numberOfPerson;
        try {
            numberOfPerson = Integer.parseInt(list.get(0));
        } catch (NumberFormatException ex) {
            numberOfPerson = 1;
        }

        int numberOfDays;
        try {
            numberOfDays = Integer.parseInt(list.get(1));
        } catch (NumberFormatException ex) {
            numberOfDays = 1;
        }
        String name = list.get(3);
        int breakfastPrice = 0;
        if (list.get(2).equalsIgnoreCase("y")) {
            breakfastPrice = 4500;
        }

        boolean extraBed = false;
        if (list.get(5).equalsIgnoreCase("y")) {
            extraBed = true;
        }
        int priceOfRoom;
        if (list.get(4).equalsIgnoreCase("King")) {
            KingRoom kingRoomReservation = new KingRoom(extraBed);
            priceOfRoom = kingRoomReservation.calculateRoomPrice();
        } else if (list.get(4).equalsIgnoreCase("Superior")) {
            SuperiorRoom superiorRoomReservation = new SuperiorRoom(extraBed);
            priceOfRoom = superiorRoomReservation.calculateRoomPrice();
        } else {
            StrandardRoom standardRoomRoomReservation = new StrandardRoom(extraBed);
            priceOfRoom = standardRoomRoomReservation.calculateRoomPrice();
        }

        Booking booker = new Booking(priceOfRoom, numberOfPerson, numberOfDays, name, (numberOfDays * breakfastPrice));
        int totalCost;
        totalCost = booker.getTotalCost();


        System.out.println(booker.toString());
        System.out.println("Total cost of reservation: " + totalCost);

        toFile(totalCost, booker.toFile());

    }
}
