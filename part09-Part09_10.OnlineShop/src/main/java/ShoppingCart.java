
import java.util.HashMap;
import java.util.Map;


public class ShoppingCart {
    private Map<String,Item> cartOfItems;
    
    public ShoppingCart() {
        this.cartOfItems = new HashMap<>();
    }
    
    public void add(String product, int price) {
        if (this.cartOfItems.containsKey(product)) {
            this.cartOfItems.get(product).increaseQuantity();
        } else 
            this.cartOfItems.put(product, new Item(product, 1, price));
    }
    
    public int price() {
        int totalPrice = 0;
        for (Item item : this.cartOfItems.values()) {
            totalPrice += item.price();
        }
        
        return totalPrice;
    }
    
    public void print() {
        for (Item item : this.cartOfItems.values()) {
            System.out.println(item.getProduct() + ": " + item.getQuantity());
        }
    }
}
