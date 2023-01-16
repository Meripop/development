package Task5;

import java.util.Scanner;

/*
Regisztrációs lap. Egy közösségi oldal regisztrációs űrlapját kell elkészíteni.
Készíts egy POJO-t amely magába foglalja a következő információkat a felhasználóról:
● email
● név
● születési idő
● telefonszám
● munkahely
A sikeres regisztrációhoz kötelező megadni az email címet, nevet, illetve a születési
dátumot. A többi adatot opcionálisan adhatja meg a felhasználó.
Készíts olyan osztályt, amely rendelkezik a megfelelő konstruktorokkal, illetve getter és
setter metódusokkal. Ha egy felhasználó nem rendelkezik a megfelelő adatokkal, a
program írjon ki hibaüzentet. Abban az esetben, ha a felhasználó kitöltötte a kötelező
mezőket, a program írja ki az összes megadott adatot
 */
public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter your e-mail address:");
        String email = scanner.nextLine();
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("Please enter your birth date:");
        String birthdate = scanner.nextLine();
        System.out.println("Please enter your workplace:");
        String workplace = scanner.nextLine();
        System.out.println("Please enter your phone number:");
        String phone = scanner.nextLine();

        Form user = new Form(email, name, birthdate);
        if (email.isEmpty() || name.isEmpty() || birthdate.isEmpty()) {
            System.out.println("The email, name, and birth date must not be empty!");
            return; //vagy: System.exit(0);
        }
        if (!workplace.isEmpty()) {
            user.setWorkPlace(workplace);
        }
        try {
            user.setPhoneNumber(Integer.parseInt(phone));
        } catch (NumberFormatException ex) {
            System.out.println("Please type a phone number");
            user.setPhoneNumber(0);
        }


        System.out.println(user);
    }
}