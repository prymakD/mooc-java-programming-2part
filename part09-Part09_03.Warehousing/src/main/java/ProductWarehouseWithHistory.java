
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory changehistory;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.changehistory = new ChangeHistory();
        super.addToWarehouse(initialBalance);
        this.changehistory.add(initialBalance);
    }
    
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.changehistory.add(getBalance());
    }
    
    public double takeFromWarehouse(double amount) {
        double amountTaken = super.takeFromWarehouse(amount);
        this.changehistory.add(getBalance());
        return amountTaken;
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + getName()
                + "\nHistory: " + changehistory.toString()
                + "\nLargest amount of product: " + changehistory.maxValue() 
                + "\nSmallest amount of product: " + changehistory.minValue()
                + "\nAverage: " + changehistory.average());
    }
    
    public String history() {
        return this.changehistory.toString();
    }
}
