package abstractTask15;

public class USSalary extends Salary {
    private int ussTaxes;
    private int salary;

    public USSalary(int ussTaxes) {
        this.ussTaxes = ussTaxes;
    }

    @Override
    void salaryCalculation(int dailySalary, int workedDay) {
        salary = ussTaxes * dailySalary * workedDay;
    }
}
