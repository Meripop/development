public class Elder implements Person {
    String name;

    public Elder(String name) {
        this.name = name;
    }

    @Override
    public String receivePresent(Present present) {
        String react;
        if (present.showType().equals("Snail")) {
            react = "Cool, something what I can eat without teeths!!";
        } else if (present.showType().equals("Chocolate")) {
            react = "Make a hot chocolate please!";
        } else if (present.showType().equals("Toy")) {
            react = "Thanks, I'm too old for it!";
        } else react = "Nothing:(";
        return name + " got " + present.piece + " piece of " + present.name + " and a react is: " + react + " Weight is: " + present.deliver() + " gramm";

    }

}
