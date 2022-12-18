import java.util.Scanner;

/*
Készítsetek programot, ami a megadott két számot, “a”-t és “b” letárolja, majd megmondja mennyi lesz “a” és “b” szorzata, miután megszoroztuk az “a”-t 3-al.
parancssori argumentumként olvassa be a számokat
felhasználótól kérjük be a számokat

 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Giive me a number: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = (3 * a) * b;
        System.out.println(result);
    }
}