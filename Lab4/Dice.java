/**
* Class to create an array of dice.
* @author Max Liu
* @version 1.0
*/
public class Dice{

  private Die[] diceArr;

  /**
  * This constructor creates 5 dice in an array.
  */
  public Dice(){
    diceArr = new Die[5];
    for(int i = 0; i < 5; i++){
      diceArr[i] = new Die();
    }
  }

  /**
  * This method returns the dice at index i in the array.
  * @param i The index at which the die will be returned.
  * @return Dice at index i.
  */
  public Die getDie(int i){
    return diceArr[i];
  }

  /**
  * This method rolls all 5 dice.
  */
  public void rollDice(){
    for(int i = 0; i < 5; i++){
      diceArr[i].roll();
    }
  }

  /**
  * This method rolls some of the dice given an array of booleans.
  * @param arr An array of booleans that determines whether a dice is rolled or not.
  */
  public void rollDice(boolean[] arr){
    for(int i = 0; i < 5; i++){
      if(!arr[i]){
        diceArr[i].roll();
      }
    }
  }

  /**
  * This method prints the values of the dice.
  * @return The values of the 5 dice in a row.
  */
  public String toString(){
    String returnString = "";
    for(int i = 0; i < 5; i++){
      returnString += diceArr[i].toString() + " ";
    }
    return returnString;
  }
}
