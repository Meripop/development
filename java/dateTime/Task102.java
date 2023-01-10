import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Task102 {
    /*
    Hozzunk létre egy LocalDateTime típusú birthday
     változót, melyben elmentjünk a születésnapunkat
     dátum + idő formátumban. Írjunk programot, mely kiírja hogy a
    következő 5 évben milyen napra fog esni a születésnapunk
     */
    public static void main(String[] args) {
        LocalDateTime bithday = LocalDateTime.parse("1998-09-23T12:34");
        LocalDateTime birthdayOtherYears = LocalDateTime.of(LocalDateTime.now().getYear(), bithday.getMonth(), bithday.getDayOfMonth(), bithday.getHour(), bithday.getMinute());
        for (int i = 0; i < 5; i++) {
            System.out.println(birthdayOtherYears.getDayOfWeek());
            birthdayOtherYears = birthdayOtherYears.plusYears(1);

        }
    }
}
