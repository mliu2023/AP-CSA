import java.util.ArrayList;
/**
* Class to create a ScoreSheet.
* @author Max Liu
* @version 1.0
*/
public class ScoreSheet extends ArrayList<ScoreRow>{
  /**
  * Constructor for a ScoreSheet.
  */
  public ScoreSheet(){
    super();
    super.add(new NumberRow("Ones", 1));
    super.add(new NumberRow("Twos", 2));
    super.add(new NumberRow("Threes", 3));
    super.add(new NumberRow("Fours", 4));
    super.add(new NumberRow("Fives", 5));
    super.add(new NumberRow("Sixes", 6));
    super.add(new NofAKindRow("Three of a Kind", 3));
    super.add(new NofAKindRow("Four of a Kind", 4));
    super.add(new FullHouseRow("Full House"));
    super.add(new StraightRow("Small Straight", 4));
    super.add(new StraightRow("Large Straight", 5));
    super.add(new YahtzeeRow("Yahtzee"));
    super.add(new ChanceRow("Chance"));
  }

  /**
  * This method calculates the total score.
  * @return The total score.
  */
  public int getTotal(){
    int total = 0;
    for(int i = 0; i < super.size(); i++){
      if(super.get(i).getScore() > 0){
        total += super.get(i).getScore();
      }
    }
    return total;
  }

  /**
  * This method determines whether the scoresheet is full or not.
  * @return true if full, false otherwise.
  */
  public boolean isFull(){
    for(int i = 0; i < super.size(); i++){
      if(super.get(i).getScore() == -1){
        return false;
      }
    }
    return true;
  }

  /**
  * This method allows a ScoreSheet to be printed.
  * @return All the score rows with the scores next to them.
  */
  public String toString(){
    String returnStr = "";
    for(int i = 0; i < super.size(); i++){
      if(i <= 8){
        returnStr += " " + (i+1) + ". " + super.get(i).toString() + "\n";
      }
      else{
        returnStr += (i+1) + ". " + super.get(i).toString() + "\n";
      }
    }
    returnStr += "Total = " + getTotal();
    return returnStr;
  }
}
