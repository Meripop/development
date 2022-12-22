import java.util.ArrayList;
import java.util.List;

/*
 Készítsünk egy listát kedvenc gyümölcsökkel. Adjunk hozzá a listához legalább 7
gyümölcsöt és foreach ciklus segítségével írassuk ki az elemeit a képernyőre egymás
alá. Metodussal.
 */
public class Task69 {
    private static List<String> getFavouriteFruits() {
        List<String> favoriteFruits = new ArrayList<>();
        favoriteFruits.add("melon");
        favoriteFruits.add("apple");
        favoriteFruits.add("lemon");
        favoriteFruits.add("orange");
        favoriteFruits.add("lemon");
        favoriteFruits.add("banana");
        favoriteFruits.add("peach");
        favoriteFruits.add("strawberry");
        return favoriteFruits;
    }

    private static void printListWithPrintln(List<String> favoriteFruits) {
        System.out.println(favoriteFruits);
    }



    private static void printListWithForeach(List<String> favoriteFruits) {
        for (String gyumi : favoriteFruits) {
            System.out.println(gyumi);
        }
    }

    private static void printListWithFor(List<String> favoriteFruits) {
        for (int i = 0; i < favoriteFruits.size(); i++) {
            System.out.println(favoriteFruits.get(i) + " ");
        }
    }

    private static void printListWithWhile(List<String> favoriteFruits) {
        int i = 0;
        while (i < favoriteFruits.size()) {
            System.out.println(favoriteFruits.get(i));
            i++;
        }
    }

    private static void printListDoWhile(List<String> favoriteFruits) {
        int i = 0;
        do {
            System.out.println(favoriteFruits.get(i));
            i++;
        } while (i < favoriteFruits.size());
    }


    public static void main(String[] args) {
        getFavouriteFruits();
        System.out.println("Print ");
        printListWithPrintln(getFavouriteFruits());
        System.out.println("\nPrint with foreach ");
        printListWithForeach(getFavouriteFruits());
        System.out.println("\nPrint with for ");
        printListWithFor(getFavouriteFruits());
        System.out.println("\nPrint with while ");
        printListWithWhile(getFavouriteFruits());
        System.out.println("\nPrint with doWile ");
        printListDoWhile(getFavouriteFruits());
    }
}
