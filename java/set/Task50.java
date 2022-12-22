import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
Irjatok vendéglista programot, amit a felhasználó tud feltölteni. Házibulit szervezünk és
tudjuk, hogy 11-en férnek el a lakásban. Tároljuk a vendégeket Set-ben, hogy ne kelljen
arra figyelni, hogy valaki benne van-e a listában már vagy sem.
a) Viszont oldjuk meg, hogy addig kérje inputként a program a vendégeket, amíg fel
nem töltjük a 11 helyet
b) A felhasználó a program indításakor dönthesse el, hány vendéget szeretne
meghívni
 */
public class Task50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> guests = new HashSet<>();

        /*
        while (guests.size()!=10){
            String name=scanner.nextLine();
            if(guests.contains(name)){
                System.out.println("again");
            }
            guests.add(name);
        }
        System.out.println(guests);
    */

        System.out.println("Number of guests: ");
        int numb = Integer.parseInt(scanner.nextLine());
        while (guests.size() != numb) {
            System.out.println("Name: ");
            String name = scanner.nextLine();
            if (guests.contains(name)) {
                System.out.println("Again");
            }
            guests.add(name);
        }
        System.out.println(guests);
    }
}

