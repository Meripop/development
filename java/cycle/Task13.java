
import java.util.Random;


/*
Írjunk programot, mely 5-ös lottó lehetséges számait generálja le nekünk a program indítását követően.
 */
public class Task13 {

    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int num1 = random.nextInt(90) + 1;
            System.out.print(num1 + " ");
        }
    }
}
