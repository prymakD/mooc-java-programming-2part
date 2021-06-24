import java.util.ArrayList;
 
 
public class TodoList {
    private ArrayList<String> todoList;
    
    public TodoList() {
        this.todoList = new ArrayList<>();
    }
    
    public void add(String task) {
        todoList.add(task);
    }
    
    public void print(){
        for(String todo : todoList){
            System.out.println((todoList.indexOf(todo) + 1) + ": " + todo);
        }
    }
    
    public void remove(int number) {
        todoList.remove(todoList.get(number - 1));
    }
}