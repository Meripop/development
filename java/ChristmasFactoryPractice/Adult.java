public class Adult implements Person {
    String name;

    public Adult(String name) {
        this.name = name;
    }

    @Override
    public String receivePresent(Present present) {
        String react;
        if (present.showType().equals("Snail")) {
            react = "I'm not happy aboit it!";
        } else if (present.showType().equals("Chocolate")) {
            react = "More please!";
        } else if (present.showType().equals("Toy")) {
            react = "Finally I can play my kid!";
        } else react = "Nothing:(";
        return name + " got " + present.piece + " piece of " + present.name + " and a react is: " + react + " Weight is: " + present.deliver() + " gramm";
    }
}
