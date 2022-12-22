import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Írjatok egy bevásárló lista programot, amely nem csinál mást, mint a felhasználótól
beolvasott elemeket, majd az elemhez tartozó darabszámot elmenti egy Map-be és a
végén ki is írja a felhasználó számára az elmentett elemeket.
a) fix 7 elemű legyen a Map, pontosan 7 elemet lehessen hozzáadni
b) oldjuk meg, hogy ha az elem már szerepel a Map-ben, akkor írja ki a program,
hogy “Az elem darabszáma frissítésre került”
c) ne legyen limitálva, hogy mennyi elemet adhat a felhasználó. Miután hozzáadott
3 elemet a felhasználó, kérdezze meg minden elem hozzáadása után, hogy
szeretne-e új elemet hozzáadni. “Y” esetén újbóli beolvasás, “N” esetén a Map
kiíratása következik.

 */
public class Task55 {
    public static void main(String[] args) {
        Map<String, Integer> shoppingList = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean whileInput = true;
        int allProdacts = 0;
        while (whileInput) {
            System.out.println("Nev: ");
            String name = scanner.nextLine();
            System.out.println("Db szam: ");
            String number = scanner.nextLine();
            if (shoppingList.containsKey(name)) {
                System.out.println("Az elem darabszáma frissítésre került");
                allProdacts -= shoppingList.get(name);
            }
            shoppingList.put(name, Integer.parseInt(number));

            if (shoppingList.size() >= 3) {
                System.out.println("Szeretne uj elemet hozza adni? Y/N");
                String yesOrNo = scanner.nextLine();
                if (!yesOrNo.equals("Y")) {
                    whileInput = false;
                }

            }
            allProdacts += Integer.parseInt(number);

        }
        for (String numb : shoppingList.keySet()) {
        }
        for (String i : shoppingList.keySet()) {
            System.out.println(i + " " + shoppingList.get(i));
        }
        System.out.println("Darabszam osszesen: " + allProdacts);


    }
}
