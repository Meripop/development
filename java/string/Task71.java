import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Készítsetek egy alkalmazást ami mindaddig beolvas egy szöveget a konzolról, amíg x-et
nem kap. Minden értéket amit beolvasott mentsünk egy egy List-be, de már csak a bevitt
szöveg kisbetűs változatát!
 */
public class Task71 {
    static Scanner scanner = new Scanner(System.in);

    public static List<String> setToLowerCase() {
        String inputext = "";
        List<String> inputArrayList = new ArrayList<>();
        while (!inputext.equals("x")) {
            System.out.println("Ird be a szoveget: ");
            inputext = scanner.nextLine();
            inputArrayList.add(inputext.toLowerCase());
            inputArrayList.remove("x");
        }
        return inputArrayList;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(setToLowerCase());

    }


}

