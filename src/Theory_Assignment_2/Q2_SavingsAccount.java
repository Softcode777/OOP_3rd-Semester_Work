package Theory_Assignment_2;

public class Q2_SavingsAccount extends Q2_BankAccount {
    private double withdrawalLimit;

    // Constructor name should match the class name exactly
    public Q2_SavingsAccount(String accountNumber, String accountHolderName, double initialBalance, double withdrawalLimit) {
        // Call the parent constructor properly
        super(accountNumber, accountHolderName, initialBalance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("Withdrawal failed! Amount exceeds the withdrawal limit of: " + withdrawalLimit);
        } else {
            super.withdraw(amount); // Call the base class method for withdrawal logic
        }
    }
}
