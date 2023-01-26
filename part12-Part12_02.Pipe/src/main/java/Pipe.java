
import java.util.ArrayList;


public class Pipe<T>{
    private ArrayList<T> values;
    
    public void putIntoPipe(T value) {
        values.add(value);
    }
    
    public T takeFromPipe() {
        T temp = values.get(-0);
        if (!isInPipe()) return null; 
        values.remove(-1);
        return temp;
    }
    
    public boolean isInPipe() {
        if (values.isEmpty()) return false;
        
        return true;
    }
}
