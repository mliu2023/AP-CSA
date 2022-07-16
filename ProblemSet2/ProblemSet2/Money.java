import java.util.ArrayList;
/**
* Class to represent money with different coins.
* @author Max Liu
* @version 1.0
*/
public class Money{
  private int value;
  public static final int[] coinValues = {1, 5, 10, 25};
  public static final String[] coinNames = {"penny", "nickel", "dime", "quarter"};
  /**
  * Constructor that takes in a value.
  * @param value The value of the coin.
  */
  public Money(int value){
    this.value = value;
  }
  /**
  * This method gets the value of the coin.
  * @return The value of the coin.
  */
  public int getValue(){return value;}
  /**
  * This method gets the name of a coin.
  * @return The name of the coin.
  */
  public String getName(){
    for(int i = 0; i < 4; i++){
      if(coinValues[i] == value){
        return coinNames[i];
      }
    }
    return "invalid value";
  }
  /**
  * This method returns the smallest set of coins needed to make up a certain value.
  * @return the set of coins.
  */
  public static ArrayList<Money> makeCoins(int n){
    ArrayList<Money> coins = new ArrayList<Money>();
    int quarters = 0;
    int dimes = 0;
    int nickels = 0;
    int pennies = 0;
    int valueNeeded = n;
    while(25 <= valueNeeded){
      quarters++;
      valueNeeded-=25;
      coins.add(new Money(25));
    }
    while(10 <= valueNeeded){
      dimes++;
      valueNeeded-=10;
      coins.add(new Money(10));
    }
    while(5 <= valueNeeded){
      nickels++;
      valueNeeded-=5;
      coins.add(new Money(5));
    }
    while(1 <= valueNeeded){
      pennies++;
      valueNeeded--;
      coins.add(new Money(1));
    }
    return coins;
  }
  /**
  * This method finds the total value of an arraylist of coins.
  * @param coins The coins whose values are summed up.
  */
  public static int totalAmount(ArrayList<Money> coins){
    int total = 0;
    for(int i = 0; i < coins.size(); i++){
      total += coins.get(i).getValue();
    }
    return total;
  }
  /**
  * This method allows money to be printed.
  * @return The value of the money.
  */
  public String toString(){
    String returnString = "";
    returnString += value;
    return returnString;
  }
}
