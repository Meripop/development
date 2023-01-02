package inheritance.inheritanceTask8;

public class JamDoughnut extends Doughnut {
    private int fruitPercent;

    public JamDoughnut(String shape, String flavour, String material, int size, String decoration, int fruitPercent) {
        super(shape, flavour, material, size, decoration);
        this.fruitPercent = fruitPercent;
    }

    public JamDoughnut(int fruitPercent) {
        super("kerek", "lekvar", "liszt", 10, "porcukor");
        this.fruitPercent = fruitPercent;
    }

    public void jamFillingMaing() {
        System.out.println("Make jamfilling");
    }

    public int getFruitPercent() {
        return fruitPercent;
    }

    @Override
    public String toString() {
        return "FruitDoughtnut{" +
                super.toString() +
                " fruitPercent=" + fruitPercent +
                '}';
    }

}
