
public class CustomTacoBox implements TacoBox{
    private int box;

    public CustomTacoBox(int box) {
        this.box = box;
    }
    
    @Override
    public int tacosRemaining() {
        return this.box;
    }

    @Override
    public void eat() {
        if (this.box != 0)
            this.box--;
    }
    
}
