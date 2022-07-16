public class Delimiters{

  public ArrayList<String> getDelimitersList(String[] tokens){
    ArrayList<String> delimiterArr = new ArrayList<String>();
    int length = tokens.length;
    for(int i = 0; i < length; i++){
      if(tokens[i].substring(0, 1).equals("<") && tokens[i].substring(length-1, length).equals(">")){
        delimiterArr.add(tokens[i]);
      }
      else if(tokens[i].equals("(") || tokens[i].equals(")")){
        delimiterArr.add(tokens[i]);
      }
    }
    return delimiterArr;
  }

  public boolean isBalanced(ArrayList<String> delimiters){
    int open = 0;
    int close = 0;

    for(int i = 0; i < delimiters.size(); i++){
      if(isOpen(delimiters.get(i))){
        open++;
      }
      else{
        close++;
      }
      if(close > open){
        return false;
      }
    }
    if(open == close){
      return true;
    }
    return false;
  }

  public boolean isOpen(String s){
    if(s.equals("(") || s.substring(1, 2) != "/"){
      return true;
    }
    return false;
  }
}
