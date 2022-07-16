public class MultipleGroups{

  private List<NumberGroup> groupList;

  public boolean contains(int num){
    for(int i = 0; i < groupList.size(); i++){
      if(groupList.get(i).contains(num)){
        return true;
      }
    }
    return false;
  }
}
