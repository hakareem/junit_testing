/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package pricedisplay;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void appHasAGreeting() {
        App test = new App();
        assertNotNull("app should have a greeting", test.getGreeting());
    }

    @Test public void displayItemWIthPrice(){
        App test = new App();
        assertEquals("App should return item with the price", "The price for item: Cake is £5", test.getPriceLabel("Cake", 5));
    }
}
