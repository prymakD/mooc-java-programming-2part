
import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public boolean isHistoryEmpty() {
        return this.history.isEmpty();
    }

    public double maxValue() {
        if (isHistoryEmpty()) {
            return 0;
        }
        return Collections.max(this.history);
    }

    public double minValue() {
        if (isHistoryEmpty()) {
            return 0;
        }
        return Collections.min(history);
    }

    public double average() {
        if (isHistoryEmpty()) {
            return 0;
        }

        double sum = 0.0;
        int size = this.history.size();
        for (Double num : this.history) {
            sum += num;
        }
        return sum / size;
    }

    public String toString() {
        return this.history.toString();
    }
}
