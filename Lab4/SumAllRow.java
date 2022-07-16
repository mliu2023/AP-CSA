/**
* Abstract class for scorerows where all dice are summed.
* @author Max Liu
* @version 1.0
*/
public abstract class SumAllRow extends ScoreRow{

  /**
  * Constructor for a SumAllRow ScoreRow.
  * @param name The name of the ScoreRow.
  */
  public SumAllRow(String name){
    super(name);
  }

  /**
  * This method calculates the score given the dice and updates the ScoreRow.
  * @param dice The dice that determine the score.
  */
  public void calculateScore(Dice dice){
    int total = 0;
    for(int i = 0; i < 5; i++){
      total += dice.getDie(i).getValue();
    }
    super.setScore(total);
  }

}
