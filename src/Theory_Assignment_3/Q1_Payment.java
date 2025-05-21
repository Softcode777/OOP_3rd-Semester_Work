package Theory_Assignment_3;

public abstract class Q1_Payment {
    protected double amount;
    protected String transactionId;

    public Q1_Payment(double amount, String transactionId) {
        this.amount = amount;
        this.transactionId = transactionId;
    }

    public void showTransaction() {
        System.out.println("Transaction ID: " + transactionId + ", Amount: $" + amount);
    }

    public abstract void processPayment();
    public abstract void cancelPayment();
}
