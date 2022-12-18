
import java.util.Scanner;
/*
Készítsetek programot, amely a felhasználótól vár 3 számot, amely számokról el tudja dönteni, hogy lehet-e egy háromszög 3 oldala, vagyis szerkeszthető-e a háromszög.
Ha lehet, akkor írja ki: “You are a lucky person.” (Pl.: 2,3,4-re)
Egyébként, írja ki: “Please, try again.” (Pl.: 1,2,4-re)
Mindaddig ismételje a bekérést a felhasználótól, amíg nem ad neki helyes háromszög oldal adatokat

 */

public class Task8 {
    public static void main(String[] args) {
        boolean flag = true;
        do {
            System.out.println("Hello, 1 number:");
            Scanner scanner = new Scanner(System.in);
            int numb1 = scanner.nextInt();
            System.out.println("2. number: ");
            int numb2 = scanner.nextInt();
            System.out.println("3. number: ");
            int numb3 = scanner.nextInt();

            String eredmeny;
            if (numb1 + numb2 > numb3 && numb2 + numb3 > numb1 && numb1 + numb3 > numb2) {
                eredmeny = "You are a lucky person.";
                flag = false;
            } else {
                eredmeny = "Please, try again.";
            }
            System.out.println("1 number: " + numb1);
            System.out.println("2. number: " + numb2);
            System.out.println("3. number: " + numb3);
            System.out.println(eredmeny);
        } while (flag);
    }
}