/**
* Abstract class for a poem.
* @author Max Liu
* @version 1.0
*/
public abstract class Poem{
  /**
  * This method returns the number of lines in a poem.
  * @return The number of lines in the specific poem.
  */
  public abstract int numLines();
  /**
  * This method finds the number of syllables in the k-th line.
  * @param k The line in which we find the number of syllables.
  * @return The number of syllables in the k-th line.
  */
  public abstract int getSyllables(int k);
  /**
  * This method shows the rhythm of the poem.
  * @return The rhythm of the poem with "ta" representing a syllable.
  */
  public String printRhythm(){
    String rhythmString = "";
    for(int i = 1; i <= numLines(); i++){
      for(int j = 1; j < getSyllables(i); j++){
        rhythmString += "ta-";
      }
      rhythmString += "ta\n";
    }
    return rhythmString;
  }
}
