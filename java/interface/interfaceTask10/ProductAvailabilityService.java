package interfaceTask10;
import java.util.Random;

public class ProductAvailabilityService {

    public Boolean getAvailable() {
        Random random = new Random();
        int rand = random.nextInt(3);
        return rand < 2;
    }
}
