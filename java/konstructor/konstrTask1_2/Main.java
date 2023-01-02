package konstruktor.Task1_2;

import konstruktor.Task1_2.Car;

/*
Készítsük el az előadásanyag Car osztályát és példányosítsunk 3 példányt belőle.
Készítsétek el az alábbi példánk POJO-ját és 3 példányát a képen látható
tulajdonságokkal és hozzájuk tartozó getter/setter metódusokkal. (a többi metódusra
most nincs szükségünk

 */
public class Main {

    public static void main(String[] args) {

        Car toyota = new Car("Toyota", "szurke", "Yaris", 2022, 5);
        Car alfaGT = new Car("Alfa Romeo", "fekete", "GT", 2006, 3);
        Car scania = new Car("Scania", "tuzpiros", "R500 super", 2021, 2);

        System.out.println(toyota);
        System.out.println(alfaGT);
        System.out.println(scania);

    }
}