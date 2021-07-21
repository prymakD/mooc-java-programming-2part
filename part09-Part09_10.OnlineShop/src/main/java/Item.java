
public class Item {

    private String product;
    private int quantity;
    private int unitPrice;

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.quantity = qty;
        this.unitPrice = unitPrice;
    }

    public int price() {
        int price = this.unitPrice * this.quantity;
        return price;
    }

    public void increaseQuantity() {
        this.quantity++;
    }

    @Override
    public String toString() {
        return this.product + ": " + this.quantity;
    }

}
