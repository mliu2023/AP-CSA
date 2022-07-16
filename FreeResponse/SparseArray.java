public class SparseArray{
// 0U37YYU9
// ML
  public int getValueAt(int row, int col){
    for(int i = 0; i < entries.size(); i++){
      if(entries.get(i).getRow()==row && entries.get(i).getCol()==col){
        return entries.get(i).getValue();
      }
    }
    return 0;
  }

  public void removeColumn(int col){
    for(int i = 0; i < entries.size(); i++){
      SparseArrayEntry entry = entries.get(i);
      if(entry.getCol()==col){
        entries.remove(i);
        i--;
      }
      else if(entry.getCol()>col){
        entries.set(i, new SparseArrayEntry(entry.getRow(), entry.getCol()-1, entry.getValue()));
      }
    }
  }
}
