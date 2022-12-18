
/*
Készítsetek egy programot, amelyben egy tömbnek már a létrehozásakor definiáljuk az értékeket. A String típusú array neve legyen carsArray és állítsunk be neki legalább 7db autómárkát. Hozzunk létre egy myFavoriteCar nevű String változót és állítsuk be az egyik, tömbhöz is hozzáadott autómárkát, mint kezdőérték. Egy ciklussal menjünk végig az elemeken, azaz járjuk be a tömböt. Ha az adott indexű tömb elem megegyezik a myFavoriteCar változó értékével akkor írjuk ki annak értékét a konzolra és fűzzük hozzá, hogy “ a kedvenc autómárkám.”

 */
public class Task33 {
    public static void main(String[] args) {

        String myFavoriteCar = "tesla";
        String[] carsArray = {"opel", "renault", "merci", "peugeot", "tesla", "mitsubisi", "toyota"};
        for (String s : carsArray) {
            if (s.equals(myFavoriteCar)) {
                System.out.println(s + " a kedvenc autómárkám.");
            }
        }
    }
}
