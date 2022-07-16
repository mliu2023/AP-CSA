/**
* Class to create a die.
* @author Max Liu
* @version 1.0
*/
public class Die{

  private int value;

  /**
  * Constructor for a Die.
  * This constructor initializes value to 0.
  */
  public Die(){
    value = 0;
  }

  public int getValue(){
    return value;
  }

  public void setValue(int n){
    value = n;
  }

  /**
  * This method rolls the die by generating a random number between 1 and 6.
  */
  public void roll(){
    value = (int)(Math.random()*6)+1;
  }

  /**
  * This method returns the value of the die.
  * @return The value of the die is returned.
  */
  public String toString(){
    return value + "";
  }


}
