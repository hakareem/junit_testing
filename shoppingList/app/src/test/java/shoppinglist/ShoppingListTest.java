package shoppinglist;

import org.junit.Test;
import static org.junit.Assert.*;

public class ShoppingListTest {
    @Test public void appHasAGreeting() {
        ShoppingList test = new ShoppingList();
        // to start with list should be empty
        assertTrue(test.getItems().isEmpty());
    }

    @Test public void returnsItemsAdded() {
        ShoppingList test = new ShoppingList();

        test.addItem(new ShoppingItem("cake", 5.30));
        test.addItem(new ShoppingItem("drink", 2.20));
        test.addItem(new ShoppingItem("mac", 4.40));

        assertEquals("cake", test.getItems().get(0).getName());
        assertEquals("drink", test.getItems().get(1).getName());
        assertEquals("mac", test.getItems().get(2).getName());
        assertEquals(Double.valueOf(5.30), test.getItems().get(0).getPrice());
        assertEquals(Double.valueOf(2.20), test.getItems().get(1).getPrice());
        assertEquals(Double.valueOf(4.40), test.getItems().get(2).getPrice());
    }
}
