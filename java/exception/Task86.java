
import java.util.Scanner;
/*
Kérjünk el egy stringet a felhasználótól és írjuk ki a 10. karakterét. Kezeljük le a keletkező
exceptiont.
 */
public class Task86 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFromUser = scanner.nextLine();
        try {
            char[] inputFromUserChar = inputFromUser.toCharArray();
            System.out.println(inputFromUserChar[9]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Text is too short!");
        }
    }


}
