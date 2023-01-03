public abstract class Present {
    protected String name;
    protected int weight;
    protected int piece;

    public Present(String name, int piece) {
        this.name = name;
        this.piece = piece;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getPiece() {
        return piece;
    }

    abstract int deliver();

    abstract String showType();

    @Override
    public String toString() {
        return "Present{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", piece=" + piece +
                '}';
    }

}
