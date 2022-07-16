/**
* Class to create a row that scores a Yahtzee.
* @author Max Liu
* @version 1.0
*/
public class YahtzeeRow extends FixedAmountRow{

  /**
  * Constructor for a Yahtzee row.
  * @param name The name of the row.
  */
  public YahtzeeRow(String name){
    super(name, 50);
  }

  /**
  * This method deteremines whether the dice are valid to be scored.
  * @param dice The dice that are checked.
  * @return true if valid, false otherwise.
  */
  public boolean isValid(Dice dice){
    int val = dice.getDie(0).getValue();
    for(int i = 1; i < 5; i++){
      if(dice.getDie(i).getValue() != val){
        return false;
      }
    }
    return true;
  }
}
