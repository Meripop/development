import java.io.IOException;
import java.util.Scanner;

/*
Készítsünk egy metódust, amely eldönti a konzolról beolvas egy szöveget, majd a
szintén beolvasott keresendő szövegről eldönti, hogy szerepel-e a szövegben.
Amennyiben igen, térjen vissza true-val, egyébként false-al.

 */
public class Task77 {

    static Scanner scanner = new Scanner(System.in);

    private static boolean isExist() {
        System.out.println("Type a text:");
        String inputext1 = scanner.nextLine();
        System.out.println("Type the text waht you wanna search:");
        String inputext2 = scanner.nextLine();
        return inputext1.contains(inputext2);
    }

    public static void main(String[] args) throws IOException {
        System.out.println(isExist());

        /**
         * add back false or true if inpute 1 contains input2
         * conlsole log solution
         */
    }
}
