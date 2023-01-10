import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Írjatok programot, amely a megadott testhőmérsékleti adatokból, amit a felhasználó rögzített, a listában tárolást követően
kiszámolja mennyi volt az átlagos testhő
hányszor volt lázas a bevitt adatok alapján a delikvens
Az adatokat az utolsó 3 nap, napi 3 (reggeli, napközbeni és esti) adataival kell mindig rögzíteni, tehát mindig fix 9 testhőmérsékleti adatot.

 */
public class Task42 {
    public static void main(String[] args) {
        List<Double> homList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        double dailyPluss = 0;
        int lazas = 0;
        int countOfNumb = 0;
        //System.out.println("How many data? :");
        int howManyDataInput = 3;
        while (countOfNumb != howManyDataInput) {
            System.out.println("Type a temperature: ");
            double inputhom = scanner.nextDouble();
            homList.add(inputhom);
            System.out.println("Tempreture list " + homList);
            countOfNumb++;
            if (inputhom >= 38) {
                lazas++;
            }

        }
        for (double daily : homList) {
            dailyPluss += daily;
        }
        double finalAtlag = dailyPluss / homList.size();
        System.out.println("Average: " + finalAtlag);
        System.out.println("had a fever " + lazas + " times");

    }

}