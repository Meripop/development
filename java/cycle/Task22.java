import java.util.Scanner;

import static java.lang.Math.pow;

/*
Írjuk át a számológép feladatot, switch-case adatszerkezet segítségével,
 kiváltva az if-else szelekciókat. Miután kiírta az eredményt kérdezze meg,
  hogy a felhasználó szeretne-e további számításokat végezni. Y/N-val,
   (azaz Yes/No-val) lehet válaszolni. Y esetén természetesen újraindul
    a fenti folyamat. N esetén pedig az illedelmes számológép megköszöni,
    hogy szolgálhatta felhasználóját.
 (Készítsetek programot, amely a program indításakor bekér két számot,
valamint egy operátort. Majd írja ki konzolra a végeredményt.
A számológép tudjon összeadni, kivonni, szorozni, osztani.
A megoldást töltsétek fel a progmaticjrta group alatti repository-tokba.
Opcionális: “pumpedelni”, ami a számok köbének szorzata.)
 */
public class Task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        String operator;
        do {

            System.out.println("elso szam:");
            a = Integer.parseInt(scanner.nextLine());
            System.out.println("masodik szam:");
            b = Integer.parseInt(scanner.nextLine());
            System.out.println("milyen muveletet? + - / * pumpedelni :");
            operator = scanner.nextLine();


            int add = a + b;
            int subtr = a - b;
            int multipln = a * b;
            double division = a / b;
            double kob = pow(a, b);

            switch (operator) {
                case "+" -> System.out.println("Addition is : " + add);
                case "-" -> System.out.println("Substraction is : " + subtr);
                case "*" -> System.out.println("Multiplation is : " + multipln);
                case "/" -> System.out.println("Division is : " + division);
                case "pumpedelni" -> System.out.println("umpedelni : " + kob);
            }
            System.out.println("Again?");
            operator = scanner.nextLine();
        } while (operator.equals("y"));
        System.out.println("Thank you!");
    }

}
