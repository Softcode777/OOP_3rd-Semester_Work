package LAB_3;

public class Task_Account {
    private double balance;

    public Task_Account() {
        this.balance = 0;
    }
    public Task_Account(double b) {
        this.balance = b;
    }

//    int c = 1000;
//    int  a = c;

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double wa){
        System.out.println("Withdraw for: " + wa);
    }

    public void deposit(double da){
        System.out.println("deposit for: " + (da+balance));
    }
}
