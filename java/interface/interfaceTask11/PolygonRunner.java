package interfaceTask11;

/*
Készíts egy interfészt, PolygonInterface néven. Tartalmazzon egy metódust getArea
néven, melynek a visszatérési értéke int, illetve van két int típusú paramétere, amely a
sokszög két oldala.
a. Implementáld az interfészt egy téglalap osztály, Rectangle segítségével. Készíts
el minden segéd változót, kontruktort, getter settert, toString-et ami esetleg
szükséges. Készíts egy PolygonRunner osztályt, ahonnan ki tudod próbálni a
téglalap osztály példányosítását és terület számítását.
b. Készítsd el a téglalap osztályhoz hasonlóan a négyzet osztályt, Square néven és
próbáld ki azt is a PolygonRunner-ből.

 */
public class PolygonRunner {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        System.out.println(rectangle.getArea(3, 5));
        Rectangle squer = new Rectangle();
        System.out.println("Square 1: " + squer.getArea(6, 6));
        Square square = new Square();
        System.out.println("Square 2: " + square.getArea(2, 0));

    }
}
