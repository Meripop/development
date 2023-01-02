package interfaceTask11;

public class Square implements PolygonInterface{
    public Square(){};

    @Override
    public int getArea(int a, int b) {
        return a*a;
    }


}
