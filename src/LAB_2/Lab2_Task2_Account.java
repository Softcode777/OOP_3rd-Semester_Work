package LAB_2;

// Define the Account class
class Account {
    // Data member
     double balance;

//    (default balance)
    Account() {
        this.balance = 0.0; // Default value
    }
    Account(double balance) {
        this.balance = balance;
    }
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

