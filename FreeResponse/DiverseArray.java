public class DiverseArray{

  public static int arraySum(int[] arr){
    int total = 0;
    for(int i = 0; i < arr.length; i++){
      total += arr[i];
    }
    return total;
  }

  public static int[] rowSums(int[][] arr2D){
    int[] sums = new int[arr2D.length];
    for(int i = 0; i < arr2D.length; i++){
      sums[i] = arraySum(arr2D[i]);
    }
    return sums;
  }

  public static boolean isDiverse(int[][] arr2D){
    int[] arr = rowSums(arr2D);
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < i; j++){
        if(arr[i]==arr[j]){
          return false;
        }
      }
    }
    return true;
  }
}
