import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
 Készítsetek programot, amely más lottóknak megfelelő potenciális nyerőszámokat is
kiírja a képernyőre. Metodussal.
a) hatoslottónak és skandináv lottó
b) eurojackpot és luxor
 */
public class Task67 {
    static Random randomGenerator = new Random();

    private static Set<Integer> doRandom() {
        Set<Integer> rndomNumbs = new HashSet<>();

        int hatoslottoDb = 6;
        int hatoslottoTerjedelem = 50;

        int otoslottoDb = 6;
        int otoslottoTerjedelem = 50;
        while (rndomNumbs.size() != hatoslottoDb) {
            int number1 = randomGenerator.nextInt(hatoslottoTerjedelem) + 1;
            rndomNumbs.add(number1);
        }
        return rndomNumbs;
    }

    public static void main(String[] args) {
        System.out.println(doRandom());

    }

}
