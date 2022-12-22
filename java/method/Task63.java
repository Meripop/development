
import java.util.Scanner;

/*
 A háromszög eldöntős programunk dolgozzuk át, hogy külön metódus legyen az
oldal beolvasás ( getTriangleDataFromConsole() ), külön metódus a háromszög
szerkeszthetősége ( isTriangeValid(aoldal,boldal,coldal) )és külön az eredmény String
kiíratása ( showResultToTheUser(result) )
 */
public class Task63 {
    public static int[] getTriangleDataFromConsole() {
        int[] inputNumbs = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("adj meg egy szamot: ");
            Scanner scanner = new Scanner(System.in);
            inputNumbs[i] = scanner.nextInt();
        }
        return inputNumbs;
    }

    public static String isTriangeValid(int[] numbs) {
        int numb1 = numbs[0];
        int numb2 = numbs[1];
        int numb3 = numbs[2];
        if (numb1 + numb2 > numb3 && numb2 + numb3 > numb1 && numb1 + numb3 > numb2) {
            String eredmeny = "You are a lucky person, triangle";
            return eredmeny;
        } else {
            String eredmeny = "Not triangle";
            return eredmeny;
        }

    }

    public static void showResultToTheUser(String result) {
        System.out.println(result);
    }

    public static void main(String[] args) {

        showResultToTheUser(isTriangeValid(getTriangleDataFromConsole()));


    }

}
