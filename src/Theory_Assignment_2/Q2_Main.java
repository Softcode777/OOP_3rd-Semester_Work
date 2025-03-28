package Theory_Assignment_2;
// BankAccountManagementSystem
public class Q2_Main {
    public static void main(String[] args) {
        // Create a Regular Bank Account
        Q2_BankAccount account1 = new Q2_BankAccount("001", "Alice", 5000);
        System.out.println("Account Holder: " + account1.getAccountHolderName());

        account1.deposit(1500);
        account1.withdraw(2000);

        // Create a Savings Account with a Withdrawal Limit
        Q2_SavingsAccount savingsAccount = new Q2_SavingsAccount("002", "Bob", 8000, 3000);
        System.out.println("\nAccount Holder: " + savingsAccount.getAccountHolderName());

        // Deposit and Withdraw from Savings Account
        savingsAccount.deposit(2000);
        savingsAccount.withdraw(3500); // Exceeds limit
        savingsAccount.withdraw(2500); // Within limit
    }
}
