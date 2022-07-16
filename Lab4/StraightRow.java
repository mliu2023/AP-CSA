/**
* Class to create a row that scores straights.
* @author Max Liu
* @version 1.0
*/
public class StraightRow extends FixedAmountRow{

  private int numInARow;

  /**
  * Constructor for a straight row.
  * @param name The name of the row.
  * @param numInARow the number of consecutive values needed to be scored.
  */
  public StraightRow(String name, int numInARow){
    super(name, (numInARow-1)*10);
    this.numInARow = numInARow;
  }

  /**
  * This method deteremines whether the dice are valid to be scored.
  * @param dice The dice that are checked.
  * @return true if valid, false otherwise.
  */
  public boolean isValid(Dice dice){
    int[] arr = new int[6];
    int counter = 0;
    for(int i = 0; i < 5; i++){
      arr[dice.getDie(i).getValue()-1] += 1;
    }
    for(int j = 0; j < 6; j++){
      if(arr[j] > 0){
        counter++;
      }
      else{
        counter = 0;
      }
      if(counter == numInARow){
        return true;
      }
    }
    return false;
  }
}
