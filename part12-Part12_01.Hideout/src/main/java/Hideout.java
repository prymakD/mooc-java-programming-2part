
import java.util.Objects;


public class Hideout<T> {
    private T hidden;
    
    public void putIntoHideout(T toHide) {
        this.hidden = toHide;
    }
    
    public T takeFromHideout() {
        if (Objects.isNull(this.hidden)) return null;
        
        T temp = this.hidden;
        this.hidden = null;
        
        return temp;
        
    }
    
    public boolean isInHideout() {
        if (Objects.isNull(hidden)) {
            return false;
        }
        
        return true;
    }
}
