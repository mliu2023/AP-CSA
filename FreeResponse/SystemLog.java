public class SystemLog{

  private List<LogMessage> messageList;

  public List<LogMessage> removeMessages(String keyword){
    List<LogMessage> removed = new List<LogMessage>();
    for(int i = 0; i < messageList.size(); i++){
      if(messageList.get(i).containsWord(keyword)){
        removed.add(messageList.get(i));
        messageList.remove(i);
      }
    }
    return removed;
  }
}
