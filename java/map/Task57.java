import java.util.*;

/*
 Írjunk könyv nyilvántartás programot. A feladat, hogy meg kell számolni pontosan
hány különböző könyv van (cím szerint) és hogy hány példány van belőle a
65
könyvesboltban. Szerencsére a kutató és adminisztrációs munka nagyját
megcsinálták a diákmunkások, így egy ömlesztett lista a könyvekről már
rendelkezésünkre áll:
"Son", "Harry Potter VI.", "Down and Out in Paris and London", "All about Sam", "1984", "Keep
the Aspidistra Flying", "The Fellowship of the Ring", "Keep the Aspidistra Flying", "A
Summer to Die", "Harry Potter V", "The Return of the King", "Harry Potter VI.", "The Return of
the King", "Down and Out in Paris and London", "Harry Potter V", "A Summer to Die", "Harry
Potter I.", "Harry Potter III.", "All about Sam", "Animal Farm", "Gathering Blue", "Homage to
Catalonia", "Son", "The Two Towers", "Harry Potter III.", "Messenger", "The Return of the
King", "Homage to Catalonia", "Harry Potter III.", "Harry Potter I.", "The Two Towers",
"Gathering Blue", "Messenger", "The Fellowship of the Ring", "1984", "Harry Potter VI.",
"Keep the Aspidistra Flying", "Gathering Blue", "Harry Potter V", "Harry Potter II.", "Homage
to Catalonia", "Harry Potter V", "Animal Farm", "All about Sam", "Son"
Array.asList(“Son”,... -ként nyugodtan állítsuk be a programunknak a List kezdeti értékét
és a feladat végeredményét mentsük egy Map-be.
a) Írjuk ki a map tartalmát a képernyőre úgy, hogy az alábbi példának megfeleljen:
“The Fellowship of the Ring - 4 darab”
b) Hány darab könyv van összesen és hány különböző könyv van?
c) Tételezzük fel, hogy azokat a könyveket amikből egy darab van, azokat kivesszük
ideiglenesen a nyilvántartásból, mert a cégvezető értékesnek találja és meg
szeretné tartani őket. Keressük meg ezeket a könyveket és töröljük a
nyilvántartásból
 */
public class Task57 {
    public static void main(String[] args) {
        Map<String, Integer> booksMap = new HashMap<>();
        List<String> booksTitle = Arrays.asList("Son", "Harry Potter VI.", "Down and Out in Paris and London", "All about Sam", "1984", "Keep the Aspidistra Flying", "The Fellowship of the Ring", "Keep the Aspidistra Flying", "A Summer to Die", "Harry Potter V", "The Return of the King", "Harry Potter VI.", "The Return of the King", "Down and Out in Paris and London", "Harry Potter V", "A Summer to Die", "Harry Potter I.", "Harry Potter III.", "All about Sam", "Animal Farm", "Gathering Blue", "Homage to Catalonia", "Son", "The Two Towers", "Harry Potter III.", "Messenger", "The Return of the King", "Homage to Catalonia", "Harry Potter III.", "Harry Potter I.", "The Two Towers", "Gathering Blue", "Messenger", "The Fellowship of the Ring", "1984", "Harry Potter VI.", "Keep the Aspidistra Flying", "Gathering Blue", "Harry Potter V", "Harry Potter II.", "Homage to Catalonia", "Harry Potter V", "Animal Farm", "All about Sam", "Son");

        for (String book : booksTitle) {
            //int numbersOfBook=1;
            if (booksMap.containsKey(book)) {
                booksMap.put(book, booksMap.get(book) + 1);
            } else {
                booksMap.put(book, 1);
            }
        }
        System.out.println("a)");
        for (Map.Entry mapElement : booksMap.entrySet()) {
            System.out.println(mapElement.getKey() + " - " + mapElement.getValue() + " darab");
        }
        System.out.println("b)");
        System.out.println("\n" + booksMap.size() + " fele konyv van\n");
        int sum = booksMap.values().stream().reduce(0, Integer::sum);
        System.out.println(sum + " db konyv van osszesen\n");


        booksMap.entrySet()
                .removeIf(entry -> entry.getValue() == 1);

        List<String> books4 = new ArrayList<>();
        for (Map.Entry mapElement : booksMap.entrySet()) {
            if (booksMap.containsValue(4)) {
                booksMap.put(mapElement.getKey().toString(), 3);
                // mapElement.getKey().toString(),3
            }
            // System.out.println(mapElement.getKey()+" - "+mapElement.getValue()+" darab");
        }

        System.out.println("c) d)");
        for (Map.Entry mapElement : booksMap.entrySet()) {
            System.out.println(mapElement.getKey() + " - " + mapElement.getValue() + " darab");
        }
    }
}
