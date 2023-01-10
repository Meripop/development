
import java.util.Random;


/*
Írjunk programot, mely 5-ös lottó lehetséges számait generálja le nekünk
a program indítását követően.
 */
public class Task13 {

    public static void main(String[] args) {
        Random random = new Random();

        int number1 = random.nextInt(90) + 1;
        int number2 = random.nextInt(90) + 1;
        int number3 = random.nextInt(90) + 1;
        int number4 = random.nextInt(90) + 1;
        int number5 = random.nextInt(90) + 1;

        while (number2 == number1) {
            number2 = random.nextInt(90) + 1;
        }

        while (number3 == number1 || number3 == number2) {
            number3 = random.nextInt(90) + 1;
        }

        while (number4 == number1 || number4 == number2 || number4 == number3) {
            number4 = random.nextInt(90) + 1;
        }

        while (number5 == number1 || number5 == number2 || number5 == number3 || number5 == number4) {
            number5 = random.nextInt(90) + 1;
        }
        System.out.println(number1 + " " + number2 + " " + number3 + " " + number4 + " " + number5);
    }
}
