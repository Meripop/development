import java.io.IOException;
import java.util.Scanner;

/*
Tételezzük fel, hogy valamit választania kell a felhasználónak a,b,c. lehetőség
közül. Készítsünk olyan metódus, amely ezt a konzolról beolvasott értéket feldolgozza és
csak az első karaktert adja vissza, mint felhasználói választás. Elkerülve, hogy a
felhasználó pontot, zárójelet, szóközt vagy bármi mást ír véletlenül az opciója után.
 */
public class Task79 {
    static Scanner scanner = new Scanner(System.in);

    private static String addFirstString() {

        String inputFromConsole = scanner.nextLine();
        String inputToReduceFirstString = inputFromConsole.substring(0, 1);


        if (inputToReduceFirstString.equals("a") || inputToReduceFirstString.equals("b") || inputToReduceFirstString.equals("c")) {
            return inputToReduceFirstString;
        } else {
            return "Not good";
        }

    }

    private static char addFirstChar() {
        String inputFromConsole = scanner.nextLine();
        char inputToFirstChar = inputFromConsole.charAt(0);

        switch (inputToFirstChar) {
            case 'a', 'b', 'c':
                return inputToFirstChar;
            default:
                return '-';
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Solution 1: " + addFirstString());
        System.out.println("Solution 2: " + addFirstChar());
    }
}
