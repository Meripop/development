import java.io.IOException;
import java.util.Scanner;

/*
Irjatok egy metódust a paraméterként kapott szövegről, illetve a másik paraméterként
kapott kifejezésről eldönti, hogy azzal a kifejezéssel kezdődik-e az adott szöveg vagy
sem. Amennyiben igen, térjen vissza true-val, egyébként false-al.
a) hogy ki tudjuk próbálni a metódust, konzolról olvassunk be két értéket a main
metódusban és hívjuk meg a készített metódust velük.
b) parancssori argumentumként olvassunk be két értéket a main metódusban és
hívjuk meg a készített metódust velük.
c) a metódus távolítsa el a felesleges szóközöket a String-ek elejéről és végéről
d) amennyiben van a program indításakor parancssori argumentum beállítva akkor
használja azokat. Ha viszont nincs, akkor olvassa be az adatokat a konzolról.

 */
public class Task78 {
    static Scanner scanner = new Scanner(System.in);

    private static String readFromConsle() {
        System.out.println("Type the text: ");
        return scanner.nextLine();
    }

    private static boolean isExist(String inputext1, String inputext2) {


        inputext1 = inputext1.trim();
        inputext2 = inputext2.replaceAll(" ", "");

        return inputext1.startsWith(inputext2);
    }

    public static void main(String[] args) throws IOException {

        String inputext1;
        String inputext2;
        if (args.length != 0) {
            inputext1 = args[0];
            inputext2 = args[1];
        } else {
            inputext1 = readFromConsle();
            inputext2 = readFromConsle();
        }
        System.out.println(isExist(inputext1, inputext2));

        /**
         * add back false or true if input1 start with input2
         * console log inputs without start and end spaces
         * conlsole log solution
         */
    }
}
