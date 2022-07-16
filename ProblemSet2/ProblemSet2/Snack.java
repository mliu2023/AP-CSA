/**
* Class to create a snack.
* @author Max Liu
* @version 1.0
*/
public class Snack{
  private String name;
  private int price;
  /**
  * Constructor for a snack.
  * @param name The name of the snack.
  * @param price The price of the snack in cents.
  */
  public Snack(String name, int price){
    this.name = name;
    this.price = price;
  }
  public String getName(){return name;}
  public int getPrice(){return price;}
  /**
  * This method allows a snack to be printed.
  * @return The name, along with the price in cents.
  */
  public String toString(){
    return name + "(" + price + " cents)";
  }
}
