package abstractTask16;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Adott egy csv fájl, ami kutyákat tartalmaz, három fajtából, mint Bulldog, Yorkshire
Terrier, és Kaukázusi juhászkutya. A fájl első oszlopa, ahogy lentebb látható tartalmazza,
hogy milyen típusú kutyáról van szó, utána pedig a rá vonatkozó adatokat. A feladatunk,
hogy írjunk egy programot, ami képes a megadott fájl tartalmát egy List<AbstractDog>
listába felolvasni. A programban bizonyosodjunk meg róla, hogy a fájlokban szereplő
kutyák mind a fentebbi három kategória valamelyikébe tartoznak ellenkező esetben
dobjunk hibát.
Type, Name, Gender, BirthDay, Weight, Additional properties
Bulldog, Bruno, Male, 2017-11-10, 19.7, -
YorkshireTerrier, Henry, Male, 2016-10-06, 3.1, -
YorkshireTerrier, Cody, Male, 2012-03-02, 2.9, -
Bulldog, Jax, Male, 2011-09-27, 22, -
CaucasianShepherd, Eva, Female, 2012-05-22, 92.7, Bear, Wolf
Bulldog, Flora, Female, 2015-05-15, 21, -
c, Jasmine, Female, 2018-01-02, 65.1, Wolf
Bulldog, Leah, Female, 2012-12-21, 18.2, -
CaucasianShepherd, Ella, Female, 2009-04-06, 80.7, Wolf

 */
public class Main {

    private static void readFromFile(List<AbstractDog> listOfDogs) {

        try (Scanner scanner = new Scanner(new File("JavaCore/src/abstractTask16/resources/dogs.csv"), "Cp1250")) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String type = line.split(" ")[0].replace(",", "");
                String name = line.split(" ")[1].replace(",", "");
                String gender = line.split(" ")[2].replace(",", "");
                String birthDay = line.split(" ")[3].replace(",", "");
                Double weight = Double.valueOf(line.split(" ")[4].replace(",", ""));
                String additionalProperties = line.split(" ")[5].replace(",", "");
                Dog dog = new Dog(type, name, gender, birthDay, weight, additionalProperties);

                listOfDogs.add(dog);
            }

        } catch (IOException ex) {
            System.out.println("File doesn't exist");
        }
    }

    public static void main(String[] args) {

        List<AbstractDog> dogList = new ArrayList<>();
        readFromFile(dogList);
        for (AbstractDog dog : dogList) {
            if (!dog.type.equals("Bulldog") || !dog.type.equals("YorkshireTerrier") || !dog.type.equals("CaucasianShepherd")) {
                System.out.println("There is in a list what not equals the three basic type!");
                break;
            }
        }
        //System.out.println(dogList);
    }

}
