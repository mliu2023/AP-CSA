/**
* Class to create a row for a full house.
* @author Max Liu
* @version 1.0
*/
public class FullHouseRow extends FixedAmountRow{

  /**
  * Constructor for a row for a full house.
  * @param name The name of the row.
  */
  public FullHouseRow(String name){
    super(name, 25);
  }

  /**
  * This method checks whether the dice are valid or not.
  * @param dice The dice that are checked.
  * @return true if the dice are valid, false otherwise.
  */
  public boolean isValid(Dice dice){
    int[] arr = new int[6];
    for(int i = 0; i < 5; i++){
      int val = dice.getDie(i).getValue();
      arr[val-1] += 1;
    }
    for(int i = 0; i < 6; i++){
      for(int j = 0; j < i; j++){
        if((arr[i] == 2 && arr[j] == 3) || (arr[i] == 3 && arr[j] == 2)){
          return true;
        }
      }
    }
    return false;
  }
}
