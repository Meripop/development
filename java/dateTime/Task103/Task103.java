package Task103;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
Készítsetek programot, mely képes arra, hogy a console-ról Stringként
beolvassa az adataitokat és letárolja egy Person nevű DOJO osztályban
 azokat. Minimum keresztnév, vezetéknév, születési hely, (String-ként)
  és születési idő (LocalDate-ként), valamint kedvenc filmek listája
  (List<String>-ként), boldog-e (boolean), testmagasság (int-ként)
  kerüljön letárolásra private osztályváltozók segítségével. Ezen,
   példányosításkor kötelezően megadandó attribútumok
   pedig konstruktor segítségével kapjanak értéket. E
mellett adjatok hozzá legalább 2 tetszőleges opcionális attribútumot
az osztályhoz, melyet példányosítást követően a setter metódusokkal
(ha akarunk), be lehet állítani. Készítsetek egy toString metódust is,
 mely visszaadja az összes beállított tulajdonságot, és írassátok ki
  vele a konzolra a lementett adatokat.
Készüljön el a fenti követelmény.
Refactoráljátok úgy a kódot, hogy az adatok beolvasása egy metódusban
 történik, mely a String-ként beolvasott elemeket egy List-be pakolja
 és a metódus ezzel a listával tér vissza. A példányosításkor pedig
 a konstruktor ezen lista elemeit kapja meg és kerüljön neki átadásra.
  Pl.: getUserInputList()
Refaktoráljátok úgy a kódot, hogy a példányosítás is külön metódusban
 történik, amely medódus megkapja paraméterként a beolvasott értékeket
  tartalmazó listát, elvégzi a példányosítást és visszatérési értéke
  ez a létrehozott Person típusú példány. Pl.: getPerson() A main
  metódusban így a két metódushívás szükségeltetik, illetve egy
  utasítás, mely kiírja ezt a létrehozott példányt a konzolra.

 */
public class Task103 {
    static Scanner scanner = new Scanner(System.in);

    private static List<String> getUserInputList() {
        List<String> list = new ArrayList<>();
        System.out.println("Type your first name: ");
        list.add(scanner.nextLine());

        System.out.println("Last name: ");
        list.add(scanner.nextLine());

        System.out.println("Place of birthday: ");
        list.add(scanner.nextLine());

        System.out.println("Date of birthday(YYYY-MM-DD: ");
        list.add(scanner.nextLine());

        System.out.println("Favourite moovie(separeted by ',' : ");
        list.add(scanner.nextLine());

        System.out.println("Is happy Y/N: ");
        list.add(scanner.nextLine());

        System.out.println("Height: ");
        String height;
        try {
            height = scanner.nextLine();
        } catch (NumberFormatException ex) {
            height = "0";
        }
        System.out.println("Favourite Snail Type: ");
        String getFavouriteSnailType;
        try {
            getFavouriteSnailType = scanner.nextLine();
        } catch (NumberFormatException ex) {
            getFavouriteSnailType = "nincs";
        }
        System.out.println("Number Of Yearly Black Out: ");
        String getNumberOfYearlyBlackOut = scanner.nextLine();

        list.add(height);
        list.add(getFavouriteSnailType);
        list.add(getNumberOfYearlyBlackOut);
        return list;
    }

    public static Person toDojo(List<String> list) {
       /* for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/
        String firstName = list.get(0);
        String lastName = list.get(1);
        String placeOfBirthday = list.get(2);
        LocalDate timeOfBirthdayParse;
        try {
            timeOfBirthdayParse = LocalDate.parse(list.get(3));
        } catch (DateTimeParseException ex) {
            timeOfBirthdayParse = LocalDate.parse("1111-11-11");
        }


        List<String> listOfFavouriteMoovies = Arrays.asList(list.get(4).split(","));
        boolean happy;
        if (list.get(5).equalsIgnoreCase("y")) {
            happy = true;
        } else
            happy = false;
        int height = 0;
        try {
            height = Integer.parseInt(list.get(6));
        } catch (NumberFormatException ex) {
            height = 0;
        }
        String getFavouriteSnailType = list.get(7);
        int getNumberOfYearlyBlackOut;
        try {
            getNumberOfYearlyBlackOut = Integer.parseInt(list.get(8));
        } catch (NumberFormatException ex) {
            getNumberOfYearlyBlackOut = 0;
        }
        Person p = new Person(firstName, lastName, placeOfBirthday, timeOfBirthdayParse, listOfFavouriteMoovies, happy, height);
        p.setFavouriteSnailType(getFavouriteSnailType);
        p.setNumberOfYearlyBlackOut(getNumberOfYearlyBlackOut);
        return p;
    }

    public static void main(String[] args) {

        List<String> listToDojo = getUserInputList();
        System.out.println(toDojo(listToDojo));

    }
}
