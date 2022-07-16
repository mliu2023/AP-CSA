/**
* Class to create a row that scores n of a kind.
* @author Max Liu
* @version 1.0
*/
public class NofAKindRow extends SumAllRow{

  private int numOfKind;

  /**
  * Constructor for an n of a kind row.
  * @param name The name of the row.
  * @param numOfKind The number of dice that need to be the same in order to be scored.
  */
  public NofAKindRow(String name, int numOfKind){
    super(name);
    this.numOfKind = numOfKind;
  }
  /**
  * This method checks whether the dice are valid to be scored.
  * @param dice The dice that are checked.
  * @return True if valid, false otherwise.
  */
  public boolean isValid(Dice dice){
    for(int i = 1; i <= 6; i++){
      int counter = 0;
      for(int j = 0; j < 5; j++){
        if(dice.getDie(j).getValue() == i){
          counter++;
        }
      }
      if(counter == numOfKind){
        return true;
      }
    }
    return false;
  }
}
