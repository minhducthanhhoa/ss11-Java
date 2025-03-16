package bai10;

public abstract class Employee {
    protected String name;
    protected double salary;

    public Employee() {

    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract void work();
    public abstract void takeVacation();

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
