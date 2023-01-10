import java.util.Random;
import java.util.Scanner;

/*
   Írjunk kő-papír-olló játékot. A program minden indítás után válasszon
   egy random eszközt, majd vesse össze a felhasználó által megadott eszközzel.
   Miután kiértékelte, hogy ki nyert írja ki, hogy mi volt nála és hogy ki
   nyerte a játékot. Figyeljünk rá, hogy a játékos csak a kő, papír, olló
    eszközöket választhassa. Ellenkező esetben írjunk ki egy figyelmeztető
     üzenetet.

    */
public class Task16_Task65 {

    static Scanner scanner = new Scanner(System.in);

    private static String getUsetGuess() {
        System.out.println("Guess one! Rock/Paper/Scissors: ");
        String userHand = scanner.nextLine();

        if (userHand.equals("Rock") || userHand.equals("Paper") || userHand.equals("Scissors"))
            return userHand;
        else {
            System.out.println(" Rock,Paper or Scissors!");
            System.exit(0);

        }
        return userHand;

    }

    private static String getComputerRandom() {
        Random random = new Random();
        String computerHand;
        int computerGuess = random.nextInt(3);
        computerHand = switch (computerGuess) {
            case 0 -> "Rock";
            case 1 -> "Paper";
            default -> "Scissors";
        };
        System.out.println(computerHand);
        return computerHand;
    }

    private static void fight(String userHand, String computerHand) {
        if (computerHand.equals(userHand))
            System.out.println("Draw");
        else if (computerHand.equals("Rock") && userHand.equals("Paper") || computerHand.equals("Paper") && userHand.equals("Scissors") || computerHand.equals("Scissors") && userHand.equals("Rock")) {
            System.out.println("User win");
        } else {
            System.out.println("Computer win");
        }
    }

    public static void main(String[] args) {
        fight(getUsetGuess(), getComputerRandom());

    }
}
