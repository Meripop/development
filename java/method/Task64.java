import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
Dolgozzátok át a számológép programot úgy, hogy tartalmazzon külön metódust az
adatokbekérésre a felhasználótól ( getNumberFromUser() ), valamint egyet az
operátor beolvasásra (getOperatorFromUser() ). Ezt követően egy külön metódust amely
elvégzi a műveletet és visszaadja az eredményt ( getCalculationResult(operator,
number1,number2) ), Végül egy metódust ami kiírja az eredményt a konzolra
(showResultToTheUser(result) )

 */
import static java.lang.Math.pow;

public class Task64 {
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
            result = "Addition is : " + add;
        } else if (operator.equals("-")) {
            result = "Substraction is : " + subtr;

        } else if (operator.equals("*")) {
            result = "Multiplation is : " + multipln;

        } else if (operator.equals("/")) {
            result = "Divisionis : " + division;

        } else if (operator.equals("Pumped")) {
            result = "Pumped : " + kob;
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
    }
}
