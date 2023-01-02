package inheritance.inheritanceTask8;

public class CocoaDoughtnut extends Doughnut {
    private int cocoaPercent;

    public CocoaDoughtnut(String shape, String flavour, String material, int size, String decoration, int cocoaPercent) {
        super(shape, flavour, material, size, decoration);
        this.cocoaPercent = cocoaPercent;
    }


    public void cocoaFillingMaing() {
        System.out.println("Make chochlet filling");
    }

    public int getCocoaPercent() {
        return cocoaPercent;
    }


    @Override
    public String toString() {
        return "CocoaDoughtnut{" +
                "shape='" + getShape() + '\'' +
                ", flavour='" + getFlavour() + '\'' +
                ", material='" + getMaterial() + '\'' +
                ", size=" + getSize() +
                ", decoration='" + getDecoration() + '\'' +
                " cocoaPercent=" + cocoaPercent +
                '}';
    }
}
