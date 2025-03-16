package bai7;

public class Main {
    public static void main(String[] args) {
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Minh Đức", 13, 4);
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Huy", 18);

        System.out.println(partTimeEmployee.getName() + " lương: " + partTimeEmployee.calculateSalary());
        System.out.println(fullTimeEmployee.getName() + " lương: " + fullTimeEmployee.calculateSalary());
    }
}
