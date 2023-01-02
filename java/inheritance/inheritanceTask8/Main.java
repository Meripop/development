package inheritance.inheritanceTask8;

/*
Készítsétek el az alábbi, együtt elkészített diagramon láthatszó osztályhierarchiát. A
metódusokat is tartalmazzák az osztályok, de elég akár egy System.out.println()
utasítást megvalósítaniuk, amely kiírja a konzolra hogy éppen mi az adott tevékenység.
Pl.: ízélmény() metódus kiírja, hogy “Ez a klasszikus fánk nagyon finom.”
 */
public class Main {
    public static void main(String[] args) {
        CocoaDoughtnut cocoa = new CocoaDoughtnut("kerek", "csokis", "liszt", 10, "porcukor", 10);
        JamDoughnut jam = new JamDoughnut("kerek", "lekvar", "liszt", 10, "porcukor", 45);
        JamDoughnut jam2 = new JamDoughnut(65);

        System.out.println(jam2.getFruitPercent());
        cocoa.cocoaFillingMaing();
        System.out.println(cocoa);
        System.out.println(jam2.toString());
        System.out.println(jam);
        System.out.println(jam.getFruitPercent());
        jam.rise();
    }
}