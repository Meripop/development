import java.io.IOException;
import java.util.Scanner;

/*
Írjunk programot, amely a beolvasott szövegben lecseréli a “legrosszabb” szót, a
“legjobb”-ra.

 */
public class Task81 {
    static Scanner scanner = new Scanner(System.in);

    private static void changeTxtinTxt() {
        System.out.println("Type a text where you wanna change something: ");
        String inputInWhatChange = scanner.nextLine();
        System.out.println("What do you want to change: ");
        String inputWhatChange = scanner.nextLine();
        System.out.println("What for do you want change it: ");
        String inputWhatForChange = scanner.nextLine();


        System.out.println(inputInWhatChange.replaceAll(inputWhatChange, inputWhatForChange));
    }

    public static void main(String[] args) throws IOException {
        changeTxtinTxt();


    }
}
