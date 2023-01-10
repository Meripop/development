import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalAccessor;
import java.util.Scanner;

public class Task101 {
    /*
    Készítsetek egy alkalmazást, amely a konzolról bekért dátumot leellenőrzi
     és ha érvényes,
    valid dátum akkor írj ki hogy “Valid datetime.”,
    egyébként pedig hogy “Invalid datetime.”
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println("Add a datetime and press an ENTER: ");
        String inputDate = scanner.nextLine();

        try {
            LocalDateTime date = LocalDateTime.parse(inputDate);
            System.out.println("Hurray valid datetime!");
        } catch (DateTimeParseException dateTimeParseException) {
            System.out.println("Invalid datetime!");
        }
    }
}

