
import java.util.HashMap;
import java.util.Map;

public class MainProgram {

    public static void main(String[] args) {
        Map<String, String> names = new HashMap<>();
        names.put("1", "first");
        names.put("2", "second");
        names.put("3", "second");
        System.out.println(returnSize(names));
    }

    public static int returnSize(Map<String, String> map) {
        return map.size();
    }
    // Implement here a method returnSize, which takes a Map-object as a parameter 
    // and returns the size of the map object
}
