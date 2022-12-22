import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Irjatok egy telefonkönyv programot, amely a konzolról a felhasználó által megadott és
beolvasott 5 darab név-hez a hozzá tartozó telefonszámot lementi egy HashMap-ben.

 */
public class Task54 {
    public static void main(String[] args) {
        Map<String, Long> telephonbook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (telephonbook.size() != 5) {
            System.out.println("Name: ");
            String name = scanner.nextLine();
            System.out.println("Phone number: ");
            String number = scanner.nextLine();

            telephonbook.put(name, Long.parseLong(number));

        }

        System.out.println(telephonbook);
    }


}
