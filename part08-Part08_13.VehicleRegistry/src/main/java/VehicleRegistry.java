
import java.util.HashMap;
import java.util.HashSet;


public class VehicleRegistry {
    private HashMap<LicensePlate, String> vehicleRegistry;
    
    public VehicleRegistry() {
        this.vehicleRegistry = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.vehicleRegistry.containsKey(licensePlate)) {
           return false;
        }
        this.vehicleRegistry.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate) {
        return vehicleRegistry.getOrDefault(licensePlate, null);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (!(this.vehicleRegistry.containsKey(licensePlate))) {
            return false;
        }
        
        this.vehicleRegistry.remove(licensePlate);
        return true;
    }
    
    public void printLicensePlates() {
        for (LicensePlate licensePlate : this.vehicleRegistry.keySet()) {
            System.out.println(licensePlate);
        }
    }
    
    public void printOwners() {
        for (String owner : new HashSet<>(vehicleRegistry.values())) {
            System.out.println(owner);
        }
    }
}
