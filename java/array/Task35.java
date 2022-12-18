/*
Készítsetek egy ageInput nevű arrayst, amiben a következő számok találhatóak: 5, -3, 0, 21, 55, 18, 32, 255, 42. Írjatok egy for ciklust, amely bejárja ezt a tömböt és valid age esetén kiírja azt a képernyőre, de csak az életszerű, valós age-eket
 */
public class Task35 {
    public static void main(String[] args) {
        int[] ageInput = {5, -3, 0, 21, 55, 18, 32, 255, 42};
        for (int s : ageInput) {
            if (s > 0 && s < 150) {
                System.out.print(s + " ");
            }
        }
    }
}
