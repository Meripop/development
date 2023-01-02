package abstractTask15;

public class NorwaySalary extends Salary {
    private int norwayTaxes;
    private int salary;

    public NorwaySalary(int dailySalary, int workedDay, int norwayTaxes) {

        this.norwayTaxes = norwayTaxes;
    }

    @Override
    void salaryCalculation(int dailySalary, int workedDay) {
        salary = norwayTaxes * dailySalary * workedDay;
    }

    @Override
    public String toString() {
        return "NorwaySalary{" +
                "norwayTaxes=" + norwayTaxes +
                ", salary=" + salary +
                '}';
    }
}
