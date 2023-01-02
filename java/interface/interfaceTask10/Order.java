package interfaceTask10;
import java.util.Scanner;

public class Order implements OrderInterface {
    private String productName;
    private int productCount;

    @Override
    public void makeOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add pruduct name: ");
        productName = scanner.nextLine();
        System.out.println("Add product count");
        productCount = Integer.parseInt(scanner.nextLine());
    }

    public String getProductName() {
        return productName;
    }

    public int getProductCount() {
        return productCount;
    }
}
