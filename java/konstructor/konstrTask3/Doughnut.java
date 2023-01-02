package konstruktor.Task3;

public class Doughnut {
    // fields
    private String shape;
    private String flavour;
    private String material;
    private int size;
    private String decoration;

    public Doughnut(String shape, String flavour, String material, int size, String decoration) {
        this.shape = shape;
        this.flavour = flavour;
        this.material = material;
        this.size = size;
        this.decoration = decoration;


    }

    public String getShape() {
        return shape;
    }

    public String getFlavour() {
        return flavour;
    }

    public String getMaterial() {
        return material;
    }

    public int getSize() {
        return size;
    }

    public String getDecoration() {
        return decoration;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setDecoration(String decoration) {
        this.decoration = decoration;
    }
}
