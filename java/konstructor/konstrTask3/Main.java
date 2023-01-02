package konstruktor.Task3;

/*
Készítsétek el az alábbi példánk POJO-ját és 3 példányát a képen látható
tulajdonságokkal és hozzájuk tartozó getter/setter metódusokkal. (a többi metódusra
most nincs szükségünk
 */
public class Main {
    public static void main(String[] args) {
        Doughnut classicDoughnut = new Doughnut("kerek", "csokis", "liszt", 10, "porcukor");
        Doughnut csoroge = new Doughnut("hosszukas", "natur", "liszt", 10, "porcukor");
        Doughnut kocka = new Doughnut("kocka", "lekvaros", "liszt", 15, "porcukor");

        System.out.println(classicDoughnut);
        System.out.println(csoroge);
        System.out.println(kocka);
    }
}