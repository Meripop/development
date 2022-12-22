import java.io.IOException;
import java.util.Scanner;

/*
Irjatok egy metódust, amely képes megkeresni a paraméterként kapott szöveg
elejéről, a szintén paraméterként kapott darabszámig kivágni a karaktereket. Az
eredményStringet adja vissza a metódus. Parancssori argumentumként feldolgozott
értékekkel, futassátok meg a metódust a main-ből.

 */
public class Task80 {
    static Scanner scanner = new Scanner(System.in);

    private static String cutInputText(String[] inputFromArg) {
        String inputFromConsole = inputFromArg[0];
        int cutNumb = Integer.parseInt(inputFromArg[1]);
        String cuttedText = inputFromConsole.substring(cutNumb - 1);

        return cuttedText;
    }

    public static void main(String[] args) throws IOException {

        System.out.println(cutInputText(args));
    }
}
