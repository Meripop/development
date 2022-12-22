import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Adott egy neveket tartalmazó lista. Készítsünk egy programot, ami készít egy
újabb listát a meglévő nevekből nagybetűre módosítva azok minden betűjét. Miután
elkészítettük az új listát írjuk ki annak tartalmát. Nem szükséges for ciklust használnunk
a végeredmény kiíratásához, elég ha a listát odaadjuk a System.out.println()
metódusnak.

 */
public class Task70 {


    public static List<String> setToUpperCase(List<String> loggedHours) {
        List<String> newArrayList = new ArrayList<>();
        for (String name : loggedHours
        ) {
            newArrayList.add(name.toUpperCase());
        }
        return newArrayList;
    }

    public static void main(String[] args) throws IOException {
        List<String> loggedHours = Arrays.asList(
                "Zuckerberg,4", "Steve,4", "Bill,1", "Bill,2", "Zuckerberg,4", "Bill,2",
                "Zuckerberg,1", "Zuckerberg,3", "Zuckerberg,1", "Zuckerberg,1", "Steve,4",
                "Bill,2", "Zuckerberg,3", "Bill,2", "Zuckerberg,4", "Steve,1",
                "Bill,3", "Steve,2", "Steve,2", "Bill,1", "Zuckerberg,4",
                "Bill,4", "Steve,4", "Bill,2", "Bill,3", "Zuckerberg,3",
                "Steve,4", "Zuckerberg,4", "Bill,2", "Zuckerberg,3"
        );
        System.out.println(setToUpperCase(loggedHours));


    }
}
