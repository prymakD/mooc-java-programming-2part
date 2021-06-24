
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Here you can try out the combined functionality of your classes
        TodoList list = new TodoList();
        Scanner scan = new Scanner(System.in);
        UserInterface smth = new UserInterface(list, scan);
        smth.start();

    }
}
