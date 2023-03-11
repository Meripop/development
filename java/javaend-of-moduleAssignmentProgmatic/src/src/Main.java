import bookingmanagment.BookingService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String newReservation = " ";
        while (!newReservation.equalsIgnoreCase("n")) {
            //UserInput user=new UserInput();
            ArrayList<String> datasFromBooker = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            System.out.println("How many person:");
            datasFromBooker.add(scanner.nextLine());
            System.out.println("How many days:");
            datasFromBooker.add(scanner.nextLine());
            System.out.println("Do you want to breakfast Y/N:");
            datasFromBooker.add(scanner.nextLine());
            System.out.println("Name of reservation:");
            datasFromBooker.add(scanner.nextLine());
            System.out.println("What room King/Superior/Standard");
            datasFromBooker.add(scanner.nextLine());
            System.out.println("Do you want to extra bed Y/N:");
            datasFromBooker.add(scanner.nextLine());
            BookingService listOfData = new BookingService();
            listOfData.newBooking(datasFromBooker);

            System.out.println("New reservation Y/N?");
            newReservation = scanner.nextLine();
        }
        System.out.println();


    }
}