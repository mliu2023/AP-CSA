public class stringMethods{
  public static void main(String[] args){
  }

  /**
 * Finds the first instance of s in line,
 * starting at the position start.
 * @param o The original string.
 * @param s The string to find.
 * @param start The position to start searching, guaranteed to be in
 * the string line (precondition).
 * @return The index of the first single instance of s if the string
 * is found or -1 if the string is not found.
 */
  public static int findString(String o, String s, int start){
// We take the substring starting from start and we use .indexOf to find s.
    int index=o.substring(start).indexOf(s);
    if(index>=0)
    // We add start to the index to get the index of s in the original string.
      return index+start;
    else
      return -1;
  }

  /**
 * Count the number of times instances of s appear in the line.
 * @param o The original string.
 * @param s The string to find.
 * @return The number of times the string appears in the line.
 */
  public static int countString(String o, String s){
    // Base case
    if(o.indexOf(s)<0)
      return 0;
    // Recursive step
    else
      return countString(o.substring(o.indexOf(s)+1), s)+1;
  }

  /**
 * Replace all instances of underscores in the line by italic tags.
 * There must be an even number of underscores in the line, and they
 * will be replaced by alternating <I> </I>.
 * @param line A string with 0 or more underscores.
 * @return The line where the underscores were replaced with <I> </I>
 * tags or the original line if there are not an even number of
 * underscores.
 */
  public static String convertItalics(String line){
    // Counter keeps track of how many underscores we have changed.
    int counter=0;
    String str="";
    if (countString(line, "_")%2==1)
      return line;
    else{
      for(int i=0; i<line.length(); i++)
        if((int)line.charAt(i)==95){
          if(counter%2==0)
            str+="<I>";
          else
            str+="</I>";
          counter++;
        }
        else
          str+=line.charAt(i);
        }
    return str;
  }
}
