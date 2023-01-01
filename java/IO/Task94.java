import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.pow;

/*
A task64 megoldása alapján bővítsétek ki a számológép működését, hogy amit a
felhasználó számol és annak eredménye kerüljön elmentésre egy naplófájlként.
(calculator.log) néven

Dolgozzátok át a számológép programot úgy, hogy tartalmazzon külön metódust az
adatokbekérésre a felhasználótól ( getNumberFromUser() ), valamint egyet az
operátor beolvasásra (getOperatorFromUser() ). Ezt követően egy külön metódust amely
elvégzi a műveletet és visszaadja az eredményt ( getCalculationResult(operator,
number1,number2) ), Végül egy metódust ami kiírja az eredményt a konzolra
(showResultToTheUser(result) )
 */
public class Task94 {
    static Scanner scanner = new Scanner(System.in);

    static int getNumberFromUser() {
        List<String> inputStrings = new ArrayList<>();
        System.out.println("adj meg egy szamot: ");
        return Integer.parseInt(scanner.nextLine());
    }

    static String getOperatorFromUser() {
        System.out.println("milyen muveletet? + - / * Pumped :");

        return scanner.nextLine();
    }

    public static String getCalculationResult(String operator, int number1, int number2) {

        String result = "";
        int add = number1 + number2;
        int subtr = number1 - number2;
        int multipln = number1 * number2;
        double division = number1 / number2;
        double kob = pow(number1, number2);

        if (operator.equals("+")) {
            result = String.valueOf(add);
        } else if (operator.equals("-")) {
            result = String.valueOf(subtr);

        } else if (operator.equals("*")) {
            result = String.valueOf(multipln);

        } else if (operator.equals("/")) {
            result = String.valueOf(division);

        } else if (operator.equals("Pumped")) {
            result = String.valueOf(kob);
        }
        return result;
    }

    public static void showResultToTheUser(String result) {
        System.out.println(result);
    }


    public static void main(String[] args) {
        int num1 = getNumberFromUser();
        int num2 = getNumberFromUser();
        String op = getOperatorFromUser();
        String res = getCalculationResult(op, num1, num2);
        showResultToTheUser(res);
        try {
            FileWriter f = new FileWriter("src/resources/calculator.log", true);
            PrintWriter p = new PrintWriter(f);
            p.println(num1 + op + num2 + "=" + res);
            p.close();
        } catch (IOException ex) {
            System.out.println("File dosen't exist");
        }
    }

}
