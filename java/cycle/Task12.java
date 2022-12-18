import java.util.Scanner;

/*
 Írjunk egy sörösüvegek visszaváltó programot. A zöld üvegeket 10 forintért, a feketéket pedig 30-ért. A program minden üvegnél kérdezze meg, hogy milyen színű, illetve jegyezze meg, hogy mennyivel nőtt a beváltott üvegek értékének összege. Ha a felhasználó az X karaktert adja meg, úgy a program írja ki, hogy mennyi pénzt ad a beváltott üvegekért.

 */
public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        int result;
        int zolduveg = 0;
        int feketeuveg = 0;

        while (!input.equals("X")) {
            System.out.println("Green or Black bottle: ");
            input = scanner.nextLine();
            if (input.equals("Green")) {
                zolduveg += 10;
                System.out.println(zolduveg);
            } else if (input.equals("Black")) {
                feketeuveg += 30;
                System.out.println(feketeuveg);
            } else
                System.out.println(" ");
        }
        result = zolduveg + feketeuveg;
        System.out.println("You have " + result + " ft");
    }
}