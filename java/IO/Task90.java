import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Task90 {
    static Scanner scanner = new Scanner(System.in);

    private static List<String> inputFromUser() {
        List<String> inputUserList = new ArrayList<>();
        String inputFromConsole = "";
        while (!Objects.equals(inputFromConsole, "x")) {
            inputFromConsole = scanner.nextLine();
            inputUserList.add(inputFromConsole + ", ");
            inputUserList.remove("x");
        }

        return inputUserList;
    }

    private static void saveToFile(List<String> list) {
        writeToFile("", false);
        for (int i = 0; i < list.size(); i++) {
            writeToFile(list.get(i) + " ", true);
        }
    }

    private static void writeToFile(String content, boolean append) {
        try {
            if (append) {
                Files.writeString(Path.of("src/resources/shoppinglist.txt"), content, StandardOpenOption.APPEND);
            } else {
                Files.writeString(Path.of("src/resources/shoppinglist.txt"), content);
            }

        } catch (IOException e) {
            System.out.println("Something went wrong with the arguments saving: " + e.getMessage());

        }
    }

    public static void main(String[] args) {
        saveToFile(inputFromUser());
    }
}
