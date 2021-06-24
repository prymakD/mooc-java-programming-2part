import java.util.ArrayList;
import java.util.Scanner;
 
public class LiquidContainers {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
 
        System.out.println("First: " + first + "/" + 100);
        System.out.println("Second: " + second + "/" + 100);
        
        while (true) {
            System.out.print("> ");
 
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
 
            String parts[] = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
 
            if (command.equals("add") && amount >= 0) {
                first += amount;
                if (first > 100) {
                    first = 100;
                }
                System.out.println("First: " + first + "/" + 100);
                System.out.println("Second: " + second + "/" + 100);
            } else if (command.equals("move") && amount != 0) {
                if ((first - amount) >= 0) {
                    first -= amount;
                    second += amount;
                    if (second > 100) second = 100;
                } else if ((first - amount) <= 0 && amount >= 0) {
                    second += first;
                    first = 0;
                    if (second > 100) second = 100;
                }
                System.out.println("First: " + first + "/" + 100);
                System.out.println("Second: " + second + "/" + 100);
            } else if (command.equals("remove") && amount >= 0) {
                second -= amount;
                if (second < 0) {
                    second = 0;
                }
                System.out.println("First: " + first + "/" + 100);
                System.out.println("Second: " + second + "/" + 100);
            }
        }
    }
}