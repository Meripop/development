import java.util.HashMap;
import java.util.Map;
/*
Készítsünk egy Map-et kedvenc gyümölcsökkel. Adjunk hozzá a listához
legalább 7 gyümölcsöt és egy értéket, hogy mennyire szeretjük. Ez az érték 1-3
között lehet, mely esetén a 3 amit jobban szeretünk. Foreach ciklus segítségével írassuk
ki az elemeit a képernyőre egymás alá.

 */

public class Task53 {
    public static void main(String[] args) {
        Map<String, Integer> fruitMaps = new HashMap<>();
        fruitMaps.put("alma", 2);
        fruitMaps.put("banan", 2);
        fruitMaps.put("mango", 3);
        fruitMaps.put("dinnye", 3);
        fruitMaps.put("barack", 3);
        fruitMaps.put("citrom", 3);
        fruitMaps.put("korte", 3);


        for (String i : fruitMaps.keySet()) {
            System.out.println(i + " " + fruitMaps.get(i));
        }
        //Vagy
        for (Map.Entry mapElement : fruitMaps.entrySet()) {
            System.out.println(mapElement.getKey() + " " + mapElement.getValue());
        }
    }

}

