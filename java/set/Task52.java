import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/*
)Írjatok egy tippelő játék programot. Töltsünk fel egy Set-et 3 darab random számmal. A
számok 0 és 10 között lehetnek (0-val, de 10-el nem). A felhasználótól kérjünk be
számokat hasonlóan 0 és 10 között és vizsgáljuk meg benne van-e a Set-ben.
Amennyiben igen, vegyük ki belőle. Ha kiürült a Set, mert kivettünk belőle minden elemet,
akkor vége a játéknak.
a) Számoljuk, hogy hányszor kellett tippelnie a felhasználónak, majd írjuk ki:
“Gratulálunk, X kör kellett a sikerhez”.
b) Ha eltalált egy számot a felhasználó a játék során, akkor írja ki a program, hogy
“Talált, még X szám, amit meg kell keresned”
 */
public class Task52 {
    public static void main(String[] args) {
        Set<Integer> randomNums = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int countTipp = 0;
        while (randomNums.size() != 3) {
            int numb = random.nextInt(10);
            randomNums.add(numb);
        }
        while (randomNums.size() != 0) {
            System.out.println("Irj be egy szamot: ");
            int input = scanner.nextInt();
            countTipp++;
            if (randomNums.contains(input)) {
                randomNums.remove(input);
                System.out.println("Talált, még " + randomNums.size() + " szám, amit meg kell keresned");
            }
        }
        System.out.println("Gratulálunk, " + countTipp + " kör kellett a sikerhez");
    }
}
