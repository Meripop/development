
/*
Készítsetek egy programot, amelyben egy tömbnek már a létrehozásakor definiáljuk az értékeket. A String típusú array neve legyen carsArray és állítsunk be neki legalább 7db autómárkát. Hozzunk létre egy myFavoriteCar nevű String változót és állítsuk be az egyik, tömbhöz is hozzáadott autómárkát, mint kezdőérték. Egy ciklussal menjünk végig az elemeken, azaz járjuk be a tömböt. Ha az adott indexű tömb elem megegyezik a myFavoriteCar változó értékével akkor írjuk ki annak értékét a konzolra és fűzzük hozzá, hogy “ a kedvenc autómárkám.”

 */

public class Task66 {
    private static String fromUser() {
        String myFavoriteCar = "renault";
        return myFavoriteCar;
    }

    private static boolean searchForItem(String[] carsArray, String fromUser) {
        boolean isInArrayk = false;
        for (int i = 0; i < carsArray.length; i++) {
            if (carsArray[i].equals(fromUser)) {
                System.out.println(carsArray[i] + " is my favorite car type, " + "\t" + i + " is the index.");
                isInArrayk = true;
            }
        }
        return isInArrayk;
    }

    public static void main(String[] args) {
        String[] carsArray = {"opel", "renault", "merci", "peugeot", "tesla", "mitsubisi", "toyota"};
        if (searchForItem(carsArray, fromUser())) {
            System.out.println("Success");
        }
    }
}
