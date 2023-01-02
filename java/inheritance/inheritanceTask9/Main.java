package inheritanceTask9;
/*
Készítsetek tetszőleges tulajdonságokkal és metódusokkal az alábbi hierarchiát:

 */

public class Main {
    public static void main(String[] args) {
        Manager luis = new Manager("Luis", "19940505", true);
        luis.setSalary(23456);
        luis.vacation();
        luis.goEarlier();
        System.out.println(luis);

        DirectReport bob = new DirectReport("Bob", "19990909", 8);
        System.out.println(bob);
        bob.work();

    }
}