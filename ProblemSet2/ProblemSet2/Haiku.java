/**
* Class to create a Haiku.
* @author Max Liu
* @version 1.0
*/
public class Haiku extends Poem{
  // fields
  private int numLines;
  private int[] syllables;
  /**
  * Constructor for a haiku.
  */
  public Haiku(){
    numLines = 3;
    syllables = new int[]{5, 7, 5};
  }
  /**
  * This method returns the number of lines in a haiku.
  * @return 3, as a haiku always has 3 lines.
  */
  public int numLines(){
    return numLines;
  }
  /**
  * This method gets the number of syllables in line k of a haiku.
  * @param k The line in which the number of syllables is found.
  * @return The number of syllables in line k.
  */
  public int getSyllables(int k){
    if(k >= 1 && k <= 3){
      return syllables[k-1];
    }
    else{
      return 0;
    }
  }
  /**
  * This method prints the rhythm of a haiku.
  * @return The rhythm of a haiku.

  */
  public String printRhythm(){
    return super.printRhythm();
  }
}
