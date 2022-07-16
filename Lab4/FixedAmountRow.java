/**
* Class to create a row with a fixed score value.
* @author Max Liu
* @version 1.0
*/
public abstract class FixedAmountRow extends ScoreRow{

  private int scoreValue;

  /**
  * Constructor for a FixedAmountRow.
  * @param name The name of the row.
  * @param scoreValue The amount of score the player gets for completing this row.
  */
  public FixedAmountRow(String name, int scoreValue){
    super(name);
    this.scoreValue = scoreValue;
  }

  /**
  * This method sets the score given the dice.
  * @param dice The dice that are scored.
  */
  public void calculateScore(Dice dice){
    super.setScore(scoreValue);
  }
}
