package Theory_Assignment_2;

public class Q2_SavingsAccount extends Q2_BankAccount {
    private double withdrawalLimit;

    public Q2_SavingsAccount(String accountNumber, String accountHolderName, double initialBalance, double withdrawalLimit) {
        super(accountNumber, accountHolderName, initialBalance);
        this.withdrawalLimit = withdrawalLimit;
    }
    @Override
    public void withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("Withdrawal failed! Amount exceeds the withdrawal limit of: " + withdrawalLimit);
        } else {
            super.withdraw(amount);
        }
    }
}
