package shoppinglist;

import java.util.ArrayList;

public class ShoppingList {
    private ArrayList<ShoppingItem> item_list = new ArrayList<ShoppingItem>();

    public void addItem(ShoppingItem item) {
        item_list.add(item);
    }

    public ArrayList<ShoppingItem> getItems() {
        return item_list;
    }

    public static void main(String[] args) {}

}
