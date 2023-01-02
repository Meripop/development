package konstruktor.konstrTask6;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Hotel nyilvántartás. A nyilvántartás képes a vendég adatokat beolvasni és letárolni, majd
megjeleníteni őket. Kötelezően tárolja milyen névre szólt a foglalás, az érkezés és a
távozás időpontját valamint, hogy hány főre foglaltak szállást. Opcionálisan pedig
lehessen letárolni a foglaláshoz tartozó telefonszámot. Legyen limitálva, hogy hány
foglalást tud kezelni a program.
a. Hozz létre egy Booking osztályt, amely tartalmazza a foglalás adatait. Írj
metódusokat az osztály változók értékeinek megadására illetve lekérdezésére.
Ezen felül hasznos lehet egy toString metódus a letárolt adatainak a
megjelenítésére.
A Booking osztálynak a következő változókat kell tartalmaznia:
String name;
int phoneNumber;
String checkInDate;
String checkOutDate;
int numberOfGuests;
b. Írj programot, amely a konzolról beolvasott adatok segítségével létrehoz annyi
Booking példányt, amennyi darabszám beállításra került a program
argumentumként. Például ha a program argumentum 4, akkor a beolvasott
adatokat követően, azok tárolása és kíírása után az alábbi példa kimenetet kell
lássuk a konzolon:
Name: Kerri Philis
Phone number: 84258058
Check in date: 2014-05-22
Checko out date: 2014-05-23
Number of guests: 5
Name: Bryan Ambrosine
Phone number: 96112202
Check in date: 2016-11-15
Checko out date: 2016-11-18
Number of guests: 2
Name: Leland Hollie
Phone number: 45431352
Check in date: 2013-02-09
Checko out date: 2013-02-11
Number of guests: 3
Name: Ryley Trev
Phone number: 29118351
Check in date: 2017-12-01
Checko out date: 2017-12-06
Number of guests: 4


 */
public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int round = Integer.parseInt(args[0]);
        Booking bookings[] = new Booking[round];
        Map<String, Integer> bookingsHash = new HashMap<>();
        for (int i = 0; i < round; i++) {
            int phone;
            int guestNumber;
            System.out.println("Name");
            String name = scanner.nextLine();
            System.out.println("Phone number:");
            try {
                phone = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException ex) {
                phone = 0;
            }

            System.out.println("Check in date:");
            String checkin = scanner.nextLine();
            System.out.println("Check out date:");
            String checkout = scanner.nextLine();
            System.out.println("Number of guests:");
            try {
                guestNumber = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException ex) {
                guestNumber = 1;
            }


            Booking user = new Booking(name, checkin, checkout, guestNumber);
            if (name.isEmpty() || checkin.isEmpty() || checkout.isEmpty()) {
                System.out.println("Not be empty name, check in, check out, guests.");
                return; //vagy: System.exit(0);
            }
            user.setPhoneNumber(phone);
            bookings[i] = user;
            bookingsHash.put(String.valueOf(user), i);


        }

        for (Booking i : bookings) {
            System.out.println("Name: " + i.getName());
            System.out.println("Phone number: " + i.getPhoneNumber());
            System.out.println("Check in date: " + i.getCheckInDate());
            System.out.println("Checko out date: " + i.getCheckOutDate());
            System.out.println("Number of guests: " + i.getNumberOfGuests() + "\n");
        }
    }

}