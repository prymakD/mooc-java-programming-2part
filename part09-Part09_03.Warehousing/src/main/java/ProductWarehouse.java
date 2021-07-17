
public class ProductWarehouse extends Warehouse{
    private String name;

    public ProductWarehouse(String name, double capacity) {
        super(capacity);
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public String toString() {
        return this.name + ": " + super.toString();
    }
}
