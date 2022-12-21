import java.util.Arrays;
import java.util.List;

/*
Készítsünk egy elemzést a legutóbbi futásainkról. Az adatokat már kinyertük az
aktivitás tracker-ünkbők, az alábbi formában: Arrays.asList( 12.30, 12.45, 12.35, 12.54,
12.53, 12.45, 12.61, 12.62, 12.73, 12.91, 12.90, 12.72, 12.85, 12.90, 12.70, 12.58, 12.61,
12.67, 12.63, 12.61, 12.74, 12.84, 12.99, 13.10, 13.21, 13.39, 13.23, 13.09, 13.15, 13.00,
12.91, 12.85, 12.89, 13.00, 13.03, 13.16, 13.25, 13.35, 13.36, 13.28,13.42, 13.49, 13.36,
13.32, 13.20, 13.23, 13.20, 13.02, 12.91, 12.74, 12.81, 12.63, 12.79, 12.65, 12.59, 12.77,
12.77, 12.89, 12.76, 12.76,12.91, 12.90, 12.86, 12.89, 12.83, 12.67, 12.69, 12.65, 12.73,
12.87);
Ami a feladat, hogy írassuk ki a konzolra a listában található legnagyobb, legkisebb és
átlagos sebességet.
 */
public class Task45 {
    public static void main(String[] args) {
        List<Double> numbsList = Arrays.asList(12.30, 12.45, 12.35, 12.54, 12.53, 12.45, 12.61, 12.62, 12.73, 12.91, 12.90, 12.72, 12.85, 12.90, 12.70, 12.58, 12.61, 12.67, 12.63, 12.61, 12.74, 12.84, 12.99, 13.10, 13.21, 13.39, 13.23, 13.09, 13.15, 13.00, 12.91, 12.85, 12.89, 13.00, 13.03, 13.16, 13.25, 13.35, 13.36, 13.28, 13.42, 13.49, 13.36, 13.32, 13.20, 13.23, 13.20, 13.02, 12.91, 12.74, 12.81, 12.63, 12.79, 12.65, 12.59, 12.77, 12.77, 12.89, 12.76, 12.76, 12.91, 12.90, 12.86, 12.89, 12.83, 12.67, 12.69, 12.65, 12.73, 12.87);

        double max = numbsList.stream().mapToDouble(Double::doubleValue).max().getAsDouble();
        System.out.println("max: " + max);
        double min = numbsList.stream().mapToDouble(Double::doubleValue).min().getAsDouble();
        System.out.println("min: " + min);
        double average = 0;
        for (int i = 0; i < numbsList.size(); i++) {
            average += numbsList.get(i);
        }
        System.out.println("average: " + average / numbsList.size());
    }
}