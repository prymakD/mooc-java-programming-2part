
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoList todoLists;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoLists = todoList;
        this.scanner = scanner;
    }

    public void start() {
        loop:
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            switch (command) {
                case "stop":
                    break loop;
                case "add":
                    System.out.print("To add: ");
                    todoLists.add(scanner.nextLine());
                    break;
                case "list":
                    todoLists.print();
                    break;
                case "remove":
                    System.out.print("Which one is removed? ");
                    todoLists.remove(Integer.valueOf(scanner.nextLine()));
            }

        }
    }
}
