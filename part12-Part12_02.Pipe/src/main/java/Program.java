
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pipe<String> pipe = new Pipe<>();
pipe.putIntoPipe("dibi");
pipe.putIntoPipe("dab");
pipe.putIntoPipe("dab");
pipe.putIntoPipe("daa");
while(pipe.isInPipe()) {
    System.out.println(pipe.takeFromPipe());
}

    }
}
