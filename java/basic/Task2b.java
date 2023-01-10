import java.util.Scanner;

public class Task2b {
    /*
   Készítsünk programot, ami a megadott két számot, “a”-t és “b” letárolja,
    majd megmondja mennyi lesz a maradék, ha “a”-t elosztjuk “b”-vel.
parancssori argumentumként olvassa be a számokat
felhasználótól kérjük be a számokat

    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type me a number: ");
        int a = scanner.nextInt();
        System.out.println("Type one more number: ");
        int b = scanner.nextInt();
        int result = a % b;
        System.out.println(result);
    }
}