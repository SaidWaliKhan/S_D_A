import java.util.List;

public class ServiceProvider {
    private String providerID;
    private String providerName;
    private List<Service> services;

    public ServiceProvider(String providerID, String providerName, List<Service> services) {
        this.providerID = providerID;
        this.providerName = providerName;
        this.services = services;
    }

    public void updateAvailability(String serviceID, boolean isAvailable) {
        // Update service availability logic here
        System.out.println("Service " + serviceID + " availability updated.");
    }

    public List<Service> getServices() {
        return services;
    }
}
