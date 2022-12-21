import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Készítsünk egy számla végösszeg kalkulátor programot, amelybe be tudom rögzíteni az adott hónap különböző számláinak az összegét. A program pedig összeadja őket és kiírja mennyit kell a családi kasszából fizetni összesen. Magát, hogy milyen számla az amit be kell fizetni, nem fontos tárolni most, elég ha az összegek mentésre, majd összeadásra kerülnek.

 */
public class Task41 {
    public static void main(String[] args) {
        List<Integer> billList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int allBill = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("gimmi bill numbers");
            int inputbill = scanner.nextInt();
            billList.add(inputbill);
        }

        for (int bills : billList) {
            allBill += bills;
        }
        System.out.println("total: " + allBill);
    }
}
