import java.util.Random;
import java.util.Scanner;

public class Task59 {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    static String inputTipp = "";
    static boolean loser = false;

    static void tipp(int tippRound) {
        int randomNumb = random.nextInt(100) + 1;
        int tippCunter = 0;

        for (int i = tippRound; i > 0; i--) {
            tippCunter++;
            System.out.println("Adj meg egy szamot 1 es 100 kozott: ");
            inputTipp = scanner.nextLine();
            String text = "";
            if (inputTipp.equals("x")) {
                break;
            } else if (randomNumb == Integer.parseInt(inputTipp)) {
                System.out.println("Grat, kitalaltad " + tippCunter + " kor alatt");

                loser = false;
                break;
            } else if (Integer.parseInt(inputTipp) < randomNumb) {
                text = "Nagyobb szamra gondoltam!";
            } else if (Integer.parseInt(inputTipp) > randomNumb) {
                text = "Kisebb szamra gondoltam";
                loser = true;
            } else {
                text = "nem szikerult, sajnalom";
                loser = true;
            }
            System.out.println(text);

        }
        System.out.println("Megoldas: " + randomNumb);

    }


    public static void main(String[] args) {
        boolean inputTippGo = true;
        int gameRound = 0;
        int win = 0;
        int lose = 0;
        System.out.println("Gondoltam egy szamra, talald ki!\nx-el leallithatod barmmikor\n");
        while (inputTippGo) {

            System.out.println("Akarsz jatszani? (y/n)");
            inputTipp = scanner.nextLine();
            if (inputTipp.equals("n")) {
                inputTippGo = false;
            } else {
                gameRound++;
                System.out.println("Korlatlan tippelest szeretnel (ird be: k) vagy be akarod allitani magadnak (ird be: sz)? ");
                inputTipp = scanner.nextLine();
                if (inputTipp.equals("x")) {
                    inputTippGo = false;
                } else if (inputTipp.equals("k")) {
                    int korlatlan = 10000;
                    tipp(korlatlan);
                } else if (inputTipp.equals("sz")) {
                    System.out.println("Hany tippbol szeretned kitalalni? ");
                    inputTipp = scanner.nextLine();
                    int tippRound = Integer.parseInt(inputTipp);
                    tipp(tippRound);
                    if (loser) {
                        System.out.println("Nem sikerult!");
                        lose++;
                    }

                }
            }

        }
        win = gameRound - lose;
        System.out.println(gameRound + " korbol " + win + "x nyertel es " + lose + "x vesztettel!");

    }
}
