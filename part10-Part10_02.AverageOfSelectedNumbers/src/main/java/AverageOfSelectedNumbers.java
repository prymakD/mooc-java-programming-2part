
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> num = new ArrayList<>();

        loop:
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
                String whatToPrint = scanner.nextLine();
                if (whatToPrint.equals("p")) {
                    double averageOfPositive = num.stream()
                            .mapToInt(s -> Integer.valueOf(s))
                            .filter(number -> number > 0)
                            .average()
                            .getAsDouble();
                    System.out.println("Average of the positive numbers: " + averageOfPositive);
                    break loop;
                } else if (whatToPrint.equals("n")) {
                    double averageOfNegative = num.stream()
                            .mapToInt(s -> Integer.valueOf(s))
                            .filter(number -> number < 0)
                            .average()
                            .getAsDouble();
                    System.out.println("Average of the negative numbers: " + averageOfNegative);
                    break loop;
                }
            }
            num.add(input);
        }

    }
}
