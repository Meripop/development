import java.io.*;
import java.util.Scanner;


/*
 Készítsünk egy reportoló alkalmazást, ami a 75-s feladat megoldásán alapul. Tegyük fel,
hogy a teszt futások eredményei egy testexecutionresults.txt-ben vannak tárolva.
Olvassuk be a fájl (minimum 20 sor szerepeljen benne), dolgozzuk fel és az eredményt
egy testexecutionreport.txt-be mentsük el.:
Készítsetek teszteset futási összesítő alkalmazást. A futási eredmények az alábbi
formában tároljuk le egy ArrayList-ben vagy konzolról beolvasva kapjuk. Minden
teszteset futás kezdődik egy 4 számjegyű számmal, majd egy 1-es ha PASS, X ha SKIP,
valamint 0 ha FAILED. Egy példa adat tehát: 00171 A feladat, hogy számoljuk össze
a) Összesen hány teszteset került futtatásra?
b) Mennyi volt PASS? SKIP? FAILED?
c) Jelenítsük meg az adatokat százalékos formában is
 */
public class Task96 {
    private static void countOfTests() throws FileNotFoundException {
        int counterOfPass = 0;
        int counterOfSkip = 0;
        int counterOfFailed = 0;
        int wrongData = 0;
        int allTest = 0;

        try {
            Scanner scanner = new Scanner(new File("src/resources/testexecutionresults.txt"), "Cp1250");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                char[] lineChar = line.toCharArray();
                char result = lineChar[4];
                allTest++;
                if (result == '0') {
                    System.out.println(result + " pass");
                    counterOfPass++;
                } else if (result == '1') {
                    counterOfSkip++;
                } else if (result == 'X') {
                    counterOfFailed++;
                } else {
                    System.out.println(result + " default");
                    wrongData++;
                }
            }

        } catch (IOException ex) {
            System.out.println("File dosen't exist");
        }
        double allTestToDouble = allTest;
        double counterPassToDouble = counterOfPass;
        double counterOfSkipToDouble = counterOfSkip;
        double counterOfFailedToDouble = counterOfFailed;
        double counterOWrongData = wrongData;
        try {
            FileWriter fileWriter = new FileWriter("src/resources/testexecutionreport.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("All test: " + allTest);
            printWriter.println("Pass: " + counterOfPass + " " + counterPassToDouble / allTestToDouble * 100 + "%-a");
            printWriter.println("Skip: " + counterOfSkip + " " + counterOfSkipToDouble / allTestToDouble * 100 + "%-a");
            printWriter.println("Failed: " + counterOfFailed + " " + counterOfFailedToDouble / allTestToDouble * 100 + "%-a");
            printWriter.println("Wrong data: " + wrongData + " " + counterOWrongData / allTestToDouble * 100 + "%-a");
            printWriter.close();
        } catch (IOException ex) {
            System.out.println("File doesen't exist");
        }
    }

    public static void main(String[] args) throws IOException {
        countOfTests();
    }

}
