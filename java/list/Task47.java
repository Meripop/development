import java.util.Arrays;
import java.util.List;

/*
Írjunk programot, ami összeszámolja a dolgozói szavazatokat amely a karácsonyi
        party helyszínével kapcsolatos. Szerencsére egy gyakornok összegyűjtötte a
        szavazatokat egy Listába, íme:
        "Rumour", "Babel", "Babel","Babel", "Babel","Babel", "Babel","Babel", "Babel","Babel",
        "Babel","Babel", "Babel","Rumour","Babel", "Babel", "Rumour","Rumour", "Rumour","Babel",
        "Babel", "Rumour","Rumour", "Rumour", "Babel", "Rumour", "Rumour", "Rumour", "Rumour",
        "Rumour", "Rumour", "Babel", "Rumour","Rumour", "Rumour","Babel", "Babel", "Rumour",
        "Rumour", "Rumour", "Rumour"
        Készítsünk egy List-et ezzel a kezdőértékkel és számoljuk meg a szavazatokat, majd
        írjuk ki a győztes helyet a képernyőre*/
public class Task47 {

    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Rumour", "Babel", "Babel", "Babel", "Babel", "Babel", "Babel", "Babel", "Babel", "Babel", "Babel", "Babel", "Babel", "Rumour", "Babel", "Babel", "Rumour", "Rumour", "Rumour", "Babel", "Babel", "Rumour", "Rumour", "Rumour", "Babel", "Rumour", "Rumour", "Rumour", "Rumour", "Rumour", "Rumour", "Babel", "Rumour", "Rumour", "Rumour", "Babel", "Babel", "Rumour", "Rumour", "Rumour", "Rumour");

        int rumour = 0;
        int babel = 0;
        for (String s : nameList) {
            if (s.equals("Rumour")) {
                rumour++;
            } else if (s.equals("Babel")) {
                babel++;
            }


        }
        if (rumour > babel) {
            System.out.println("Rumour win");
        } else if (babel > rumour) {
            System.out.println("Babel win");
        } else {
            System.out.println("Draw");
        }
    }
}