import java.util.*;

public class practicequiz4{
  public static void main(String[] args){
    int[][] col = {{1}, {3}, {2,4}};
    printColMajor(col);

    ArrayList<Double> truncate = new ArrayList<Double>();
    truncate.add(1.23);
    truncate.add(4.50);
    truncate.add(6.56);
    truncate(truncate);
    System.out.println(truncate);

    int[][] ints = {{1, 2, 3}, {2, 3}, {1}};
    System.out.println(sumInts(ints));

    ArrayList<Integer> negatives = new ArrayList<Integer>();
    negatives.add(1);
    negatives.add(2);
    negatives.add(-4);
    negatives.add(-4);
    negatives.add(5);
    removeNegatives(negatives);
    System.out.println(negatives);

    int[] sum = {1, 2, 4, -1, 0, 2};
    sumElements(sum);
    for(int i = 0; i < sum.length; i++){
      System.out.print(sum[i]);
      System.out.print(" ");
    }
  }
  public static void printColMajor(int[][] arr){
    int maxLength = 0;
    for(int r = 0; r < arr.length; r++){
      if(arr[r].length>maxLength)
        maxLength=arr[r].length;
    }
    for(int c = 0; c < maxLength; c++){
      for(int r = 0; r < arr.length; r++){
        if(c<arr[r].length){
          System.out.print(arr[r][c]);
          System.out.print(" ");
        }
      }
    }
  }

  public static void truncate(ArrayList<Double> arr){
    for(int i = 0; i < arr.size(); i++){
      arr.set(i, (double)((int)arr.get(i).doubleValue()));
    }
  }

  public static int sumInts(int[][] arr){
    int total = 0;
    for(int row[] : arr){
      for(int c : row){
        total+=c;
      }
    }
    return total;
  }

  public static void removeNegatives(ArrayList<Integer> arr){
    for(int i = 0; i < arr.size(); i++){
      if(arr.get(i)<0){
        arr.remove(i);
        i--;
      }
    }
  }

  public static void sumElements(int[] arr){
    for(int i = 1; i < arr.length; i++){
      arr[i]+= arr[i-1];
    }
  }
}
