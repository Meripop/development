import java.io.IOException;
import java.util.*;

/*
 Készítsetek egy alkalmazást, amely egy bevásárló lista. Az elemeket be tudja olvasni az
alábbi formában: tétel-db vagyis, kenyér-2 vagy sör-6. Az így beolvasott elemeket
feldarabolja a - jel mentén és elmenti egy shoppingList nevű Map-be. Az első fele, a
kötőjel előtti rész legyen a kulcs, a második rész pedig a darabszám.
System.out.println()-el írjátok ki a képernyőre a map tartalmát.

 */
public class Task73 {

    private static Map<String, Integer> setMapOfProducts() {
        Scanner scanner = new Scanner(System.in);

        String inputext = "";
        Map<String, Integer> shoppingList = new HashMap<>();
        while (!inputext.equals("x")) {
            System.out.println("Type what you wanna buy, name-piece: ");
            inputext = scanner.nextLine();
            if (inputext.equalsIgnoreCase("x"))
                break;
            String[] splittedInput = inputext.split("-");
            shoppingList.put(splittedInput[0], Integer.parseInt(splittedInput[1]));

        }
        return shoppingList;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(setMapOfProducts());

    }
}
