import java.time.LocalDate;

public class Task97 {
    /*
    Szombaton focimeccs. Ebben a feladatban mi vagyunk a
    középiskolások focimeccseit összeállító vezető testület
     egyik tagja. Az a döntés született, hogy a bajnokság
     megnyitója 2023. január 11.-ére került(szombat), a bajnokság meccseire
     pedig ezt követően minden szombaton kerül sor az elkövetkezendő
      12 hétben. A feladat, hogy írjunk egy programot, amit
      meghatározza milyen dátumokra esnek ezek a szombati napok.
    A dátumokat írjuk ki a konzolra.
     */
    public static void main(String[] args) {
        int counter = 0;
        LocalDate firstSaturday = LocalDate.of(2023, 1, 11);
        System.out.println(firstSaturday.getDayOfWeek());
        for (int i = 0; i < 12; i++) {
            counter += 7;
            System.out.println(firstSaturday.plusDays(counter));
        }
    }
}
