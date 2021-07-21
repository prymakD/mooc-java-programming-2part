
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Warehouse {
    private Map<String,Integer> listOfPrices;
    private Map<String,Integer> listOFProducts;

    public Warehouse() {
        this.listOfPrices = new HashMap<>();
        this.listOFProducts = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.listOFProducts.put(product, stock);
        this.listOfPrices.put(product, price);
    }
    
    public int price(String product) {
        if (this.listOfPrices.containsKey(product)) {
            return this.listOfPrices.get(product);
        }
        
        return -99;
    }
    
    public int stock(String product) {
        if (this.listOFProducts.containsKey(product)) {
            return this.listOFProducts.get(product);
        }
        
        return 0;
    }
    
    public boolean take(String product) {
        boolean isProductHere = this.listOFProducts.containsKey(product);
        if (isProductHere && this.listOFProducts.get(product) > 0) {
            int stock = this.listOFProducts.get(product);
            this.listOFProducts.put(product,  stock - 1);
            return true;
        }
        
        return false;
    }
    
    public Set<String> products() {
        Set<String> products = new HashSet<>();
        for (String name : this.listOFProducts.keySet()) {
            products.add(name);
        }
        return products;
    }
}
