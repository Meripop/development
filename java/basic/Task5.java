import java.util.Random;
import java.util.Scanner;

public class Task5 {
    /*
    Írjunk programot, ami bekér 6 nevet a felhasználótól, majd
    visszaadja véletlenszerűen az egyikőjük nevét, mint a tombola nyertesét.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a name: ");
        String first = scanner.nextLine();
        System.out.println("Type a name: ");
        String second = scanner.nextLine();
        System.out.println("Type a name: ");
        String third = scanner.nextLine();
        System.out.println("Type a name: ");
        String forth = scanner.nextLine();
        System.out.println("Type a name: ");
        String fifth = scanner.nextLine();
        System.out.println("Type a name: ");
        String sixth = scanner.nextLine();
        Random random = new Random();
        int rand = random.nextInt(6);
        String winnerText;
        if (rand == 0) {
            winnerText = first;
        } else if (rand == 1) {
            winnerText = second;
        } else if (rand == 2) {
            winnerText = third;
        } else if (rand == 3) {
            winnerText = forth;
        } else if (rand == 4) {
            winnerText = fifth;
        } else if (rand == 5) {
            winnerText = sixth;
        } else
            winnerText = "Nobody";

        System.out.println(rand);
        System.out.println("Winner is: " + winnerText);
    }
}
