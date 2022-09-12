package todo;

import java.util.ArrayList;

public class Todo {
    // storing todos
    ArrayList<String> list = new ArrayList<>(); 

    // addTask method
    public void addTask(String task){
        list.add(task);
    }

    // get tasks method
    public ArrayList<String> get(){
        return list;
    }
}
