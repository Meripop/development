/*
Készítsünk egy tömböt, amiben tároljuk a hét napjait és írassuk ki az elemeit egy ciklussal majd külön egy napot is, amelyik a kedvenc napunk.
 */
public class Task30 {
    public static void main(String[] args) {

        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (String weekday : weekdays) {
            System.out.println(weekday);
        }
        System.out.println("My favorite day is " + weekdays[5]);
    }
}
