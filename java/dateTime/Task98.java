import java.time.LocalDate;

public class Task98 {
    /*
    Készítsetek egy programot amely kiírja az aktuális napot
    és még 10 darab napot, melyek az ezt követő hónapban vannak.
    (Tehát minden egyes kiírt nap
     pontosan egy hónappal későbbi az előző dátumnál)
     */
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);
        for (int i = 1; i <= 10; i++) {
            System.out.println(today.plusMonths(i));

        }
    }
}
