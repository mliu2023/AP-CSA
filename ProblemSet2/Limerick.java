/**
* Class to create a limerick.
* @author Max Liu
* @version 1.0
*/
public class Limerick extends Poem{
  // fields
  private int numLines;
  private int[] syllables;
  /**
  * Constructor for a limerick.
  */
  public Limerick(){
    numLines = 5;
    syllables = new int[]{9, 9, 6, 6, 9};
  }
  /**
  * This method returns the number of lines in a Limerick.
  * @return 5, as all limericks have 5 lines.
  */
  public int numLines(){
    return numLines;
  }
  /**
  * This method returns the number of syllables in line k of a limerick.
  * @param k The lime in which the number of syllables is found.
  * @return The number of syllables in line k.
  */
  public int getSyllables(int k){
    if(k >= 1 && k <= 5){
      return syllables[k-1];
    }
    return 0;
  }
  /**
  * This method returns the rhythm of a poem.
  * @return The rhythm of the poem.
  */
  public String printRhythm(){
    return super.printRhythm();
  }
}
