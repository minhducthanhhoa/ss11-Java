package bai9;

public class SavingAccount extends BankAccount {
    public SavingAccount() {

    }

    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance && amount < 0) {
            System.out.println("Không thể rút tiền");
        } else {
            balance -= amount;
            System.out.println("Đã rút" + amount + ". Số dư mới: " + balance + ".");
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Đã nạp" + amount + ". Số dư mới: " + balance + ".");
    }

    @Override
    public void displayBalance() {
        System.out.println("Tài khoản [" + accountNumber + "] - Số dư : " + balance + ".");
    }
}
