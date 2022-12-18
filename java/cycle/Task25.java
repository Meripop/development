import java.util.Scanner;
/*
Készítsétek el az hét napjai program switch case szerinti megvalósítását. Cseréljétek le az if/else if/else blokkokat switch case-ekkel.

 */

public class Task25 {
    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        String eredmeny;

        eredmeny = switch (input) {
            case 4 -> "Italos nap van, ide a citromos sört de gyorsan";
            case 5 -> "Italos nap van, ide a citromos sört de gyorsan";
            case 6 -> "Italos nap van, ide a citromos sört de gyorsan";
            case 7 -> "Ez nem a Te napod, majd talán holnap";
            case 1 -> "Ez nem a Te napod, majd talán holnap";
            case 2 -> "Ez nem a Te napod, majd talán holnap";
            case 3 -> "Ez nem a Te napod, majd talán holnap";
            default -> "nincs ilyen";
        };
        System.out.println(eredmeny);
    }
}
