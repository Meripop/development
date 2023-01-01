import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Adott egy neveket tartalmazó fájl. Készítsünk egy programot, ami beolvassa annak
tartalmát és megvizsgálja, hogy a console-ról beolvasott név benne van-e.
 */
public class Task87 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String fromUser = scanner.nextLine();
        List<String> fileContent = new ArrayList<>();
        try {
            fileContent = Files.readAllLines(Path.of("src/resources/names.txt"));
        } catch (IOException ex) {
            System.out.println("File doesn't exist");
        }
        System.out.println(fileContent.contains(fromUser));
    }
}
