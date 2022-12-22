import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/*
Adott egy List amiben az adott hónapban felvásárolt cégeket rögzítjük. Pl ez:
List<String> loggedHours = Arrays.asList(
"Zuckerberg,4", "Steve,4", "Bill,1", "Bill,2", "Zuckerberg,4",
"Bill,2",
69
"Zuckerberg,1", "Zuckerberg,3", "Zuckerberg,1", "Zuckerberg,1",
"Steve,4",
"Bill,2", "Zuckerberg,3", "Bill,2", "Zuckerberg,4", "Steve,1",
"Bill,3", "Steve,2", "Steve,2", "Bill,1", "Zuckerberg,4",
"Bill,4", "Steve,4", "Bill,2", "Bill,3", "Zuckerberg,3",
"Steve,4", "Zuckerberg,4", "Bill,2", "Zuckerberg,3"
);
Összegezzük, hogy összesen hány céget vásároltak fel a fenti úriemberek.
 */
public class Task72 {
    private static int countCompany(List<String> loggedHours) {
        int countCompany = 0;
        for (String company : loggedHours) {
            // String[] splittedCompany = company.split(",");
            countCompany += Integer.parseInt(company.split(",")[1]);
        }
        return countCompany;
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
        System.out.print("They bought ");
        System.out.print(countCompany(loggedHours));
        System.out.println(" company.");


    }
}
