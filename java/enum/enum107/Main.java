package enum107;
/*
Készítsetek egy OrderStatus nevű enumot, mely ACCEPTED, PAYED, TRANSIT,
DELIVERED értékeket tartalmaz. A program indítása után kiírja,
hogy “Your order is currently … “ A … helyén pedig legyen a fenti
 enumok értéke, például “Your order is currently ACCEPTED and waiting
 for the payment.” Az pedig, hogy a fenti értékek közül melyiket írja
 ki a program véletlenszerűen dőljön el. Egy random generált 1-4 közötti
 szám döntse el a státuszt. Pl.: 1 esetén ACCEPTED

 */

import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        String text;
        int num1 = random.nextInt(4) + 1;
        if (num1 == 1) {
            text = String.valueOf(OrderStatus.ACCEPTED) + " and waiting for the payment.";
        } else if (num1 == 2) {
            text = String.valueOf(OrderStatus.PAYED);
        } else if (num1 == 3) {
            text = String.valueOf(OrderStatus.TRANSIT);
        } else
            text = String.valueOf(OrderStatus.DELIVERED);

        System.out.println("Your order is currently " + text);

    }

}
