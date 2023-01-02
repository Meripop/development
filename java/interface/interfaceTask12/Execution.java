package interfaceTask12;

/*
Készítsünk egy Sports interfészt, melyben két metódus van, amely beállítja a hazai
és vendégcsapat neveit, setHomeTeam és setAwayTeam. Mindkettő megkapja a csapat
nevét paraméterként. Ezen felül egy paraméter nélküli getter metódus, amely meg tudja
mondani a sportágat, getSportType néven. Ezt követően készítsünk egy Event interfészt,
mely tartalmaz egy metódust az esemény nevének beállítására, valamint az esemény
helyszínének elkérésére, setEventName és getLocation. Egyiknek sincs
paramétere.getLocation-nek String visszatérési értéke van.
a. Készítsünk egy SemiFinal osztályt, amely implementálja a fenti két interfészt
egyszerre és készítsük el a szükséges metódusokat
b. Egy Execution osztályban példányosítsuk a SemiFinal osztály és oldjuk meg,
hogy a Franciaország-Marokkó világbajnoki elődöntőt létre tudjuk hozni.
 */
public class Execution {
    public static void main(String[] args) {
        SemiFinal semiFinal = new SemiFinal("Babilon", "lovacskazas");
        System.out.println(semiFinal.getLocation());
        semiFinal.setEventName();
        semiFinal.setAwayTeam("Franciaorszag");
        semiFinal.setHomeTeam("Marokko");
        System.out.println(semiFinal);
    }
}
