import java.util.Scanner;

public class Task26 {
    /*
    Készítsetek egy prímszám eldöntő programot.
    A program bekér indulást követően egy számot,
    majd kiírja hogy az adott szám prím szám-e vagy sem.

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        System.out.println("Type a number: ");
        int inputNumb = scanner.nextInt();
        for (int i = 2; i <= inputNumb / 2; i++) {
            if (inputNumb % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Prim number");
        } else {
            System.out.println("Not prim number");

        }
    }
}
