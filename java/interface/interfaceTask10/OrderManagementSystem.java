package interfaceTask10;
/*
Webáruház. A következő feladatban egy webáruház rendeléseit kezelő alkalmazást
kellene készíteni. Az alkalmazás feladata lesz a leadott rendelések feldolgozása. A
feldolgozás menete a következő:
● Mikor beérkezik egy rendelés, ellenőrzi, hogy a termék van-e raktáron.
● Ha van raktáron, kiszámolja az árat és visszatér a Success! Thank you for your
order. The price is: ...üzenettel.
● Abban az esetben, ha nem volt raktáron a Something failed. Please contact us.
üzenettel térjünk vissza.
A megoldás során hozd létre a következő osztályokat:
● OrderManagementSystem: Legyen ez az alkalmazásod belépési pontja. Ez az
osztály arra szolgáljon, hogy továbbhívjon a többi osztályba.
● PaymentService: Számolja ki a fizetendő összeget.
● ProductAvailabilityService: Adja vissza, hogy az adott termék van-e raktáron.
● OrderInterfész: definiálja a makeOrder metódus meglétét.
● Order: Kötelezően kell legyen egy makeOrder metódusa, amely információt tárol
le a megrendelt termék nevéről valamint annak mennyiségéről.
Tipp: A ProductAvailabilityService esetében nem szükséges kitalált
adatokból dolgoznod, elég, ha 70%-os valószínűséggel visszatérnek igaz
vagy hamis értékkel. Ezt a következő módon érheted el a legegyszerűbben:
Math.random() < 0.7 A PaymentService pedig térjen vissza egy 1 és 100000
közötti számmal, amit így érhetünk el: (int) (Math.random() * 100000 + 1)

 */

/**
 * PaymentService: Számolja ki a fizetendő összeget.
 * ProductAvailabilityService: Adja vissza, hogy az adott termék van-e raktáron.
 * Order: Kötelezően kell legyen egy makeOrder metódusa, amely információt tárol le a megrendelt termék nevéről valamint annak mennyiségéről.
 * OrderInterfész: definiálja a makeOrder metódus meglétét.
 */
public class OrderManagementSystem {
    public static void main(String[] args) {


        Order order = new Order();
        order.makeOrder();
        ProductAvailabilityService productAvailabilityService = new ProductAvailabilityService();

        if (productAvailabilityService.getAvailable()) {
            PaymentService paymentService = new PaymentService();
            int price = paymentService.getPrice();
            int count = order.getProductCount();
            System.out.println("Success! Thank you for your order. The price is: " + price * count);
        } else {
            System.out.println("Something failed. Please contact us.");
        }
    }


}