package enum108;

import java.time.DayOfWeek;
import java.time.LocalDate;

/*
 Készítsünk egy alkalmazást, mely az aktuális napról eldönti,
 hogy az italos nap-e vagy sem. A napok vizsgálatához használjunk
 switch-case-t.


 */
public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DayOfWeek nameOfToday = today.getDayOfWeek();
        String txt = " ";

        switch (nameOfToday) {
            case MONDAY, SUNDAY, TUESDAY, WEDNESDAY, THURSDAY -> txt = "No luck";
            case FRIDAY, SATURDAY -> txt = "Lucky day";
        }

        System.out.println(txt);
    }

}
