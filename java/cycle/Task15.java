import java.util.Random;
import java.util.Scanner;

/*
Írjunk programot, amely egy dobókocka szerencsejáték program. A játékot 2 játékos játsza, neveiket kérje be a program. A játékosok felváltva dobnak. A játék 3+1 fordulóból áll. A 4. Forduló dupla pontért meg. Az a játékos nyer, aki a legtöbb pontot összegyűjti. (Amennyit dob a játékos az egyes fordulókban, annyival több van neki)

 */
public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First gamer name: ");
        String lay1 = scanner.nextLine();
        System.out.println("Second gamer name: ");
        String lay2 = scanner.nextLine();

        int lay1Pont = 0;
        int lay2Pont = 0;
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int rand1 = random.nextInt(6) + 1;
            int rand2 = random.nextInt(6) + 1;
            lay1Pont += rand1;
            lay2Pont += rand2;

        }
        int rand1 = random.nextInt(6) + 1;
        int rand2 = random.nextInt(6) + 1;
        lay1Pont += (rand1 * 2);
        lay2Pont += (rand2 * 2);
        if (lay1Pont == lay2Pont) {
            System.out.println("Draw!");
        } else if (lay1Pont > lay2Pont) {
            System.out.println(lay1 + " win!");
        } else {
            System.out.println(lay2 + " win!");
        }


    }

}
