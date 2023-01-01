import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
Készítsetek egy olyan alkalmazást, amely egy fájlból felolvas különböző háromszögek
lehetséges értékeit. Minden egyes sor egy lehetséges háromszög oldalait tartalmazza.
(triangleExamples.txt). A program végig iterál a listán ami a fájlban van és minden egyes
sorról eldönti hogy a háromszög szerkeszthető-e és ki is írja a képernyőre. Minimum
minden olyan esetet vegyetek fel mint példa háromszög, ami szerintetek szükség van,
hogy megfelelően le legyen tesztelve a logika. Az eredmény kerüljön lementésre egy
fájlba (triangleResults.log).

 */
public class Task95 {
    public static void main(String[] args) {
        int numb1 = 0;
        int numb2 = 0;
        int numb3 = 0;

        try (Scanner scanner = new Scanner(new File("src/resources/triangleExamples.txt"), "CP1250")) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                numb1 = Integer.parseInt(line.split(" ")[0]);
                numb2 = Integer.parseInt(line.split(" ")[1]);
                numb3 = Integer.parseInt(line.split(" ")[2]);
                writeToFile(counter(numb1, numb2, numb3), numb1, numb2, numb3);
            }
        } catch (IOException ex) {
            System.out.println("File dosen't exist!");
        }
    }

    private static String counter(int numb1, int numb2, int numb3) {
        String result;
        if (numb1 + numb2 > numb3 && numb2 + numb3 > numb1 && numb1 + numb3 > numb2) {
            result = "Szerkeszthető";

        } else {
            result = "Nem szerkeszthető";
        }
        System.out.print(numb1 + " ");
        System.out.print(numb2 + " ");
        System.out.print(numb3 + ": ");
        System.out.println(result);

        return result;
    }

    private static void writeToFile(String result, int numb1, int numb2, int numb3) {
        try {
            FileWriter f = new FileWriter("src/resources/triangleResults.log", true);
            PrintWriter p = new PrintWriter(f);
            p.println(numb1 + " " + numb2 + " " + numb3 + ": " + result);
            p.close();
        } catch (IOException ex) {
            System.out.println("File dosen't exist!");
        }
    }

}
