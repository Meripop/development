package interfaceTask10;
import java.util.Random;

public class PaymentService {
    public int getPrice() {
        Random random = new Random();
        int price = random.nextInt(1000) + 1;

        return price;
    }
}
