import java.io.*;
import java.nio.file.Path;
import java.util.*;

public class Task92 {
    /*
     Módosítsátok az 57-es feladat megoldását úgy, hogy a könyvek egy books.txt-ből
jöjjenek az előre definiált arraylist helyett, valamint a megoldás is egy booksCount.txt-be
kerüljön.

     */

    public static void main(String[] args) throws FileNotFoundException {
        List<String> booksTitle = Arrays.asList("Son", "Harry Potter VI.", "Down and Out in Paris and London", "All about Sam", "1984", "Keep the Aspidistra Flying", "The Fellowship of the Ring", "Keep the Aspidistra Flying", "A Summer to Die", "Harry Potter V", "The Return of the King", "Harry Potter VI.", "The Return of the King", "Down and Out in Paris and London", "Harry Potter V", "A Summer to Die", "Harry Potter I.", "Harry Potter III.", "All about Sam", "Animal Farm", "Gathering Blue", "Homage to Catalonia", "Son", "The Two Towers", "Harry Potter III.", "Messenger", "The Return of the King", "Homage to Catalonia", "Harry Potter III.", "Harry Potter I.", "The Two Towers", "Gathering Blue", "Messenger", "The Fellowship of the Ring", "1984", "Harry Potter VI.", "Keep the Aspidistra Flying", "Gathering Blue", "Harry Potter V", "Harry Potter II.", "Homage to Catalonia", "Harry Potter V", "Animal Farm", "All about Sam", "Son");
        Map<String, Integer> booksMap = new HashMap<>();
        try {
            FileWriter f = new FileWriter("src/resources/books.txt");
            PrintWriter p = new PrintWriter(f);
            for (int i = 0; i < booksTitle.size(); i++) {
                p.println(booksTitle.get(i));
            }
            p.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (Scanner scanner = new Scanner(new File("src/resources/books.txt"), "Cp1250")) {
            while (scanner.hasNextLine()) {
                String info = scanner.nextLine();
                System.out.println(info);
                if (booksMap.containsKey(info)) {
                    booksMap.put(info, booksMap.get(info) + 1);
                } else {
                    booksMap.put(info, 1);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        System.out.println("a)");
        for (Map.Entry mapElement : booksMap.entrySet()) {
            System.out.println(mapElement.getKey() + " - " + mapElement.getValue() + " darab");
        }
        System.out.println("b)");
        System.out.println("\n" + booksMap.size() + " fele konyv van\n");
        int sum = booksMap.values().stream().reduce(0, Integer::sum);
        System.out.println(sum + " db konyv van osszesen\n");

        System.out.println("c) d)");
        booksMap.entrySet()
                .removeIf(entry -> entry.getValue() == 1);


        for (Map.Entry mapElement : booksMap.entrySet()) {
            if (booksMap.containsValue(4)) {
                booksMap.put(mapElement.getKey().toString(), 3);
            }
        }

        try {
            FileWriter f = new FileWriter("src/resources/books.txt");
            PrintWriter p = new PrintWriter(f);
            for (Map.Entry book : booksMap.entrySet()) {
                p.println(book.getKey() + " " + book.getValue());
            }
            p.close();
        } catch (FileNotFoundException ex) {
            System.out.println("file not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (Map.Entry mapElement : booksMap.entrySet()) {
            System.out.println(mapElement.getKey() + " - " + mapElement.getValue() + " darab");
        }
    }
}
