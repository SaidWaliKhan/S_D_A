import java.util.Date;
import java.util.List;

public class Service {
    private String serviceID;
    private String serviceName;
    private String location;
    private List<Date> availableDates;
    private double price;

    public Service(String serviceID, String serviceName, String location, List<Date> availableDates, double price) {
        this.serviceID = serviceID;
        this.serviceName = serviceName;
        this.location = location;
        this.availableDates = availableDates;
        this.price = price;
    }

    public boolean getAvailability(Date date) {
        // Check if the service is available on the given date
        return availableDates.contains(date);
    }

    public String getDetails() {
        return serviceName + " in " + location + " for $" + price;
    }

    public static List<Service> searchAvailableServices(String location, Date date, String serviceType) {
        // Implement logic to search and return a list of available services
        return List.of(); // Placeholder
    }
}
