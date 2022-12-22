import java.util.Scanner;

/*
 Írjunk programot, amely előre meghatározott tojásárak között, kiszámolja mennyi a
tojás átlagos ára. Metodussal.
a) az árak egy eggPrices array-ben kerülnek előzetesen megadásra
b) az árak a felhasználótól a console-ról kerülnek beolvasásra (5db).
c) kérdezzük meg a felhasználótól hány árat szeretne rögzíteni, majd pontosan
annyi értéket kérjünk is el tőle és tároljuk le őket az eggPrices arraybe.

 */
public class Task68 {

    private static int eggCounter(int[] eggPrices) {
        Scanner scanner = new Scanner(System.in);
        int ossz = 0;
        for (int i = 0; i < eggPrices.length; i++) {
            System.out.println("ar:");
            eggPrices[i] = scanner.nextInt();
            ossz += eggPrices[i];
        }
        return ossz;

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hany ar?");
        int innputDb = scanner.nextInt();
        int[] eggPrices = new int[innputDb];

        int ossz = eggCounter(eggPrices);
        System.out.println("Atlag ar: " + ossz / eggPrices.length);

    }
}


