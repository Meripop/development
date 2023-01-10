public class Task2a {
    /*
    Készítsünk programot, ami a megadott két számot, “a”-t és “b” letárolja,
     majd megmondja mennyi lesz a maradék, ha “a”-t elosztjuk “b”-vel.
parancssori argumentumként olvassa be a számokat
felhasználótól kérjük be a számokat

     */
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int result = a % b;
        System.out.println(result);
    }
}
