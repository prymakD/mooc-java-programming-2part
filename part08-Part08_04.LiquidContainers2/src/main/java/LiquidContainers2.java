
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container cont1 = new Container();
        Container cont2 = new Container();
        UserInterface user = new UserInterface(cont1, cont2, scan);
        user.start();
    }

}
