/**
* Abstract class for a score row.
* @author Max Liu
* @version 1.0
*/
public abstract class ScoreRow{

  private String name;
  private int score;

  /**
  * Constructor for a ScoreRow.
  * @param name The name of the ScoreRow.
  */
  public ScoreRow(String name){
    this.name = name;
    score = -1;
  }

  public String getName(){
    return name;
  }
  public int getScore(){
    return score;
  }

  public void setName(String name){
    this.name = name;
  }
  public void setScore(int score){
    this.score = score;
  }

  /**
  * This method allows a ScoreRow to be printed with the name and score.
  * @return The name and score with an arrow.  If no score has been set, the score will be blank.
  */
  public String toString(){
    String str = "";
    int length = name.length();
    for(int i = 0; i < 25-length; i++){
      str += " ";
    }
    if(score != -1){
      return name + str + "--> " + score;
    }
    return name + str + "--> ";
  }

  /**
  * This method calculates the score given the dice.
  * @param dice The dice that give a score.
  */
  public abstract void calculateScore(Dice dice);

  /**
  * This method checks whether the dice are valid to be scored in a certain way.
  * @param dice The dice that are evaluated.
  * @return true if the dice are valid, false otherwise.
  */
  public abstract boolean isValid(Dice dice);

}
