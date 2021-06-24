
public class Container {

    private int container;

    public Container() {
        container = 0;
    }

    public int contains() {
        return container;
    }

    public void add(int amount) {
        if (amount >= 0) {
            container += amount;
        }
        if (container > 100) {
            container = 100;
        }
    }

    public void remove(int amount) {
        if (amount >= 0) {
            container -= amount;
        }
        if (container < 0) {
            container = 0;
        }
    }

    public String toString() {
        return container + "/" + "100";
    }
}
