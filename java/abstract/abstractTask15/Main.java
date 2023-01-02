package abstractTask15;

/*
Készítsetek egy Salary absztrakt osztályt, melyben van egy absztrakt metódus
salaryCalculation néven. Az első két darab integert vár paraméterként dailySalary és
43
workedDay néven. Készüljön egy olyan metódus is el ebben az osztályban, amely
kiírja a képernyőre, hogy “Thanks for using me and let me assist in your calculation”,
writeThanksNote néven.
a. Készíts egy HungarianSalary osztályt, mely leszármazik a Salary osztályból és
képes rá, hogy kiszámolja a havi nettó bérét a salaryCalulation segítségével. Az
osztálynak legyen egy saját tulajdonsága hungarianTaxes néven, ami egy int
típusú attribútum az adók beállításának amely példányosításkor kaphat értéket.
b. Készíts egy USSalary és egy NorwaySalary osztályt, melyek a fenti
HungarianSalary-hoz hasonlóan működnek.
 */
public class Main {
    public static void main(String[] args) {
        HungarianSalary ann = new HungarianSalary(23000, 20, 20);
        System.out.println(ann);
        NorwaySalary bia = new NorwaySalary(30000, 6, 23);
        bia.salaryCalculation(30000, 6);
        System.out.println(bia);
    }
}
