package bai10;

public class Developer extends Employee {
    public Developer() {

    }

    public Developer(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("Lập trình viên " + name + " (Lương: $" + salary + ") đang viết code cho hệ thống mới.");
    }

    @Override
    public void takeVacation() {
        System.out.println("Lập trình viên " + name + " (Lương: $" + salary + ") đang đi nghỉ phép ở Bali.");
    }
}
