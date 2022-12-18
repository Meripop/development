import java.util.Random;

/*
Egy 21 fős csoportban ki kell választanunk két tanulót, aki felelni fog. Random generátorok segítségével válasszuk ki a két tanuló sorszámát a naplóban. (1-től indul a sorszámuk)
használjunk while ciklust az implementációhoz
használjunk do while ciklust az implementációhoz

 */
public class Task19 {
    public static void main(String[] args) {
        Random random = new Random();

        int student1;
        int student2;
        do {
            student1 = random.nextInt(21) + 1;
            student2 = random.nextInt(21) + 1;
        } while (student1 == student2);
        System.out.println("With do while " + student1 + " , " + student2);

        student1 = 0;
        student2 = 0;
        while (student1 == student2) {
            student1 = random.nextInt(21) + 1;
            student2 = random.nextInt(21) + 1;
        }
        System.out.println("With while " + student1 + " , " + student2);


    }
}
