import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Készítsetek programot, amely beolvas egy híres sportolóat tartalmazó fájl, majd
megvizsgálja, hogy a parancssori argumentumként megadott sportolót tartalmazza-e.
Ha igen, írja ki hogy “It’s in the file”, egyébként pedig írja ki, hogy “No luck” a konzolra.
 */
public class Task88 {
    public static void main(String[] args) {
       /* Scanner scanner=new Scanner(System.in);
        System.out.println("Ird be egy sportolo nevet: ");
        String fromUser= scanner.nextLine();*/
        List<String> fileContent = new ArrayList<>();
        try {
            fileContent = Files.readAllLines(Path.of("src/resources/athlets.txt"));
        } catch (NoSuchFileException ex) {
            System.out.println("File doesn't exist");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("File doesn't exist");
        }
        if (fileContent.contains(args[0])) {
            System.out.println("It’s in the file");
        } else
            System.out.println("No luck");

    }
}
