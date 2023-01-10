import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task51 {
    /*
     * Írjatok egy nyaralós checklist programot, amelybe tudjátok rögzíteni,
     * hogy mik azok a tevékenységek, dolgok amiket a nyaralás elindulása előtt
     * el kell intézni vagy el kell tenni, hogy minden meglegyen, rendben legyen.
     * Ha ‘X’-et ír tevékenység helyett, akkor fejezze be az elemek hozzáadását.
     */

    public static void main(String[] args) {

        Set<String> checklist = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        while (!userInput.equals("x")) {
            System.out.println("Add your item (for cycle): ");
            userInput = scanner.nextLine();
            if (!userInput.equals("x"))
                checklist.add(userInput);
        }
        System.out.println(checklist);

    }
}
