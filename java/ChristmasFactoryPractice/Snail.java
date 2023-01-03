public class Snail extends Present {
    int weightGramm = 20;

    public Snail(String name, int piece) {
        super(name, piece);
    }

    @Override
    public String showType() {
        return "Snail";
    }

    @Override
    int deliver() {
        return weightGramm * piece;
    }

    @Override
    public String toString() {
        return "Snail " +
                "present weight: " + deliver();
    }
}
