
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class Task104 {
    /*
    Készíts egy alkalmazást, amely folyamatosan egymás alá kiírja az aktuális
    timestamp-et, az aktuális időt,
     miliszekundumban. (szakítsuk meg a program futását a 100. Alkalom után)
     */
    public static void main(String[] args) {
        int counter = 0;
        do {
            long millisec = System.currentTimeMillis();
            LocalDateTime date = LocalDateTime.ofInstant(Instant.ofEpochMilli(millisec), ZoneId.systemDefault());
            System.out.println(date);
            counter++;
            System.out.println(counter);
        } while (counter != 100);
    }
}

