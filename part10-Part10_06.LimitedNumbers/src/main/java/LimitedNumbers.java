
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> digits = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input < 0) {
                break;
            }
            digits.add(input);
        }
        digits.stream()
                .filter(predicate -> predicate >= 1 &&
                        predicate <= 5)
                .forEach(s -> System.out.println(s));
    }
}
