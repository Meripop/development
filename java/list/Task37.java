import java.util.ArrayList;
import java.util.List;

/*
Készítsünk egy listát kedvenc gyümölcsökkel. Adjunk hozzá a listához legalább 7 gyümölcsöt és foreach ciklus segítségével írassuk ki az elemeit a képernyőre egymás alá.

 */
public class Task37 {
    public static <String> void main(String[] args) {
        List<java.lang.String> favoriteFruits = new ArrayList<>();
        favoriteFruits.add("melon");
        favoriteFruits.add("apple");
        favoriteFruits.add("orange");
        favoriteFruits.add("lemon");
        favoriteFruits.add("banana");
        favoriteFruits.add("peach");
        favoriteFruits.add("strawberry");

        for (java.lang.String fruit : favoriteFruits) System.out.println(fruit);

    }
}
