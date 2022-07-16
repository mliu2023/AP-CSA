public class Phrase{
  private String currentPhrase;

  public void replaceNthOccurrence(String str, int n, String repl){
    int index = findNthOccurrence(str, n);
    if(index != -1){
      String beginning = str.substring(0, index);
      String end = str.substring(index+str.length());
      currentPhrase = beginning + repl + end;
    }
  }

  public int findLastOccurrence(String str){
    if(currentPhrase.indexOf(str) == -1){
      return -1;
    }
    int i = 1;
    while(findNthOccurence(str, i+1) != -1){
      i++;
    }
    return i;
  }
}
