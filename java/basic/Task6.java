import java.util.Random;
/*
Készítsetek szerencsesüti programot, amely minden futtatása során kiír egy kis bölcs üzenetet. A program véletlenszerűen írjon ki üzeneteket, amit előre felvettünk benne. Mindig csak egyet.
 */

public class Task6 {
    public static void main(String[] args) {
        System.out.println("hello");
        Random random = new Random();
        int rand = random.nextInt(7);
        System.out.println("elso "+rand);
        String eredmeny;
        if (rand == 0) {
            eredmeny = "Senki sem szabad, ha valaminek a része.";
        } else if (rand==1) {
            eredmeny = "A szabad ember legfőbb ellensége az állam mindenre rátelepedő hatalma.";

        } else if (rand==2) {
            eredmeny="A kíváncsiság és a tekintélyelv elutasítása kéz a kézben járnak. A tekintélytisztelet kizárja a kíváncsiságot";
        } else if (rand==3) {
            eredmeny="A tudás már félig győzelem.";
        } else if (rand==4) {
            eredmeny="Az ellentmondani nem tudás valamire való képtelenséget bizonyít, nem pedig 'igazságot'.";
        } else if (rand==5) {
            eredmeny="A hitélmény az, amely hosszabb távon jobban megmarad. Intellektuális jellegű kérdéseink elavulnak, mihelyt tudjuk rájuk a választ";
        } else {
            eredmeny="Ami nem tapad meg az agyban, az nincs.";
        }
        System.out.println(rand);
        System.out.println(eredmeny);


    }
}
