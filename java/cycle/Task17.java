import java.util.Random;
import java.util.Scanner;

/*
Fejlesszétek tovább a kő-papír-olló játékot. A játék ne érjen véget egy kör után
, hanem addig folytatódjon, amíg a felhasználó a három megengedett eszköz helyett
 az X karaktert adja meg. A játék számolja a pontokat.
az “x” karakter leütése után írja ki, hogy vége a játéknak, valamit hogy
 kinek hány pontja lett
amennyiben a felhasználó csal és valamilyen másik eszközt próbál használni,
úgy vonjon le egy pontot tőle

 */
public class Task17 {
    public static void main(String[] args) {
        int userCounter = 1;
        int computerCounter = 0;
        Scanner scanner = new Scanner(System.in);
        String userHand = " ";
        String computerHand;
        while (!userHand.equals("x")) {
            System.out.println("Guess one! Rock / Paper / Scissors:");
            userHand = scanner.nextLine();

            Random random = new Random();
            int computerGuess = random.nextInt(3);

            switch (computerGuess) {
                case 0:
                    computerHand = "Rock";
                    break;
                case 1:
                    computerHand = "Paper";
                    break;
                case 2:
                    computerHand = "Scissors";
                    break;
                default:
                    computerHand = "Invalid";
            }
            System.out.println("Computer: " + computerHand);
            if (userHand.equals("Paper") || userHand.equals("Rock") || userHand.equals("Scissors")) {
                if (computerHand.equals(userHand))
                    System.out.println("Draw");
                else if (computerHand.equals("Rock") && userHand.equals("Paper") || computerHand.equals("Paper") && userHand.equals("Scissors") || computerHand.equals("Scissors") && userHand.equals("Rock")) {
                    System.out.println("User win");
                    userCounter++;
                } else {
                    System.out.println("Computer win");
                    computerCounter++;
                }
            } else {
                userCounter--;
            }
        }
        System.out.println("User: " + userCounter);
        System.out.println("Computer: " + computerCounter);
    }
}
