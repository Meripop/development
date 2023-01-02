package inheritanceTask9;

public class Employee {
    private String name;
    private String birthdate;
    private Boolean contract;

    private int salary;

    public Employee(String name, String birthddate) {
        this.name = name;
        this.birthdate = birthddate;
    }

    public void vacation() {
        System.out.println("On vacation!");
    }

    public Boolean getContract() {
        return contract;
    }

    public void setContract(Boolean contract) {
        this.contract = contract;
    }

    public int getSalary(int i) {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", birthddate='" + birthdate + '\'' +
                ", contract=" + contract +
                ", salary=" + salary;
    }
}
