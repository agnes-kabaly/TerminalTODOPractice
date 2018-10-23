import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> myTodoList = new ArrayList<>();

    public void addTodoItem(String todo) {
        myTodoList.add(todo);
    }

    public void printTodoList() {
        System.out.println("You have " + myTodoList.size() + " todo items in your TODO list");
        for (int i = 0; i < myTodoList.size(); i++) {
            System.out.println((i + 1) + ". " + myTodoList.get(i));
        }
    }

    public void modifyTodoItem(int index, String newTodo) {
        String modifiedTodo = myTodoList.get(index);
        myTodoList.set(index, newTodo);
        System.out.println("TODO item " + (index + 1) + ". " + modifiedTodo + " has been modified.");
    }

    public void removeTodoItem(int position) {
        String removedItem = myTodoList.get(position);
        myTodoList.remove(position);
        System.out.println("Todo item: " + removedItem + " is removed from your TODO list");
    }

    public String findItem(String searchItem) {
        int index = myTodoList.indexOf(searchItem);
        if (index >= 0) {
            return myTodoList.get(index);
        }
        return null;
    }

}
