import java.util.Random;
import java.util.Scanner;

/*
 Írjunk Fej vagy írás programot, amely kérdezze meg, hogy mire tippelünk, mit választunk. Ezután sorsolja ki, hogy az érme melyik oldala kerül felülre. Attól függően, hogy eltaláltuk, vagy hibáztunk írja ki az eredményt.
 */
public class Task4 {
    public static void main(String[] args) {
        System.out.println("Head or Tails");
        Scanner scanner = new Scanner(System.in);
        String tipp = scanner.nextLine();
        Random random = new Random(2);
        int rand = random.nextInt();
        String eredmeny;
        if (rand == 0) {
            eredmeny = "head";
        } else {
            eredmeny = "tails";

        }
        String kiir;
        if (tipp.equals(eredmeny)) {
            kiir = "Congratulation!";
        } else {
            kiir = "Maybe next time";
        }
        System.out.println("Computer guess: " + eredmeny);
        System.out.println(kiir);
    }
}
