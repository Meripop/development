import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
Írjatok családbarát metódust, amely egy, a metódusban előre létrehozott listában tárolt
szavakat megkeres egyesével a paraméterként kapott szövegben.
a) Amennyiben megtalálja, cserélje ezeket “*” karakterekre.
b) A csillagozott rész legyen pont annyi karakter, amennyi az eredeti szó volt
 */
public class Task82 {

    static Scanner scanner = new Scanner(System.in);

    private static String changeTxtinTxt() {
        List<String> words = Arrays.asList("bad", "dirty");
        System.out.println("Type a text where you wanna change bad words:");
        String inputBadText = scanner.nextLine();
        for (String word : words) {
            int starCount = word.length();
            String stars = "";
            for (int i = 0; i < starCount; i++) {
                stars += "*";
            }
            inputBadText = inputBadText.replaceAll(word, stars);
        }

        return inputBadText;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(changeTxtinTxt());


    }

}
