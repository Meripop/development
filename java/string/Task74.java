import java.io.IOException;
import java.util.Scanner;

/*
) Írjunk programot, amely a beolvasott cikkszám (fixen 6 karakter hosszú), majd
közvetlen utána lévő darabszám beviteli értéket fel tudja dolgozni, és össze tudja adni
őket, hogy összesen hány termék van. Figyelünk oda, hogy 0-s darabszám nem lehet,
illetve az egyszerűség kedvéért maximum 9 lehet a darabszám. Egy példa tétel: 1376367

 */
public class Task74 {
    private static int countOfProduts() {
        Scanner scanner = new Scanner(System.in);

        int counterOfPieces2 = 0;
        String inputext = "";
        while (!inputext.equals("x")) {
            System.out.println("Ird be a cikkszamat es darabszamat (7665543) : ");
            inputext = scanner.nextLine();
            if (inputext.equalsIgnoreCase("x"))
                break;

            if (inputext.length() == 7) {
                counterOfPieces2 = getCalculate(inputext, counterOfPieces2);
            } else {
                System.out.println("Nem jo!");
            }
        }
        return counterOfPieces2;
    }

    private static int getCalculate(String inputext, int counterOfPieces2) {

        int inputToInt2 = Integer.parseInt(inputext.substring(6));
        if (inputToInt2 > 0 && inputToInt2 <= 9) {
            counterOfPieces2 += inputToInt2;
        }
        return counterOfPieces2;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(countOfProduts());

    }
}
