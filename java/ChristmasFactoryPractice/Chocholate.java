public class Chocholate extends Present {
    int weightGramm = 300;

    public Chocholate(String name, int piece) {
        super(name, piece);
    }

    @Override
    int deliver() {
        return weightGramm * piece;
    }

    @Override
    String showType() {
        return "Chocolate";
    }

    @Override
    public String toString() {
        return "Chocolate " +
                "present weight: " + deliver();
    }
}
