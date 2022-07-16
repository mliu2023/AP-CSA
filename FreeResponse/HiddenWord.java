public class HiddenWord{

  private String word;

  public HiddenWord(String word){
    this.word = word;
  }

  public String getHint(String guess){
    String hint = "";
    for(int i = 0; i < guess.length(); i++){
      String w = word.substring(i, i+1);
      String g = guess.substring(i, i+1);
      if(w.equals(g)){
        hint += w;
      }
      else if(word.indexOf(g) >= 0){
        hint += "+";
      }
      else{
        hint += "*";
      }
    }
    return hint;
  }

}
