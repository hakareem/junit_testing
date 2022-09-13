package shoppinglist;

public class ShoppingItem {
  private String name;
  private Double price;

  // constructor 
  public ShoppingItem(String name, Double price){
    this.name = name;
    this.price = price;
  }

  public String getName(){
    return this.name;
  }

  public Double getPrice(){
    return this.price;
  }
}