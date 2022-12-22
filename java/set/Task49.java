import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
Írjatok egy programot, amely egy Set-ben eltárolja majd “visszaolvassa” a
felhasználónak azt az 5 kedvenc filmjét, amit bekértünk tőle a konzol segítségével.
(Külön ciklus készüljön a beolvasásra és mentésre és külön egy az eredmény kiírására)
 */
public class Task49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> favorite = new HashSet<>();
        while (favorite.size() != 5) {
            System.out.println("Type the title: ");
            String movie = scanner.nextLine();
            favorite.add(movie);
        }
        for (String title : favorite) {
            System.out.println(title);
        }
        System.out.println(favorite);
    }
}
