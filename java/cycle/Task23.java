import java.util.Random;


public class Task23 {
    public static void main(String[] args) {
        System.out.println("Hello");
        Random random = new Random();
        int rand = random.nextInt(7);
        String eredmeny = switch (rand) {
            case 0 -> "Senki sem szabad, ha valaminek a része.";
            case 1 -> "A szabad ember legfőbb ellensége az állam mindenre rátelepedő hatalma.";
            case 2 ->
                    "A kíváncsiság és a tekintélyelv elutasítása kéz a kézben járnak. A tekintélytisztelet kizárja a kíváncsiságot";
            case 3 -> "A tudás már félig győzelem.";
            case 4 -> "Az ellentmondani nem tudás valamire való képtelenséget bizonyít, nem pedig 'igazságot'.";
            case 5 ->
                    "A hitélmény az, amely hosszabb távon jobban megmarad. Intellektuális jellegű kérdéseink elavulnak, mihelyt tudjuk rájuk a választ";
            default -> "Ami nem tapad meg az agyban, az nincs.";
        };
        System.out.println(eredmeny);


    }
}