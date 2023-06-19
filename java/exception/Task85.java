import java.util.InputMismatchException;
import java.util.Scanner;

/*
Készítsetek egy metódust (getNumberFromConsole()), amely beolvas egy számot a
konzolról, a nextInt() metódus segítségével. Próbáljátok ki milyen exception érkezik, ha
futtatáskor szám helyett valami szöveget írtuk. Ha megvan az exception neve,
a) akkor írjatok rá egy try-catch blokkot amely-ben elkapjátok ezt az exceptiont és
kiírjátok a konzolra az alábbi üzenetet: “You added a string, only number please!”
b) Dobjátok tovább a metódusban keletkező lehetséges exceptiont, és a hívás
helyén a main-ben kapjátok el
c) (extra) mindaddig kérjen be a felhasználótól adatot, amíg számot nem ad

 */
public class Task85 {
    static Scanner scanner = new Scanner(System.in);

    public static int getNumberFromConsole() throws InputMismatchException {
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int result = 0;
        boolean isItNotNumber = true;
        while (isItNotNumber) {
            try {
                result = getNumberFromConsole();
                isItNotNumber = false;
            } catch (InputMismatchException exception) {
                isItNotNumber = true;
                System.out.println("You added a string, only number please!");
            }
        }
        if (result != 0)
            System.out.println(result);
    }


}

