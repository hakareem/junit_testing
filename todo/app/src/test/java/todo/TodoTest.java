package todo;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class TodoTest {
        @Test public void addTask() {
        Todo test = new Todo();
        String firstTodo = "Run";
        String secondTodo = "Walk";

        // Expected list - [Run, Walk]
        ArrayList<String> result = new ArrayList<>();
        result.add(firstTodo);
        result.add(secondTodo);

        // Actual List - [Run, Walk]
        test.addTask(firstTodo);
        test.addTask(secondTodo);

        // compare  expected vs actual
        assertEquals(result, test.list);
    }

        @Test public void getTodo() {
        Todo test = new Todo();
        test.addTask("Who");
        test.addTask("When");

        // list for Testing
        ArrayList<String> result = new ArrayList<>();
        result.add("Who");
        result.add("When");

        assertEquals(result, test.get());
    }

}
