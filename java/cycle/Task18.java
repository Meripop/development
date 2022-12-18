import java.util.Scanner;

import static java.lang.Math.pow;

/*Készítsetek programot, amely a program indításakor bekér két számot, valamint egy operátort. Majd írja ki konzolra a végeredményt. A számológép tudjon összeadni, kivonni, szorozni, osztani. A megoldást töltsétek fel a progmaticjrta group alatti repository-tokba.
Opcionális: “pumpedelni”, ami a számok köbének szorzata.

 */
public class Task18 {
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

            if (operator.equals("+")) {
                System.out.println("Addition is : " + add);
            } else if (operator.equals("-")) {
                System.out.println("Substraction is : " + subtr);

            } else if (operator.equals("*")) {
                System.out.println("Multiplation is : " + multipln);

            } else if (operator.equals("/")) {
                System.out.println("Division is : " + division);

            } else if (operator.equals("pumpedelni")) {
                System.out.println("umpedelni : " + kob);
            }
            System.out.println("Again?");
            operator = scanner.nextLine();
        } while (operator.equals("y"));

    }

}
