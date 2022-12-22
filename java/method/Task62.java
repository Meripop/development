import java.util.Scanner;

/*
 Készítsetek egy getValidAgeFromConsole() metódust, amelyet a main metódusban meg
tudunk hívni és visszaad egy helyes age-et integer-t amit a felhasználó a console-be írt.
Akkor helyes egy age ha 0 és 140 között van (0 lehet, 140 nem). A metódus visszatérési
értékét mentsük le egy age nevű változóba, majd írassuk ki a képernyőre annak
tartalmát.
 */
public class Task62 {
    static Scanner scanner = new Scanner(System.in);

    public static int getValidAgeFromConsole() {
        int age = scanner.nextInt();
        if (age >= 0 && age < 140) {
            return age;
        } else {
            System.out.println("Age is not between 0 and 140");
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Your age: ");
        int age = getValidAgeFromConsole();
        System.out.println("Age: " + age);


    }

}
