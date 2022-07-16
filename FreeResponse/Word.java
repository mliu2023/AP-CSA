public class Word{

  public static void main(String[] args){
    System.out.println(scrambleWord("HAURBAD"));
  }

  public static String scrambleWord(String word){
    for(int i = 0; i < word.length()-1; i++){
      String thisChar = word.substring(i, i+1);
      String nextChar = word.substring(i+1, i+2);
      if(thisChar.equals("A") && !nextChar.equals("A")){
        word = word.substring(0, i) + nextChar + thisChar + word.substring(i+2);
        i++;
      }
    }
    return word;
  }

  public static void scrambleOrRemove(List<String> wordList){
    for(int i = 0; i < wordList.size(); i++){
      if(scrambleWord(wordList.get(i)).equals(wordList.get(i))){
        wordList.remove(i);
        i--;
      }
      else{
        wordList.set(i, scrambleWord(wordList.get(i)));
      }
    }
  }
}
