/**
* Class to represent a ChanceRow.
* @author Max Liu
* @version 1.0
*/
public class ChanceRow extends SumAllRow{

  /**
  * Constructor for a ChanceRow.
  * @param name The name of the ChanceRow.
  */
  public ChanceRow(String name){
    super(name);
  }

  /**
  * This method checks whether the dice are valid to be scored.
  * @param dice The dice that are checked.
  * @return True if valid, false otherwise.
  */
  public boolean isValid(Dice dice){
    return true;
  }
}
