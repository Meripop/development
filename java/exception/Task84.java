/*
 Készítsünk programot, amely kiírja a “There is no program arguments.” ha nem
talál hozzáadott program argumenteket. Készítsünk egy metódust (printArgConsole()),
amelyik kiírja az első paraméter tartalmát a konzolra.
a) Kapjuk el a lehetséges keletkező exceptiont a metódusban
b) Dobjuk tovább a lehetséges exceptiont és kapjuk el azt a main metódusban
 */

public class Task84 {
    private static void printArgConsole(String[] fromArg) {
        try {
            System.out.println(fromArg[0]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("There is no program arguments.");
        }
    }

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {

        printArgConsole(args);

    }
}
