package abstractTask15;

public class HungarianSalary extends Salary {

    private int hungarianTaxes;
    private int salary;


    public HungarianSalary(int dailySalary, int workedDay, int hungarianTaxes) {
        this.hungarianTaxes = hungarianTaxes;
        salaryCalculation(dailySalary, workedDay);
    }

    @Override
    void salaryCalculation(int dailySalary, int workedDay) {
        double taxes = (hungarianTaxes + 100) / 100;
        salary = dailySalary * workedDay * hungarianTaxes;
    }

    @Override
    public String toString() {
        return "HungarianSalary{" +
                "hungarianTaxes=" + hungarianTaxes +
                ", salary=" + salary +
                '}';
    }
}
