
import java.util.ArrayList;


public class Herd implements Movable{
    private ArrayList<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable) {
        if (!this.herd.contains(movable)) {
            this.herd.add(movable);
        }
    }
    
    public String toString() {
        String result = "";
        for (Movable i : this.herd)  {
            result += i + "\n";
        } 
        return result;
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Movable i : this.herd) {
            i.move(dx, dy);
        }
    }
    
}
