package abstractTask15;

public abstract class Salary {
  /*  protected int dailySalary;
    protected int workedDay;

    public Salary(int dailySalary, int workedDay) {
        this.dailySalary = dailySalary;
        this.workedDay = workedDay;
    }*/

    abstract void salaryCalculation(int dailySalary, int workedDay);

    public void writeThanksNote(){
        System.out.println("Thanks for using me and let me assist in your calculation");
    }
}
