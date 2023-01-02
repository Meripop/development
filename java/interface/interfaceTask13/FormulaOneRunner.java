package interfaceTask13;

/*
 Készítsetek egy interfészt Car néven, melyben szerepel egy acceleration metódus, a
gyorsulás reprezentálására, mely vár egy double típusú értéket, hogy mennyi idő alatt tud
0-ról 100-ra felgyorsulni, valamint egy getCarManufacturer metódus a kocsi gyártójának
elkérésére. Készüljön el egy másik interfész is, Racer néven. Legyen neki egy
getRacerName és egy getNationality metódusa a neve és nemzetisége elkérésére.
42
a. Készítsetek egy osztályt MercedesPilotOne néven, amely implementálja
mindkét interfészt. Töltsétek meg tartalommal és hiányzó elemekkel az
osztályt és példányosítsátok azt a FormulaOneRunner osztályban.
b. Készítsetek egy osztályt FerrariPilotOne néven, amely implementálja mindkét
interfészt. Töltsétek meg tartalommal és hiányzó elemekkel az osztályt és
példányosítsátok azt a FormulaOneRunner osztályban.
 */
public class FormulaOneRunner {
    public static void main(String[] args) {
        MercedesPilotOne hamilton = new MercedesPilotOne("eb", "germany", "merecedes");
        hamilton.acceleration(3.1);
        System.out.println(hamilton.toString());
    }
}
