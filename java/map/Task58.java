import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 Készítsetek programot, ami összeszámolja a dolgozói szavazatokat amely a karácsonyi
party helyszínével kapcsolatos. Szerencsére egy gyakornok összegyűjtötte a
szavazatokat egy Listába, íme:
"Salt", "Platán", "42", "Essencia", "Babel", "Borkonyha", "Costes", "42", "Borkonyha", "Rumour",
"Platán", "Babel", "Stand", "Rumour", "Salt", "Platán", "42", "Rumour", "Rumour", "Borkonyha",
"Rumour", "Borkonyha", "Babel", "Essencia", "Salt", "Platán", "Borkonyha", "42", "Babel",
"Essencia", "42", "Stand", "Salt", "Costes", "42", "42", "Costes", "Stand", "Borkonyha", "Stand",
"Costes", "Babel", "Essencia", "Stand", "Salt", "Platán", "Costes", "Salt", "Platán", "Salt",
"Platán", "Essencia", "Rumour", "Salt", "Platán", "Rumour", "Stand", "Salt", "Essencia", "Babel",
"Babel", "Essencia", "Rumour", "Essencia", "Salt", "Platán", "Borkonyha", "Stand", "Essencia",
"Rumour", "Borkonyha", "Costes", "Babel", "Costes", "Salt", "Platán", "Essencia", "Stand",
"Costes", "Borkonyha", "Essencia", "42", "Essencia", "42", "Stand", "Rumour", "Salt", "Platán",
"Rumour", "Borkonyha", "Stand", "Babel", "Rumour", "Stand", "Salt", "Essencia", "Costes",
"Costes", "42", "42", "Salt", "Platán", "Essencia", "Babel", "Costes", "Rumour", "Costes",
"Stand", "Rumour", "Essencia", "Borkonyha", "Salt", "Platán", "Rumour", "Borkonyha", "42",
"Babel", "Stand", "42", "Costes", "42", "Salt", "42", "Salt", "Essencia", "Borkonyha", "Essencia",
"Borkonyha", "Rumour"
Array.asList(“Essencia”,... -ként nyugodtan állítsuk be a programunknak a List kezdeti
értékét és a feladat végeredményét mentsük egy Map-be.
a) Írjuk ki a képernyőre a szavazás eredményét az alábbi példának megfelelően:
“Borkonyha - 11 szavazat”
67
b) Hány Michelin csillagos étterem van? Hány szavazat érkezett?
c) Tételezzük fel, hogy az Essencia jelezte, hogy nem tudják fogadni a céget.
Távolítsuk el őket az eredmény Map-ből
d) Tételezzük fel, hogy a főnök kicsit megcinkeli a szavazást a Stand javára és
befolyásolja a szavazás végeredményét. Fiktív szavazatokat állít ki és utólag
könyvelik le őket. Adjunk hozzá a Stand szavazataihoz 11-et.
e) Extra (google-ből): Ki nyerte a szavazást?
 */
public class Task58 {

    public static void main(String[] args) {
        Map<String, Integer> voteMap = new HashMap<>();
        List<String> voteTitle = Arrays.asList("Salt", "Platán", "42", "Essencia", "Babel", "Borkonyha", "Costes", "42", "Borkonyha", "Rumour", "Platán", "Babel", "Stand", "Rumour", "Salt", "Platán", "42", "Rumour", "Rumour", "Borkonyha", "Rumour", "Borkonyha", "Babel", "Essencia", "Salt", "Platán", "Borkonyha", "42", "Babel", "Essencia", "42", "Stand", "Salt", "Costes", "42", "42", "Costes", "Stand", "Borkonyha", "Stand", "Costes", "Babel", "Essencia", "Stand", "Salt", "Platán", "Costes", "Salt", "Platán", "Salt", "Platán", "Essencia", "Rumour", "Salt", "Platán", "Rumour", "Stand", "Salt", "Essencia", "Babel", "Babel", "Essencia", "Rumour", "Essencia", "Salt", "Platán", "Borkonyha", "Stand", "Essencia", "Rumour", "Borkonyha", "Costes", "Babel", "Costes", "Salt", "Platán", "Essencia", "Stand", "Costes", "Borkonyha", "Essencia", "42", "Essencia", "42", "Stand", "Rumour", "Salt", "Platán", "Rumour", "Borkonyha", "Stand", "Babel", "Rumour", "Stand", "Salt", "Essencia", "Costes", "Costes", "42", "42", "Salt", "Platán", "Essencia", "Babel", "Costes", "Rumour", "Costes", "Stand", "Rumour", "Essencia", "Borkonyha", "Salt", "Platán", "Rumour", "Borkonyha", "42", "Babel", "Stand", "42", "Costes", "42", "Salt", "42", "Salt", "Essencia", "Borkonyha", "Essencia", "Borkonyha", "Rumour");

        for (String vote : voteTitle) {
            if (voteMap.containsKey(vote)) {
                voteMap.put(vote, voteMap.get(vote) + 1);
            } else {
                voteMap.put(vote, 1);
            }
        }

        System.out.println("a)");
        for (Map.Entry mapElement : voteMap.entrySet()) {
            System.out.println(mapElement.getKey() + " - " + mapElement.getValue() + " szavazat");
        }
        System.out.println("\nb)");
        System.out.println(voteMap.size() + " Michelin csillagos étterem van");

        voteMap.entrySet()
                .removeIf(entry -> entry.getKey().equals("Essencia"));

        // if (voteMap.containsKey("Stand"))
        voteMap.put("Stand", voteMap.get("Stand") + 11);

        System.out.println("\nb)");
        int sum = voteMap.values().stream().reduce(0, Integer::sum);
        System.out.println(sum + " szavazat van erkezett");

        Map.Entry<String, Integer> maxEntry = null;
        for (Map.Entry<String, Integer> entry : voteMap.entrySet()) {
            if (maxEntry == null || entry.getValue()
                    .compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }

        }

        System.out.println("\nc) d)");
        for (Map.Entry mapElement : voteMap.entrySet()) {
            System.out.println(mapElement.getKey() + " - " + mapElement.getValue() + " szavazat");
        }
        System.out.println("\ne)");
        System.out.println("nyertes: " + maxEntry.getValue() + "-al " + maxEntry.getKey() + "\n");

    }
}
