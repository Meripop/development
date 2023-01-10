public class Task9 {
    /*
    Írjunk programot, amely a számok négyzeteit írja ki 0-tól 20-ig.
készítsük el while-al
készítsük el for-al

     */

    public static void main(String[] args) {

//while
        int count = 0;
        while (count != 21) {
            System.out.println(count * count);
            count++;
        }
//for
        for (int i = 0; i <= 20; i++) {
            System.out.println(i * i);
        }
    }
}
