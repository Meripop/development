import java.util.Scanner;
/*
Készítsetek szlogen automatát, amely a felhasználó által beolvasott márkára visszaadja a felhasználónak az adott márka szlogenjét.
switch-case adatszerkezettel oldjátok meg
induljon újra automatikusan a program mindaddig, amíg a márka helyett “exit”-et nem ír a felhasználó
a szlogen visszaadása után kérdezzük meg a felhasználót, hogy kíváncsi-e új szlogenre. Yes/No. Yes esetén mindig újraindul a program, No esetén szép napot kívánunk neki és kilépünk.

 */
public class Task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputSzlogen;
        boolean exit = true;
        String kiir;
        while (exit) {
            System.out.println("Type a slogen");
            inputSzlogen = scanner.nextLine();
            switch (inputSzlogen) {
                case "L'oreal":
                    kiir = "Mert megerdemlem.";
                    break;
                case "opel":
                    kiir = "Sosem kop el";
                    break;
                case "dreher":
                    kiir = "Annyi a vilag amennyit beletoltesz";
                    break;
                case "exit":
                    System.out.println("Pápá");
                    exit = false;
                default:
                    kiir = "Nincs ilyen";
            }

            System.out.println(kiir);
            System.out.println("új szlogen? Yes/No.");
            inputSzlogen = scanner.nextLine();
            if (inputSzlogen.equals("No")) {
                System.out.println("Pápá");
                exit = false;
            }
        }


    }
}
