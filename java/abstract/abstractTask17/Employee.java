public abstract class Employee {
    String position;
    String name;
    String salary;
    String customField;

    public Employee(String position, String name, String salary, String customField) {
        this.position = position;
        this.name = name;
        this.salary = salary;
        this.customField = customField;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getCustomField() {
        return customField;
    }

    public void setCustomField(String customField) {
        this.customField = customField;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                ", customField='" + customField + '\'' +
                '}';
    }
}
