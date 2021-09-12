
package mooc.logic;
import mooc.ui.UserInterface;

public class ApplicationLogic {
    
    private UserInterface some;
    
    public ApplicationLogic(UserInterface ui) {
        some = ui;
    }
    
    public void execute(int times) {
        int i = 0;
        while(i++ < times) {
            System.out.println("Application logic is working");
           some.update();
        }
    }
}
