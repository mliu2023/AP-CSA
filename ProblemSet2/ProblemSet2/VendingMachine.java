import java.util.ArrayList;
/**
* Class to create a vending machine.
* @author Max Liu
* @version 1.0
*/
public class VendingMachine{
  private Snack item;
  private int availableStock;
  private int depositedAmount;
  private int change;
  private static int totalSales = 0;
  /**
  * Constructor for a vending machine.
  * @param item The snack that is sold in the vending machine.
  * @param stock The amount of the snack.
  */
  public VendingMachine(Snack item, int stock){
    this.item = item;
    availableStock = stock;
    depositedAmount = 0;
    change = 0;
  }
  public int getStock(){return availableStock;}
  public void addStock(int n){availableStock += n;}
  public void addMoney(ArrayList<Money> coins){
    for(int i = 0; i < coins.size(); i++){
      depositedAmount += coins.get(i).getValue();
    }
    change = depositedAmount;
  }
  /**
  * This method sells a snack if there is enough money deposited.
  * @return A snack if there is enough money, or null if there is not enough.
  */
  public Snack makeSale(){
    if(depositedAmount >= item.getPrice() && availableStock > 0){
      availableStock--;
      change = depositedAmount - item.getPrice();
      totalSales += item.getPrice();
      return item;
    }
    else{
      return null;
    }
  }
  /**
  * This method returns change for the deposited amount in the vending machine.
  * @return The coins that add up to the amount of change.
  */
  public ArrayList<Money> getChange(){
    ArrayList<Money> coins = Money.makeCoins(change);
    change = 0;
    return coins;
  }
  /**
  * This method gets the total sales from all vending machines.
  * @return The total amount sold by all vending machines.
  */
  public static int getTotalSales(){
    return totalSales;
  }
  /**
  * This method allows a vending machine to be printed.
  * @return The snack, amount of that snack, and the deposited amount.
  */
  public String toString(){
    return availableStock + "--" + item + "--" + depositedAmount + " cents";
  }
}
