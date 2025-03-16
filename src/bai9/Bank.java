package bai9;

public class Bank {
    private BankAccount[] accounts = new BankAccount[10];  // Tối đa 10 tài khoản
    private int count = 0;  // Số lượng tài khoản hiện tại

    public void addAccount(BankAccount account) {
        if (count < 10) {
            accounts[count] = account; // Lưu tài khoản vào danh sách
            count++; // Tăng biến đếm số tài khoản hiện có
            System.out.println("Đã thêm tài khoản: " + account.accountNumber);
        } else {
            System.out.println("Ngân hàng đã đầy, không thể thêm tài khoản mới.");
        }
    }

    public void displayBalance() {
        System.out.println("\nDanh sách tài khoản trong ngân hàng:");
        for (int i = 0; i < count; i++) {
            accounts[i].displayBalance();
        }
    }
}
