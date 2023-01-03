public class Kid implements Person {

    String name;

    public Kid(String name) {
        this.name = name;
    }

    @Override
    public String receivePresent(Present present) {
        String react;

        if (present.showType().equals("Snail")) {
            react = "I'm very happy aboit it, I can make snail competition!";
        } else if (present.showType().equals("Chocolate")) {
            react = "I love chocolate, mmmmm.";
        } else if (present.showType().equals("Toy")) {
            react = "Finally a toy!";
        } else react = "Nothing:(";
        return name + " got " + present.piece + " piece of " + present.name + " and a react is: " + react + " Weight is: " + present.deliver() + " gramm";
    }


}
