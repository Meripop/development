import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Írjatok egy bevásárló lista programot. Amely nem csinál mást, mint a felhasználótól
beolvasott elemeket elmenti egy List-be és a végén ki is írja a felhasználó számára az
elmentett elemeket.
a) fix 7 elemű legyen a lista, pontosan 7 elemet lehessen hozzáadni
b) ne legyen limitálva, hogy mennyi elemet adhat a felhasználó. Ha a felhasználó az
“x” karaktert ír lista elemként, akkor szakítsa meg a beolvasást és folytatódjon a
program futása.
c) oldjuk meg, hogy csak akkor adja hozzá a listához a felhasználó által beírt elemet
ha még nincs benne. Ha már benne van, akkor írjuk ki, hogy “Ez az elem már
hozzáadásra került!”
 */
public class Task43 {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean stop = true;
        while (stop) {
            System.out.println("Adj hozzá a bevásárló listához elemet: ");
            String newItem = scanner.nextLine();
            if (newItem.equals("x")) {
                stop = false;
            } else {
                if (!shoppingList.contains(newItem)) {
                    shoppingList.add(newItem);
                }
            }

        }
        System.out.println(shoppingList);
        //  String[] shoppingList= new String[7];

     /*   for (int i = 0; i < shoppingList.length; i++) {
            String newItem= scanner.nextLine();
            for (int j = 0; j < shoppingList.length; j++) {
                if (newItem.equals(shoppingList[j])){
                    System.out.println("new one Please: ");
                    i--;
                }
            }

            shoppingList[i]=newItem;

        }
        for (int i = 0; i < shoppingList.length; i++) {
            System.out.println(shoppingList[i]);

        } */

    }

}
