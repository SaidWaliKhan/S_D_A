public class Payment {
    private String paymentID;
    private String bookingID;
    private double amount;
    private String paymentStatus;

    public Payment(String bookingID, double amount) {
        this.paymentID = generatePaymentID();
        this.bookingID = bookingID;
        this.amount = amount;
        this.paymentStatus = "Pending";
    }

    private String generatePaymentID() {
        // Generate a unique payment ID
        return "PAY-" + System.currentTimeMillis();
    }

    public boolean processPayment() {
        // Simulate payment processing
        this.paymentStatus = "Completed";
        System.out.println("Payment processed for booking ID: " + this.bookingID);
        return true;
    }

    public void refundPayment() {
        // Process a refund
        this.paymentStatus = "Refunded";
        System.out.println("Payment refunded for booking ID: " + this.bookingID);
    }
}
