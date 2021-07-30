
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<>();
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                double average = numbers.stream()
                        .mapToInt(s -> Integer.valueOf(s))
                        .average()
                        .getAsDouble();
                System.out.println("average of the numbers: " + average);
                break;
            }
            
            numbers.add(input);
        }
    }
}
