
import java.util.ArrayList;

public class Box implements Packable {

    private double maxCapacity;
    private ArrayList<Packable> box;

    public Box(double maximumCapacity) {
        this.maxCapacity = maximumCapacity;
        this.box = new ArrayList<>();
    }

    public void add(Packable packable) {
        if (packable.weight() + weight() <= this.maxCapacity) {
            
            this.box.add(packable);
        }
    }

    public String toString() {
        return "Box: " + this.box.size() + " items, total weight " + weight() + " kg";
    }

    public double weight() {
        double sum = 0;
        for (Packable packable : this.box) {
            sum += packable.weight();
        }
        return sum;
    }
}
