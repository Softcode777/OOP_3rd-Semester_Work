package Theory_Assignment_3;

public class Q1_MobileWalletPayment extends Q1_Payment {

    public Q1_MobileWalletPayment(double amount, String transactionId) {
        super(amount, transactionId);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing mobile wallet payment of $" + amount + " with transaction ID: " + transactionId);
    }

    @Override
    public void cancelPayment() {
        System.out.println("Cancelling mobile wallet payment with transaction ID: " + transactionId);
    }
}
