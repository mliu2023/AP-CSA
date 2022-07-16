public class ArrayTester{

  public static int[] getColumn(int[][] arr2D, int c){
    int[] newArr = new int[arr2D.length];
    for(int r = 0; r < arr2D.length; r++){
      newArr[r] = arr2D[r][c];
    }
    return newArr;
  }

  public static boolean isLatin(int[][] square){
    int firstRow = square[0];
    for(int i = 0; i < square.length; i++){
      int[] iCol = getColumn(square, i);
      if(containsDuplicates(square[i]) || containsDuplicates(iCol)){
        return false;
      }
      if(!hasAllValues(firstRow, square[i]) || !hasAllValues(firstRow, iCol)){
        return false;
      }
    }
    return true;
  }
}
