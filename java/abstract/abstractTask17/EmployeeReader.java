import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeReader {
    List<Employee> listOfEmployee = new ArrayList<>();

    void read() {
        try (Scanner scanner = new Scanner(new File("src/resources/employee.csv"))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String position = line.split(", ")[0];
                String name = line.split(", ")[1];
                String salary = line.split(", ")[2];
                String customField = line.split(", ")[3];
                switch (position) {
                    case "Tester" -> {
                        Tester tester = new Tester(position, name, salary, customField);
                        listOfEmployee.add(tester);
                    }
                    case "Developer" -> {
                        Developer developer = new Developer(position, name, salary, customField);
                        listOfEmployee.add(developer);
                    }
                    case "HrAssistant" -> {
                        HrAssistant hrAssistant = new HrAssistant(position, name, salary, customField);
                        listOfEmployee.add(hrAssistant);
                    }
                    case "FinanceAssistant" -> {
                        FinanceAssistant financeAssistant = new FinanceAssistant(position, name, salary, customField);
                        listOfEmployee.add(financeAssistant);
                    }
                    case "ExecutiveDirector" -> {
                        ExecutiveDirector executiveDirector = new ExecutiveDirector(position, name, salary, customField);
                        listOfEmployee.add(executiveDirector);
                    }
                    default -> System.out.println("Not good");
                }
            }

        } catch (
                IOException ex) {
            System.out.println("File ddoesn't exist");
        }
    }

    public List<Employee> getListOfEmployee() {
        return listOfEmployee;
    }
}
