import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create some dummy data
        List<Date> availableDates = Arrays.asList(new Date(), new Date(System.currentTimeMillis() + 86400000)); // Today and tomorrow
        Service service1 = new Service("SVC01", "Luxury Hotel", "Paris", availableDates, 500.0);
        Service service2 = new Service("SVC02", "Economy Hotel", "Berlin", availableDates, 100.0);
        List<Service> services = Arrays.asList(service1, service2);

        ServiceProvider provider = new ServiceProvider("PROV01", "Global Hotels", services);

        // Customer actions
        Customer customer = new Customer("CUST01", "John Doe", "john@example.com", "123456789");
        List<Service> availableServices = customer.searchServices("Paris", new Date(), "Hotel");
        Booking booking = customer.makeBooking("SVC01");

        // Process payment for the booking
        Payment payment = new Payment(booking.bookingID, 500.0);
        payment.processPayment();

        // Send confirmation email
        booking.sendConfirmationEmail();
    }
}
