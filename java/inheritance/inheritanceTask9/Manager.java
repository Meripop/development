package inheritanceTask9;

public class Manager extends Employee {
    private boolean companyCar;

    public Manager(String name, String birthdate, boolean companyCar) {
        super(name, birthdate);
        this.companyCar = companyCar;
    }


    public void goEarlier() {
        System.out.println("Go early from work");
    }

    @Override
    public String toString() {
        return "Manager{" +
                super.toString() + " " +
                "companyCar=" + companyCar +
                '}';
    }
}
