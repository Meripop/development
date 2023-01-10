import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Írjatok vendéglista programot, amit a felhasználó tud feltölteni.
 Házibulit szervezünk és tudjuk, hogy 11-en férnek el a lakásban.
 Azonban fontos, hogy egy vendéget csak egyszer adhasson hozzá a felhasználó.

 */
public class Task40 {
    public static void main(String[] args) {
        int maxInList = 0;
        List<String> guestList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        while (maxInList != 11) {

            System.out.println("Type a name, (so far):" + maxInList);
            String inputPeople = scanner.nextLine();
            if (guestList.contains(inputPeople)) {
                System.out.println("again");
            } else {
                guestList.add(inputPeople);
                maxInList++;
            }

        }
        System.out.println(guestList);
    }
}
