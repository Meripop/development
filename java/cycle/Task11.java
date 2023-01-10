import java.util.Scanner;
import java.util.SortedMap;

public class Task11 {
    /*
   Készítsetek egy összegző programot, ami egész számokat olvas be a
    felhasználótól mindaddig, amíg az az x karaktert nem adja meg szám helyett.
    Amikor ez megtörténik írjuk ki a megadott számok összegét.
készítsük el while-al
készítsük el for-al

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//while
        String inputNumb = " ";
        int count = 0;
        while (inputNumb != "x") {

            System.out.println("Type a number: ");
            inputNumb = scanner.nextLine();
            if (inputNumb.equalsIgnoreCase("x")) {
                break;
            }
            count += Integer.parseInt(inputNumb);
        }
        System.out.println(count);
//for
        count = 0;
        for (int i = 0; i <= 20000; i++) {
            System.out.println("Type a number: ");
            inputNumb = scanner.nextLine();
            if (!inputNumb.equalsIgnoreCase("x")) {
                count += Integer.parseInt(inputNumb);
            } else {
                i = 20000;
            }
        }
        System.out.println(count);
    }
}
