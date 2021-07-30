
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }
    
    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> {
                    if (number > 0) {
                    return true;
                    }
                    return false;
                }).collect(Collectors.toList());
    }

}
