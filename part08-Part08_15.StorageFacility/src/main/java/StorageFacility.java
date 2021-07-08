
import java.util.ArrayList;
import java.util.HashMap;


public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;
    
    public StorageFacility() {
        this.storage = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        return this.storage.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item) {
        if (this.storage.containsKey(storageUnit)){
            this.storage.get(storageUnit).remove(item);
        }
        if (this.storage.get(storageUnit).isEmpty()) {
            this.storage.remove(storageUnit);
        } 
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> storage = new ArrayList<String>(this.storage.keySet());
        return storage;
    }
}
