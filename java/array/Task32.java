/*
Készítsetek egy programot, amely elszámol 1-től 100-ig és a páros számokat lementi egy evenNumbers nevű array-be. Írjuk is ki a képernyőre egy sorban az értékeit.

 */
public class Task32 {
    public static void main(String[] args) {

        int[] evenNumbers = new int[51];
        int evenNumbersIndex = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenNumbersIndex] = i;
                evenNumbersIndex++;
            }

        }
        for (int evenNumber : evenNumbers) {
            System.out.print(evenNumber + " ");
        }


    }
}
