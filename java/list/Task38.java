import java.util.*;

/*
Írjatok egy programot, amely egy Listában eltárolja majd “visszaolvassa” a felhasználónak azt az 5 kedvenc filmjét, amit bekértünk tőle a konzol segítségével. (Külön ciklus készüljön a beolvasásra és mentésre és külön egy az eredmény kiírására)
Kerüljük el azt, hogy ha a lista eleme már létezik, akkor ne adhassuk újra hozzá.
Fejlesszük tovább az előző feladatot úgy, hogy csak akkor mentse el a beolvasott
filmet, ha még előzetesen nem adta meg azt. Vagyis kerüljük el azt, hogy ha a lista eleme
már létezik, akkor ne adhassuk újra hozzá
 */
public class Task38 {
    private static Set<String> setListOfFilm() {
        Scanner scanner = new Scanner(System.in);
        Set<String> movieTitle = new HashSet<>();

        while (movieTitle.size() != 5) {
            System.out.println("Type movie title: ");
            String input = scanner.nextLine();
            movieTitle.add(input);
        }
        return movieTitle;
    }

    public static void main(String[] args) {
        System.out.println(setListOfFilm());
    }
}
