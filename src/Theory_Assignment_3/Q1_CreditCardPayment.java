package Theory_Assignment_3;

public class Q1_CreditCardPayment extends Q1_Payment implements Q1_Refundable {

    public Q1_CreditCardPayment(double amount, String transactionId) {
        super(amount, transactionId);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment of $" + amount + " with transaction ID: " + transactionId);
    }

    @Override
    public void cancelPayment() {
        System.out.println("Cancelling credit card payment with transaction ID: " + transactionId);
    }

    @Override
    public void initiateRefund() {
        System.out.println("Initiating refund for credit card payment.");
    }

    @Override
    public boolean isRefundEligible() {
        System.out.println("Checking refund eligibility for credit card payment.");
        return true;
    }
}

