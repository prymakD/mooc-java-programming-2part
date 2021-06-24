
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private Container container1;
    private Container container2;

    public UserInterface(Container first, Container second, Scanner scan) {
        container1 = first;
        container2 = second;
        scanner = scan;
    }

    public void start() {
        System.out.println("First: " + container1);
        System.out.println("Second: " + container2);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String parts[] = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add") && amount >= 0) {
                container1.add(amount);
                System.out.println("First: " + container1);
                System.out.println("Second: " + container2);
            } else if (command.equals("move") && amount >= 0) {
                if ((container1.contains() - amount) >= 0) {
                    container1.remove(amount);
                    container2.add(amount);
                } else if ((container1.contains() - amount) <= 0 && amount >= 0) {
                    container2.add(container1.contains());
                    container1.remove(container1.contains());
                }
                System.out.println("First: " + container1);
                System.out.println("Second: " + container2);
            } else if (command.equals("remove") && amount >= 0) {
                container2.remove(amount);
                System.out.println("First: " + container1);
                System.out.println("Second: " + container2);
            }
        }
    }

}
