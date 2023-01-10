import java.util.Random;

public class Task14 {
    /*
    Készítsetek programot, amely más lottóknak megfelelő potenciális
    nyerőszámokat is kiírja a képernyőre.
hatoslottónak és skandináv lottó
eurojackpot és luxor

     */
    public static void main(String[] args) {
//hatos:
        Random random = new Random();
        int number1 = random.nextInt(45) + 1;
        int number2 = random.nextInt(45) + 1;
        int number3 = random.nextInt(45) + 1;
        int number4 = random.nextInt(45) + 1;
        int number5 = random.nextInt(45) + 1;
        int number6 = random.nextInt(45) + 1;

        while (number2 == number1) {
            number2 = random.nextInt(45) + 1;
        }

        while (number3 == number1 || number3 == number2) {
            number3 = random.nextInt(45) + 1;
        }

        while (number4 == number1 || number4 == number2 || number4 == number3) {
            number4 = random.nextInt(45) + 1;
        }

        while (number5 == number1 || number5 == number2 || number5 == number3 || number5 == number4) {
            number5 = random.nextInt(45) + 1;
        }
        while (number6 == number1 || number6 == number2 || number6 == number3 || number6 == number4 || number6 == number5) {
            number5 = random.nextInt(45) + 1;
        }
        System.out.println("Hatoslotto: " + number1 + " " + number2 + " " + number3 + " " + number4 + " " + number5 + " " + number6);

//skandinav:

        number1 = random.nextInt(35) + 1;
        number2 = random.nextInt(35) + 1;
        number3 = random.nextInt(35) + 1;
        number4 = random.nextInt(35) + 1;
        number5 = random.nextInt(35) + 1;
        number6 = random.nextInt(35) + 1;
        int number7 = random.nextInt(35) + 1;

        while (number2 == number1) {
            number2 = random.nextInt(35) + 1;
        }

        while (number3 == number1 || number3 == number2) {
            number3 = random.nextInt(35) + 1;
        }

        while (number4 == number1 || number4 == number2 || number4 == number3) {
            number4 = random.nextInt(35) + 1;
        }

        while (number5 == number1 || number5 == number2 || number5 == number3 || number5 == number4) {
            number5 = random.nextInt(35) + 1;
        }
        while (number6 == number1 || number6 == number2 || number6 == number3 || number6 == number4 || number6 == number5) {
            number5 = random.nextInt(35) + 1;
        }
        while (number7 == number1 || number7 == number2 || number7 == number3 || number7 == number4 || number7 == number5 || number7 == number6) {
            number5 = random.nextInt(35) + 1;
        }
        System.out.println("Skandinav: " + number1 + " " + number2 + " " + number3 + " " + number4 + " " + number5 + " " + number6 + " " + number7);
//eurojackpot:

        number1 = random.nextInt(50) + 1;
        number2 = random.nextInt(50) + 1;
        number3 = random.nextInt(50) + 1;
        number4 = random.nextInt(50) + 1;
        number5 = random.nextInt(50) + 1;
        number6 = random.nextInt(12) + 1;
        number7 = random.nextInt(12) + 1;

        while (number2 == number1) {
            number2 = random.nextInt(50) + 1;
        }

        while (number3 == number1 || number3 == number2) {
            number3 = random.nextInt(50) + 1;
        }

        while (number4 == number1 || number4 == number2 || number4 == number3) {
            number4 = random.nextInt(50) + 1;
        }

        while (number5 == number1 || number5 == number2 || number5 == number3 || number5 == number4) {
            number5 = random.nextInt(50) + 1;
        }
        while (number6 == number1 || number6 == number2 || number6 == number3 || number6 == number4 || number6 == number5) {
            number5 = random.nextInt(12) + 1;
        }
        while (number6 == number7) {
            number7 = random.nextInt(12) + 1;
        }
        System.out.println("Eurojackpot: " + number1 + " " + number2 + " " + number3 + " " + number4 + " " + number5);
        System.out.println(number6 + " " + number7);
    }

}

