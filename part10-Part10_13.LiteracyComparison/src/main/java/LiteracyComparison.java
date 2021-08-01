
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        readBooks("literacy.csv").stream().forEach(s -> System.out.println(s));
    }
    
    public static List<String> readBooks(String file) {
        List<String> literacy = new ArrayList<>();
        try {
            Files.lines(Paths.get(file))
                    .map(row -> row.split(","))
                    .sorted((x, y) -> { return Double.valueOf(x[5]) < Double.valueOf(y[5]) ? -1 : 1;})
                    .forEach(row -> literacy.add(row[3] + " (" + row[4] + "), " + row[2].replaceAll("[^a-zA-Z]", "") + ", " + row[5]));
            return literacy;
                    
        } catch (Exception e) {
            System.out.println("Error");
        }
        return null;
    }
}
