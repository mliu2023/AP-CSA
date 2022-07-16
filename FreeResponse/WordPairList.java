public class WordPairList{

  public WordPairList(String[] words){
    allPairs = new ArrayList<WordPair>();
    for(int j = 0; j < words.length; j++){
      for(int i = 0; i < j; i++){
        String pair = new WordPair(words[i], words[j]);
        allPairs.add(pair);
      }
    }
  }

  public int numMatches(){
    int counter = 0;
    for(int i = 0; i < allPairs.size(); i++){
      String s1 = allPairs.get(i).getFirst();
      String s2 = allPairs.get(i).getSecond();
      if(s1.equals(s2)){
        counter++;
      }
    }
    return counter;
  }
}
