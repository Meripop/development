package abstractTask14;

public class SoftwareTester extends Employee {

    private int bugCount;
    private int salary;

    public SoftwareTester(String name, String position, int bugCount) {
        super(name, position);
        this.bugCount = bugCount;

    }

    @Override
    void comutePay() {
        salary = 20000 * bugCount;
    }

    @Override
    public String toString() {
        return "SoftwareTester{" +
                "bugCount=" + bugCount +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
