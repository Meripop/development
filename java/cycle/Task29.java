import java.util.Random;

public class Task29 {
    /*
     Írjunk programot, ami véletlenszerűen kiválaszt egy szülőt
     és a szülőkhöz tartozó előre definiált programokból egy lehetséges programot.
     Pl. Anyával: Sütés,Játszózás,
      Apával: Barkácsolás, Fűnyírás, lehetséges output: Anya - Sütés
     */
    public static void main(String[] args) {
        Random random = new Random();
        int randomParent = random.nextInt(2);
        int mother = 0;
        int father = 1;
        if (randomParent == mother) {
            System.out.print("With mom ");
            int randomActivity = random.nextInt(4);
            String activity = switch (randomActivity) {
                case 0 -> "eat icecream";
                case 1 -> "hiking";
                case 2 -> "go to disneylandbe";
                case 3 -> "play in park";
                default -> "nothing";
            };
            System.out.print(activity);
        } else if (randomParent == father) {
            System.out.print("With dad ");
            int randomActivity = random.nextInt(4);
            String activity = switch (randomActivity) {
                case 0 -> "handstanding";
                case 1 -> "swimming";
                case 2 -> "looking for dinosaurus";
                case 3 -> "brewing";
                default -> "nothing";
            };
            System.out.print(activity);

        } else {
            System.out.println("Just nothing");
        }
    }
}
