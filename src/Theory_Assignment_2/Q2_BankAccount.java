package Theory_Assignment_2;

public class Q2_BankAccount {
        private String accountNumber;
        private double balance;
        private String accountHolderName;

        public Q2_BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = initialBalance;
        }
        //  Method for Deposit
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount + " | New Balance: " + balance);
            } else {
                System.out.println("Invalid deposit amount!");
            }
        }
        // Method for Withdraw
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
            } else {
                System.out.println("Invalid withdrawal amount or insufficient balance!");
            }
        }
        //  Method to Get Balance
        public double getBalance() {
            return balance;
        }
//        Method to get AccountHolderName
        public String getAccountHolderName() {
            return accountHolderName;
        }
    }

