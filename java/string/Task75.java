import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//!!
/*
Készítsetek teszteset futási összesítő alkalmazást. A futási eredmények az alábbi
formában tároljuk le egy ArrayList-ben vagy konzolról beolvasva kapjuk. Minden
teszteset futás kezdődik egy 4 számjegyű számmal, majd egy 1-es ha PASS, X ha SKIP,
valamint 0 ha FAILED. Egy példa adat tehát: 00171 A feladat, hogy számoljuk össze
a) Összesen hány teszteset került futtatásra?
b) Mennyi volt PASS? SKIP? FAILED?
c) Jelenítsük meg az adatokat százalékos formában is

 */
public class Task75 {
    private static void countOfTests() {
        Scanner scanner = new Scanner(System.in);

        List<String> tests = new ArrayList<>();
        int counterOfPass = 0;
        int counterOfSkip = 0;
        int counterOfFailed = 0;
        int allTest = 0;
        String inputext = "";
        while (true) {
            System.out.println("Type a test case number: ");
            inputext = scanner.nextLine();
            if (inputext.equalsIgnoreCase("x"))
                break;
            else {
                tests.add(inputext);
                allTest++;
                char result = inputext.charAt(4);
                System.out.println(result);
                switch (result) {
                    case '1' -> counterOfPass++;
                    case '0' -> counterOfSkip++;
                    case 'X' -> counterOfFailed++;
                    default -> {
                        System.out.println("Nem jo adat");
                        allTest--;
                    }
                }
            }
        }
        double allTestToDouble = allTest;
        double counterPassToDouble = counterOfPass;
        double counterOfSkipToDouble = counterOfSkip;
        double counterOfFailedToDouble = counterOfFailed;
        System.out.println("All test: " + allTest);
        System.out.println("Pass: " + counterOfPass + " " + counterPassToDouble / allTestToDouble * 100 + "%-a");
        System.out.println("Skip: " + counterOfSkip + " " + counterOfSkipToDouble / allTestToDouble * 100 + "%-a");
        System.out.println("Failed: " + counterOfFailed + " " + counterOfFailedToDouble / allTestToDouble * 100 + "%-a");

    }


    public static void main(String[] args) throws IOException {
        countOfTests();
    }

}
