package bai9;

public class Main {
    public static void main(String[] args) {
        SavingAccount savingAcc = new SavingAccount("SA12345", 1000);
        CheckingAccount checkingAcc = new CheckingAccount("CA67890", 500);

        Bank bank = new Bank();
        bank.addAccount(savingAcc);
        bank.addAccount(checkingAcc);

        System.out.println("\nThực hiện giao dịch:");
        savingAcc.deposit(200);
        savingAcc.withdraw(500);
        savingAcc.withdraw(800);

        checkingAcc.withdraw(700);
        checkingAcc.deposit(300);


        bank.displayBalance();
    }
}
