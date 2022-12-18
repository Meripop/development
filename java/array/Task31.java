import java.util.Random;

/*
Készítsünk egy tömböt, amiben 1-90-ig random számokat tárolunk, szám szerint 5-öt (lehetnek egyezőek). Majd írassuk is ki őket egysorban.

 */
public class Task31 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randomNumbs = new int[5];
        for (int i = 0; i < randomNumbs.length; i++) {

            randomNumbs[i] = random.nextInt(90) + 1;
            System.out.print(randomNumbs[i] + " ");
        }

    }
}
