
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while (true) {   
            System.out.print("Input the name of the book, empty stops: ");
            String bookName = scanner.nextLine();
            
            if (bookName.equals("")) {
                System.out.println(books.size() == 1 ? "1 book in total." : books.size() + " books in total.");
                break;
            }
            
            System.out.print("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());
            
            
            books.add(new Book(bookName, age));
        }
        
        System.out.println("\nBooks:");
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRec)
                .thenComparing(Book::getName);
        
        books.stream()
                .sorted(comparator)
                .forEach(book -> System.out.println(book));
    }

}
