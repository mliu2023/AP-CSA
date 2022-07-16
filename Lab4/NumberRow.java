/**
* Class to represent a ScoreRow that counts one value for a score.
* @author Max Liu
* @version 1.0
*/
public class NumberRow extends ScoreRow{

  private int value;

  /**
  * Constructor for a NumberRow.
  * @param name The name of the row.
  * @param value The numbers that are equal to value will be summed to get a score.
  */
  public NumberRow(String name, int value){
    super(name);
    this.value = value;
  }

  /**
  * This method calculates the sum of the values of dice that are equal to value.
  * @param dice The dice that are scored.
  */
  public void calculateScore(Dice dice){
    int total = 0;
    for(int i = 0; i < 5; i++){
      if(dice.getDie(i).getValue() == value){
        total += value;
      }
    }
    super.setScore(total);
  }

  /**
  * This method determines whether the dice are valid to be scored.
  * @param dice The dice that are evaluated.
  * @return true, as the dice can always be scored this way.
  */
  public boolean isValid(Dice dice){
    return true;
  }
}
