public class Task28 {
    /*
    Írjunk programot, ami a parancssori paramétereket beolvassa induláskor,
     majd azokat ki is írja a képernyőre.
     Ha ez megvan, ezután írjuk ki ezeket a bemenő paramétereket visszafelé is.
     */
    public static void main(String[] args) {

        for (String arg : args) {
            System.out.println(arg);
        }
        System.out.println("Backwards:");
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println(args[i]);
        }
    }
}
