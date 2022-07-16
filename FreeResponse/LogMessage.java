public class LogMessage{

  private String machineID;
  private String description;

  public LogMessage(String message){
    int index = message.indexOf(":");
    machineID = message.substring(0, index);
    description = message.substring(index+1);
  }

  public boolean containsWord(String keyword){
    if(description.indexOf(keyword) == -1){
      return false;
    }
    int index = description.indexOf(keyword);
    if(index != 0 && description.substring(index-1, index) != " "){
      return false;
    }
    int index2 = index + keyword.length();
    if(index != description.length()-1 && description.substring(index2, index2+1) != " "){
      return false;
    }
    return true;
  }
}
