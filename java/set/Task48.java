import java.util.*;

/*
Készítsünk egy halmazt a kedvenc gyümölcsökkel. Adjunk hozzá legalább 7
gyümölcsöt és foreach ciklus segítségével írassuk ki az elemeit a képernyőre egymás
alá.
 */
public class Task48 {
    public static void main(String[] args) {

        Set<String> nefruitsv = new HashSet<>(Arrays.asList("apple", "peach", "banana", "melon", "ananas", "grepfruit", "lemon"));

        for (String fruit : nefruitsv) {
            System.out.println(fruit);
        }

    }
}
