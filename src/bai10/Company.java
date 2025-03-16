package bai10;

public class Company {
    private Employee[] employees;
    private int count;

    public Company(int size) {
        employees = new Employee[size];
        count = 0;
    }

    // Thêm nhân viên vào công ty
    public void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count] = employee;
            count++;
            System.out.println("Đã thêm nhân viên: " + employee.getName());
        } else {
            System.out.println("Công ty đã đầy, không thể thêm nhân viên mới.");
        }
    }

    // Gọi tất cả nhân viên làm việc
    public void startWork() {
        System.out.println("\nCông ty bắt đầu làm việc:");
        for (int i = 0; i < count; i++) {
            employees[i].work();
        }
    }

    // Tổ chức nghỉ phép cho nhân viên
    public void vacationTime() {
        System.out.println("\nNhân viên đang đi nghỉ phép:");
        for (int i = 0; i < count; i++) {
            employees[i].takeVacation();
        }
    }

    // Tổ chức cuộc họp (chỉ dành cho Manager)
    public void organizeMeeting() {
        System.out.println("\nCông ty tổ chức cuộc họp:");
        for (int i = 0; i < count; i++) {
            if (employees[i] instanceof AttendMeeting) {
                ((AttendMeeting) employees[i]).addAttendMeeting();
            }
        }
    }
}
