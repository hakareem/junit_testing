
package shoppinglist;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShoppingItemTest {
 @Test public void testShoppingItem() {
  ShoppingItem item = new ShoppingItem("Chicken", 10.50);

  assertEquals("Chicken", item.getName());
  assertEquals(Double.valueOf(10.50), item.getPrice());
 }
}
