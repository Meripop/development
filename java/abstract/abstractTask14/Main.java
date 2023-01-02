package abstractTask14;

/*
Készítsünk egy absztrakt osztályt, amely munkavállaló, Employee néven fut.
Legyen benne egy absztrakt metódus, amely kiszámolja a fizetését comutePay néven,
egy metódus a neve és pozíciója elkérésére getName és getPosition néven.
Konstruktorában kapja meg és csak létrehozáskor lehessen beállítani a szükséges
attribútumait.
a. Készítsünk egy Main osztályt, ahol megpróbáljuk példányosítani az Employee
osztályt. Nézzük meg milyen hibaüzenetet ír ki a program.
b. Készítsünk egy SoftwareTester osztály, melyben származtassunk le az Employee
osztályból. Az absztrakt osztályban kötelező tulajdonságok mellett a kontruktor
kapja meg azt a darabszámot, amely megmondja hány bugot talált az aktuális
évben, bugCount néven. Példányosítsuk a Main osztályunkból.
c. Készítsünk egy HrAssistant melyben származtassunk le az Employee osztályból.
Az absztrakt osztályban kötelező tulajdonságok mellett a kontruktor kapja meg
azt a logikai változót, amely azt jelzi hogy van még türelme az emberekhez,
noMorePeople néven.Példányosítsuk a Main osztályunkból.
 */
public class Main {
    public static void main(String[] args) {

        SoftwareTester jon = new SoftwareTester("jon", "Junior tester", 34);
        jon.comutePay();
        System.out.println(jon.toString());
        System.out.println(jon.getPosition());

        HrAssistant eva = new HrAssistant("eva", "medior hr", false);
        eva.comutePay();
        System.out.println(eva);
    }

}
