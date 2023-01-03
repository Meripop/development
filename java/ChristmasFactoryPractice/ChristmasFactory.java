import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ChristmasFactory {

    public static void main(String[] args) throws IOException {

        Kid eva = new Kid("Eva");
        System.out.println(eva.receivePresent(new Snail("eticsiga", 3)));

        Elder bob = new Elder("Bob");
        System.out.println(bob.receivePresent(new Toy("bugocsiga", 1)));

        FileWriter fileWriter = new FileWriter("src/resources/deliver.log", true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(eva.receivePresent(new Snail("eticsiga", 3)));
        printWriter.println(bob.receivePresent(new Toy("bugocsiga", 1)));
        printWriter.close();

    }
}

