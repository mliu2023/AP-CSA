import java.util.ArrayList;
/**
* Class to create a shopper.
* @author Max Liu
* @version 1.0
*/
public class Shopper{
  private String name;
  private ArrayList<Money> funds;
  private ArrayList<Snack> snacks;
  /**
  * Constructor for a shopper.
  * @param name The name of the shopper.
  */
  public Shopper(String name){
    this.name = name;
    funds = new ArrayList<Money>();
    snacks = new ArrayList<Snack>();
  }
  public String getName(){return name;}
  public ArrayList<Money> getFunds(){return funds;}
  public ArrayList<Snack> getSnacks(){return snacks;}
  /**
  * This method gets the total value of the money the shopper has.
  * @return The total value.
  */
  public int getTotalValue(){
    return Money.totalAmount(funds);
  }
  /**
  * This method adds a money object to funds.
  * @param fund The money that is added to funds.
  */
  public void addFunds(Money fund){
    funds.add(fund);
  }
  /**
  * This method adds an arraylist of money to funds.
  * @param fund1 The arraylist of money that is added to funds.
  */
  public void addFunds(ArrayList<Money> fund1){
    for(int i = 0; i < fund1.size(); i++){
      funds.add(fund1.get(i));
    }
  }
  /**
  * This method prepares coins to be put into a vending machine.
  * @param chips The snack that will be paid for by these coins.
  * @return The coins that pay for the snack.
  */
  public static ArrayList<Money> prepareCoins(Snack chips){
    return Money.makeCoins(chips.getPrice());
  }
  /**
  * This method takes in a snack to be bought from a vending machine.
  * @param chips The snack to be bought from the vending machine.
  */
  public void buySnack(Snack chips){
    snacks.add(chips);
  }
  /**
  * This method removes money from a shopper.
  * @param amount The amount of money that is removed.
  */
  public void removeFunds(int amount){
    int currAmount = getTotalValue();
    int newAmount = currAmount - amount;
    funds = Money.makeCoins(newAmount);
  }
  /**
  * This method allows a shopper to be printed.
  * @return the name, funds, and snacks of the shopper.
  */
  public String toString(){
    return name + " " + funds + " " + snacks;
  }
}
