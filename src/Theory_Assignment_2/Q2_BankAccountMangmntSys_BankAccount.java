package Theory_Assignment_2;

//public class Q2_BankAccountMangmntSys_BankAccount {
//}

public class Q2_BankAccountMangmntSys_BankAccount {
private double balance;  // Changed from String to double
private String accountHolderName;


public Q2_BankAccountMangmntSys_BankAccount(double balance, String accountHolderName) {
    this.balance = balance;
    this.accountHolderName = accountHolderName;
}

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void deposit(double amount) {
    if (amount > 0) {
        balance += amount;  // Fixed arithmetic operation
        System.out.println("Amount Deposited: " + amount);
    } else {
        System.out.println("Deposit amount must be positive.");
    }
}


public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
        balance -= amount;
        System.out.println("Amount Withdrawn: " + amount);
    } else if (amount <= 0) {
        System.out.println("Withdraw amount must be positive.");
    } else {
        System.out.println("Insufficient balance.");
    }
}

// Method to Display Balance
public void displayBalance() {
    System.out.println("Account Holder: " + accountHolderName);
    System.out.println("Current Balance: " + balance);
}
}
