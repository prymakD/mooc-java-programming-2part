
import java.util.ArrayList;

public class OneItemBox extends Box{
    private int capacityOfOne;
    private ArrayList<Item> items;
    
    public OneItemBox() {
        this.capacityOfOne = 1;
        this.items = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
        if (this.items.isEmpty()) {
            this.items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        boolean stored = false;
        for (Item element : this.items) {
            if (element.getName().equals(item.getName())) {
                stored = true;
            }
        }
        return stored;
    }
    
}
