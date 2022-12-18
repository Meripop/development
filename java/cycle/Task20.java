import java.util.Scanner;

/*
Készítsetek egy életkor ellenőrző programot, amely bekéri a felhasználótól a használni kívánt életkort, majd ellenőrzi, hogy negatív számot (vagy 0-t) adott-e meg. Ismételjük mindaddig a bekérés utasítását, amíg helyes életkort nem adott meg a felhasználó.
használjunk while ciklust az implementációhoz
használjunk do while ciklust az implementációhoz

 */
public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputAge;
        do {
            System.out.println("Age: ");
            inputAge = scanner.nextInt();

        } while (inputAge <= 0);
        System.out.println("With do while :" + inputAge);

        inputAge = 0;
        while (inputAge <= 0) {
            System.out.println("Age: ");
            inputAge = scanner.nextInt();
        }
        System.out.println("With while :" + inputAge);

    }
}
