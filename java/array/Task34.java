/*
 Írjunk egy programot, amely egy array-ben elmenti a számokat 1-21-ig majd kiírja őket visszafele egymás után szóközzel elválasztva.

 */
public class Task34 {
    public static void main(String[] args) {
        int[] numbs = new int[21];
        for (int i = 0; i <= 20; i++) {
            numbs[i] = i + 1;
        }
        for (int i = numbs.length - 1; i >= 0; i--) {
            System.out.print(numbs[i] + " ");
        }
        {

        }

    }

}
