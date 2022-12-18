
import java.util.Scanner;
/*
Írjunk programot, amely beolvassa hogy hányadik nap van a héten (1-7-ig), majd egy változóban tárolja azt. A hét napjai közül kitüntetett nap a csütörtök, péntek, szombat. Ha a változó értéke ezen napok valamelyikre, akkor írja ki a program hogy “Italos nap van, ide a citromos sört de gyorsan”. Egyébként írja ki, hogy “Ez nem a Te napod, majd talán holnap”
a sorszám beolvasás történjen console-ról
parancssori argumentumként olvassa be a sorszámot

 */

public class task7 {
    public static void main(String[] args) {
        System.out.println("Type a day: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        String eredmeny;
        if (input == 4 || input == 5 || input == 6) {
            eredmeny = "Italos nap van, ide a citromos sört de gyorsan";
        } else {
            eredmeny = "Ez nem a Te napod, majd talán holnap";
        }
        System.out.println(input);
        System.out.println(eredmeny);
    }
}
