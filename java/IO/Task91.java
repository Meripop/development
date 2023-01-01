import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
) Készítsetek egy élelmiszerkészlet alkalmazást. Tegyünk fel, hogy van egy fájl, ami
tartalmazza, hogy éppen milyen típusú élelmiszerből mennyi van otthon és hogy mennyi
az ajánlott mennyiség. A fájl hasonlóan néz ki a ehhez (actual-food-set.csv):
Name,Amount, Required Amount
Coffee, 17, 25
Milk, 0, 3
Cola, 1, 2
Orange, 4, 5
Oat flakes, 2, 4
A feladat, hogy készítsünk egy programot, ami értesít minket arról, hogyha valamelyik
komponensből 50%, vagy annál kevesebb van, és szól, hogy vegyünk belőle annyit
amennyi hiányzik az ajánlott mennyiség eléréséhez
 */
public class Task91 {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new File("src/resources/actual-food-set.csv.txt"), "Cp1250")) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                counter(line);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }

    }

    private static void counter(String line) {
        String name = line.split(",")[0];
        int amount = Integer.parseInt((line.split(",")[1]).trim());
        int requiredAmount = Integer.parseInt((line.split(",")[2]).trim());
        if (requiredAmount / 2 >= amount) {
            int result = requiredAmount - amount;
            System.out.println("You need of " + name + " portion: " + result);
        }
    }
}
