

public class TripleTacoBox implements TacoBox{
    private int box;

    public TripleTacoBox() {
        this.box = 3;
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
