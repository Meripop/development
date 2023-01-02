package abstractTask14;

public class HrAssistant extends Employee {
    private boolean noMorePeople;
    private int salary;

    public HrAssistant(String name, String position, boolean noMorePeople) {
        super(name, position);
        this.noMorePeople = noMorePeople;

        comutePay();
    }

    @Override
    void comutePay() {
        if (noMorePeople) {
            salary = 2;
        } else
            salary = 20000;
    }

    @Override
    public String toString() {
        return "HrAssistant{" +
                "noMorePeople=" + noMorePeople +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
