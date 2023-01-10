import java.util.Scanner;

public class Task27 {
    /*
    Készítsetek egy tökéletes szám eldöntő programot.
    A program bekér indulást követően egy számot, majd kiírja hogy
    az adott szám tökéletes szám-e vagy sem.
     A tökéletes szám, egy olyan speciális szám amely,
      pozitív osztóinak összege mindig a szám kétszerese lesz.
     */
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int additNumbs = 0;
        System.out.println("Type a number: ");
        int inputNumb = scanner.nextInt();


        for (int i = 1; i <= inputNumb; i++) {
            if (inputNumb % i == 0) {
                additNumbs += i;
            }
        }
        if (additNumbs == (2 * inputNumb)) {
            System.out.println("It's a perfect number!");
        } else
            System.out.println("Not perfect!");

    }
}
