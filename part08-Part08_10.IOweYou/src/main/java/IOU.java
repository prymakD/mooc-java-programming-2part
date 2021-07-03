
import java.util.HashMap;

public class IOU {
    private HashMap<String,Double> iou;
    
    public IOU() {
        this.iou = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        this.iou.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        for (String amount : this.iou.keySet()) {
            if (!amount.contains(toWhom)) {
                continue;
            }
            return this.iou.getOrDefault(amount, 0.);
        }
        return 0;
    }
}
