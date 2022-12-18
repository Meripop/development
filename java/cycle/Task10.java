/*
Készítsetek egy programot, amely a számok szorzatát írja ki 0-tól 10-ig. (magukat a számokat nem, csak az összes szám szorzatát)
készítsük el while-al
készítsük el for-al

 */
public class Task10 {
    public static void main(String[] args) {
        int b = 0;
        for (int i = 0; i <= 10; i++) {
            b *= i;
        }
        System.out.println("Result with for: " + b);

        int counter = 0;
        b = 0;
        while (counter <= 10) {
            b *= counter;
            counter++;
        }
        System.out.println("Result with while: " + b);
    }

}