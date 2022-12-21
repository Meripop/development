import java.util.*;

/*
Írjatok egy nyaralós checklist programot, amelybe tudjátok rögzíteni, hogy mik azok a
tevékenységek, dolgok amiket a nyaralás elindulása előtt el kell intézni vagy el kell tenni,
hogy minden meglegyen, rendben legyen. Ha ‘X’-et ír tevékenység helyett, akkor fejezze
be az elemek hozzáadását.
a) ügyeljetek rá, hogy kétszer ne lehessen ugyanazt az elemet a listához adni. Ha
mégis megpróbálja a felhasználó akkor kapjon hibaüzenetet.
61
b) amennyiben a felhasználó azt az elemet adja meg, ami már létezik a listában,
úgy akkor azt törölje onnan. (jelezve, hogy az a feladat/tevékenység teljesült)
c) amennyiben elfogyott minden elem a listáról, akkor írja ki a program, hogy
“Minden megvan, indulhat a nyaralás!”

 */
public class Task44 {
    public static void main(String[] args) {
        // List<String> shoppingList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean moreItems = true;

        Set<String> shopping = new HashSet<>();
        while (moreItems) {
            System.out.println("Irj elemet: ");
            String newItem = scanner.nextLine();
            if (newItem.equals("X")) {
                moreItems = false;
            } else if (shopping.contains(newItem)) {
                shopping.remove(newItem);
                System.out.println("torolve");
                if (shopping.isEmpty()) {
                    System.out.println("Minden megvan, indulhat a nyaralás!");
                    moreItems = false;
                }
            } else {
                shopping.add(newItem);
            }
        }
        System.out.println(shopping);
    }

       /* while (moreItems) {
            System.out.println("Irj elemet: ");
            String newItem = scanner.nextLine();
            if (newItem.equals("x")) {
                moreItems = false;
            } else {
                if (!shoppingList.contains(newItem)) {
                    shoppingList.add(newItem);
                } else {
                    shoppingList.remove(newItem);
                    System.out.println("torolve");
                    if (shoppingList.isEmpty()) {
                        System.out.println("Minden megvan, indulhat a nyaralás!");
                        moreItems = false;
                    }
                }
            }

        } */
     /* a,   while (moreItems) {
            System.out.println("Irj elemet: ");
            String newItem = scanner.nextLine();
            if (newItem.equals("x")) {
                moreItems = false;
            } else {
                if (!shoppingList.contains(newItem)) {
                    shoppingList.add(newItem);
                } else {
                    System.out.println("ez mar letezik, adj hozza ujat!");
                }
            }

        } */
    // System.out.println(shoppingList);
}


