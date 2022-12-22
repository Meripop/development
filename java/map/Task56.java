import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 Készítsetek egy számla végösszeg kalkulátor programot, amelybe be lehet rögzíteni az
adott hónap különböző számláinak az összegét. A program pedig összeadja őket és
kiírja mennyit kell a családi kasszából fizetni összesen. Magát, hogy milyen számla az
amit be kell fizetni, az is kerüljön beolvasásra az összegekkel együtt (de külön
beolvasással - 3 darab -).
a) Az elemek kerüljenek Mapben mentésre, majd összeadásra és kiíratása.
b) Amennyiben a felhasználó 0 ft-os számlát ír, úgy azt törölje ki a Map-ből a
program
 */
public class Task56 {
    public static void main(String[] args) {
        Map<String, Integer> szamlak = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (szamlak.size() != 3) {
            System.out.println("Szamla: ");
            String name = scanner.nextLine();
            System.out.println("Osszeg: ");
            String number = scanner.nextLine();
            szamlak.put(name, Integer.parseInt(number));
            if (Integer.parseInt(number) == 0) {
                szamlak.remove(name);
            }

        }

        int numbers = 0;
        for (String numb : szamlak.keySet()) {
            numbers += szamlak.get(numb);
        }
        System.out.println("Fizetendo: " + numbers);
        System.out.println(szamlak);
    }
}
