package interfaceTask11;

public class Rectangle implements PolygonInterface {
    public Rectangle() {

    }

    @Override
    public int getArea(int a, int b) {
        return a * b;
    }


    @Override
    public String toString() {
        return "Rectangle{}";
    }
}
