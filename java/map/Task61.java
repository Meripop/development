import java.util.Scanner;

public class Task61 {
    /*
    Készítsünk egy metódust, amely kapott szám esetén eldönti,
    hogy az 18-nál nagyobb-e. Ha igen, kiírja hogy “Elmúltál 18,
     jogosult vagy a belépésre!”,
     egyébként pedig írja ki, hogy “Nem vagy még 18, sicc innen!”
     */
    private static void isBelowEighteen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ird be a korod: ");
        int numb = scanner.nextInt();
        if (numb >= 18) {
            System.out.println("Elmúltál 18, jogosult vagy a belépésre");
        } else
            System.out.println("Nem vagy még 18, sicc innen!");
    }

    public static void main(String[] args) {
        isBelowEighteen();
    }

}
