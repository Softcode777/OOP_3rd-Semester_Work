package Theory_Assignment_2;
// BankAccountManagementSystem
public class Q2_Main {
    public static void main(String[] args) {
        // Create a Regular Bank Account
        Q2_BankAccount account1 = new Q2_BankAccount("001", "Ikram", 10000);
        System.out.println("Account Holder: " + account1.getAccountHolderName());
        System.out.println("Initial Balance " + account1.getBalance());

        account1.deposit(1500);
        account1.withdraw(2000);

        // Create a Savings Account with a Withdrawal Limit
        Q2_SavingsAccount savingsAccount = new Q2_SavingsAccount("002", "Burhan", 5000, 3000);
        System.out.println("\nAccount Holder: " + savingsAccount.getAccountHolderName());
        System.out.println("Initial Balance " + savingsAccount.getBalance());

        // Deposit and Withdraw from Savings Account
        savingsAccount.deposit(3000);
        savingsAccount.withdraw(4500); // Exceeds limit
        savingsAccount.withdraw(2000); // Within limit

        System.out.println("Author " + "Ikram Niazi " + "Roll no: 085");
    }
}
