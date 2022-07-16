public class Successor{

  public static Position findPosition(int num, int[][] intArr){
    for(int r = 0; r < intArr.length; r++){
      for(int c = 0; c < intArr[r].length; c++){
        if(intArr[r][c] == num){
          return Position(r, c);
        }
      }
    }
    return null;
  }

  public static Position[][] getSuccessorArray(int[][] intArr){
    Position[][] posArr = new Position[intArr.length][intArr[0].length];
    for(int r = 0; r < intArr.length; r++){
      for(int c = 0; c < intArr[r].length; c++){
        posArr[r][c] == findPosition(intArr[r][c]+1, intArr);
      }
    }
    return posArr;
  }
}
