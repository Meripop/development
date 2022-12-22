import java.io.IOException;
import java.util.Scanner;

/*
Készítsünk egy konzolról beolvasó metódust, amely a beírt szöveget
Stringként beolvassa és eltávolítja a felesleges szóközöket az elejéről és végéről,
majd visszaadja azt. Építsünk bele olyan logikák, hogy ha 0 hosszú a bevitt kifejezés,
akkor írjon ki a konzolra hibaüzenetet.
 */
public class Task76 {

    static Scanner scanner = new Scanner(System.in);


    private static String trimmedTextFromConsole() {
        String inputToTremmedTxt;
        String inputext = scanner.nextLine();
        if (inputext.length() == 0) {
            System.out.println("It's too short!");
            inputToTremmedTxt = " ";
        } else {
            inputToTremmedTxt = inputext.trim();
        }
        return inputToTremmedTxt;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(trimmedTextFromConsole());

        /**
         * remove spaces from beginning and end of the console input
         * return console input
         * print retunr value
         */
    }
}