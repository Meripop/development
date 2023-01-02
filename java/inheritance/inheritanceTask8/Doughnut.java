package inheritance.inheritanceTask8;

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

    public void runsOut() {
        System.out.println("Runs out");
    }

    public void tasteExperience() {
        System.out.println("Taste Experience");
    }

    public void rise() {
        System.out.println("Rise");
    }

    public void nutrify() {
        System.out.println("Nutrify");
    }

    public void fatten() {
        System.out.println("Fatten");
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


    @Override
    public String toString() {
        return "Doughnut{" + "shape='" + shape + '\'' + ", flavour='" + flavour + '\'' + ", material='" + material + '\'' + ", size=" + size + ", decoration='" + decoration + '\'';
    }
}
