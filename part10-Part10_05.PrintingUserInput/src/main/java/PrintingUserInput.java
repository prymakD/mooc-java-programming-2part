
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            strings.add(input);
        }
        String combined = strings.stream()
                .reduce("", (s, word) -> s + word + "\n");
        System.out.println(combined);
    }
}
