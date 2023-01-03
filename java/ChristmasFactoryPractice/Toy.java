public class Toy extends Present {
    int weightGramm = 200;

    public Toy(String name, int piece) {
        super(name, piece);
    }

    @Override
    int deliver() {
        return weightGramm * piece;
    }

    @Override
    String showType() {
        return "Toy";
    }

    @Override
    public String toString() {
        return "Toy " +
                "present weight: " + deliver();
    }
}
