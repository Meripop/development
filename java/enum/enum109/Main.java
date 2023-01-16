package enum109;
/*
Készítsetek programot, mely a beírt, magyar nyelvű hónapról eldönti,
 hogy az melyik évszakban van. Készítsétek el a Month enumot, melyben
 a hónapok magyar nyelvű megfelelői vannak. A program vizsgálja meg
 switch-case segítségével a konzolról beírt értéket és írja ki, hogy
 az tavasz, nyár, ősz vagy téli évszakba tartozik.
 */


import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Írj be egy hónapot");
        String inputMonth = scanner.nextLine();

        String txt = " ";
        try {
            switch (Month.valueOf(inputMonth.toUpperCase(Locale.ROOT))) {
                case FEBRUÁR, DECEMBER, JANUÁR -> txt = "Tél";
                case MÁRCIUS, ÁPRILIS, MÁJUS -> txt = "Tavasz";
                case JÚNIUS, JÚLIUS, AUGUSZTUS -> txt = "Nyár";
                default -> txt = "Ősz";
            }
        } catch (IllegalArgumentException ex) {
            txt = "Nem jétezik ilyen hónap!";
        }


        System.out.println(txt);
    }

}
