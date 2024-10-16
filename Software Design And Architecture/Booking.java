import java.util.Date;

public class Booking {
    private String bookingID;
    private String customerID;
    private String serviceID;
    private Date bookingDate;
    private String status;

    public Booking(String serviceID, String customerID) {
        this.bookingID = generateBookingID();
        this.customerID = customerID;
        this.serviceID = serviceID;
        this.bookingDate = new Date();
        this.status = "Pending";
    }

    private String generateBookingID() {
        // Generate a unique booking ID (simple implementation)
        return "BKG-" + System.currentTimeMillis();
    }

    public void confirmBooking() {
        // Confirm the booking and update status
        this.status = "Confirmed";
        System.out.println("Booking confirmed with ID: " + this.bookingID);
    }

    public void sendConfirmationEmail() {
        // Simulate sending a confirmation email
        System.out.println("Confirmation email sent for booking: " + this.bookingID);
    }
}
