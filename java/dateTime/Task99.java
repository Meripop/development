import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

public class Task99 {
    /*Érkezés munkába. Az egyik nagyvállalat, aki feljegyzi,
     hogy a dolgozói mikorra járnak be dolgozni és
     hogy mikor távoznak szeretne egy elemzést készíteni. Az
    elemzéshez összegyűjtötték a fejlesztők reggeli érkezésére
     vonatkozó adatokat egy listába. A feladatunk, hogy írjunk
     egy programot, ami kiszámítja, hogy a fejlesztők hány százaléka
     ment be az adott napon a 7-8, 8-9, 9-10, 10-11 időszakban.
A beérkezési időpontok:
List<String> logs = Arrays.asList(
    "07:38", "07:53", "07:17", "07:04", "07:48", "07:36", "07:52",
    "07:12", "07:43", "07:45", "08:11", "07:53", "08:32", "07:44",
    "07:19", "07:54", "07:36", "08:39", "07:22", "08:58", "07:23",
    "07:40", "07:22", "07:06", "07:56", "07:26", "08:09", "07:30",
    "07:51", "08:49", "08:41", "07:56", "07:12", "07:15", "07:47",
    "07:14", "08:40", "07:50", "07:06", "07:39", "08:16", "07:26",
    "07:56", "08:52", "07:24", "07:22", "07:05", "08:32", "07:32",
    "07:54", "07:04", "07:13", "07:07", "08:55", "07:14", "07:48",
    "08:19", "08:53", "08:50", "08:32", "07:47", "07:48", "08:41",
    "08:15", "07:20", "07:29", "08:39", "07:58", "07:17", "07:18"
);
     */
    public static void main(String[] args) {
        List<String> logs = Arrays.asList(
                "07:38", "07:53", "07:17", "07:04", "07:48", "07:36", "07:52",
                "07:12", "07:43", "07:45", "08:11", "07:53", "08:32", "07:44",
                "07:19", "07:54", "07:36", "08:39", "07:22", "08:58", "07:23",
                "07:40", "07:22", "07:06", "07:56", "07:26", "08:09", "07:30",
                "07:51", "08:49", "08:41", "07:56", "07:12", "07:15", "07:47",
                "07:14", "08:40", "07:50", "07:06", "07:39", "08:16", "07:26",
                "07:56", "08:52", "07:24", "07:22", "07:05", "08:32", "07:32",
                "07:54", "07:04", "07:13", "07:07", "08:55", "07:14", "07:48",
                "08:19", "08:53", "08:50", "08:32", "07:47", "07:48", "08:41",
                "08:15", "07:20", "07:29", "08:39", "07:58", "07:17", "07:18"
        );
        System.out.println(LocalTime.now());

        LocalTime seven = LocalTime.of(7, 0);
        LocalTime eight = LocalTime.of(8, 0);
        LocalTime nine = LocalTime.of(9, 0);
        LocalTime ten = LocalTime.of(10, 0);
        LocalTime eleven = LocalTime.of(11, 0);
        int sevenEight = 0;
        int eightNine = 0;
        int nineTen = 0;
        int tenEleven = 0;

        for (String log : logs) {
            LocalTime timeLog = LocalTime.parse(log);
            if (timeLog.isAfter(seven) && timeLog.isBefore(eight)) {
                sevenEight++;
            } else if (timeLog.isAfter(eight) && timeLog.isBefore(nine)) {
                eightNine++;
            } else if (timeLog.isAfter(nine) && timeLog.isBefore(ten)) {
                nineTen++;
            } else if (timeLog.isAfter(ten) && timeLog.isBefore(eleven)) {
                tenEleven++;
            }
        }
        System.out.println("Between seven and eight: " + sevenEight + " darab belepes, " + (double) sevenEight / logs.size() * 100 + "%-a");
        System.out.println("Between eight and nine: " + eightNine + " darab belepes, " + (double) eightNine / logs.size() * 100 + "%-a");
        System.out.println("Between nine and ten: " + nineTen + " darab belepes, " + (double) nineTen / logs.size() * 100 + "%-a");
        System.out.println("Between ten and eleven: " + tenEleven + " darab belepes, " + (double) tenEleven / logs.size() * 100 + "%-a");


    }
}
