import java.util.List;
import java.util.Date;

public class Customer {
    private String customerID;
    private String name;
    private String email;
    private String phone;

    public Customer(String customerID, String name, String email, String phone) {
        this.customerID = customerID;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public List<Service> searchServices(String location, Date date, String serviceType) {
        // Implement service search logic here
        return Service.searchAvailableServices(location, date, serviceType);
    }

    public Booking makeBooking(String serviceID) {
        // Create a new booking and confirm it
        Booking booking = new Booking(serviceID, this.customerID);
        booking.confirmBooking();
        return booking;
    }

    public void cancelBooking(String bookingID) {
        // Implement cancel booking logic
        System.out.println("Booking " + bookingID + " has been canceled.");
    }
}
