package inheritanceTask9;

public class DirectReport extends Employee {
    private int workingHours;

    public DirectReport(String name, String birthdate, int workingHours) {
        super(name, birthdate);
        this.workingHours = workingHours;
    }

    public void work() {
        System.out.println("Work");
    }

    @Override
    public String toString() {
        return "DirectReport{" +
                super.toString() + " " +
                "workingHours=" + workingHours +
                '}';
    }
}
