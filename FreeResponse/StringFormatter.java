public class StringFormatter{

  public static int totalLetters(List<String> wordList){
    int total = 0;
    for(int i = 0; i < wordList.size(); i++){
      total += wordList.get(i).length();
    }
    return total;
  }

  public static int basicGapWidth(List<String> wordList, int formattedLen){
    int numSpaces = formattedLen - totalLetters(wordList);
    return numSpaces/(wordList.length-1);
  }

  public static String format(List<String> wordList, int formattedLen){
    int leftover = leftoverSpaces(wordList, formattedLen);
    String str = "";
    String spaces = "";
    for(int j = 0; j < basicGapWidth(wordList, formattedLen); j++){
      spaces += " ";
    }
    for(int i = 0; i < wordList.size()-1; i++){
      str += wordList.get(i);
      str += spaces;
      if(leftover != 0){
        str += " ";
        leftover--;
      }
    }
    str += wordList.get(wordList.size()-1);
    return str;
  }
}
