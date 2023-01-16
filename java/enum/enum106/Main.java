package enum106;
/*
Készítsünk egy alkalmazást, mely előre definiált vizsgához tartozó
értékelési PASSED, FAILED értékeket hoz létre enumként.
A program a konzolról bekéri a felhasználótól az elért pontszámot,
és a parancssori argumentumként megadott köszöbérték vagy a feletti
érték esetén kiírja a felhasználónak, hogy PASSED, egyéb esetben pedig
hogy FAILED.
Finomhangoljuk az alkalmazásunk tovább úgy, hogy az enum értékei esetén
egy konszolidáltabb, nem csak az enum értékét tartalmazó szöveget írunk
ki a képernyőre.

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int boundaryValue = Integer.parseInt(args[0]);
        System.out.println("Type your points: ");
        Scanner scanner = new Scanner(System.in);
        int userPoints = scanner.nextInt();
        String resultTxt = "Your result: ";
        if (userPoints >= boundaryValue)
            System.out.println(resultTxt + Evaluation.PASSED);
        else
            System.out.println(resultTxt + Evaluation.FAILED);

    }

}