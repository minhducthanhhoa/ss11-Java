package bai7;

public class PartTimeEmployee extends Employee {
    private int workingHours;

    public PartTimeEmployee() {

    }

    public PartTimeEmployee(String name, int workingHours, int paymentPerHour) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return workingHours * paymentPerHour;
    }
}
