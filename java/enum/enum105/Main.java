package enum105;

/*
Készítsünk egy alkalmazást, mely az előre definiált hét
napjait tartalmazó enumot felolvassa és visszaadja a lehetséges értékeit
 */

import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        for (Days day : Days.values()) {
            System.out.println(day);
        }
//Default day enum :
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
        }

    }
}