import java.util.ArrayList;

public class ProblemSet1{
  /**
  * This method returns a wedge of ints.
  * @param arr The array of ints.
  * @return Array of length 1 less than 2 times the original length with the original elements mirrored.
  */
  public static int[] createWedge(int[] arr){
    int[] wedge = new int[2*arr.length-1];
    for(int i = arr.length-1; i >= 0; i--){
      wedge[i]=arr[i];
      wedge[wedge.length-i-1]=arr[i];}
    return wedge;
  }

/**
* This method returns an array of fibonacci numbers.
* @param n The number of fibonacci numbers.
* @return The array with the first n fibonacci numbers.
*/
  public static int[] fibArray(int n){
    int[] fibArr = new int[n];
    fibArr[0]=1;
    fibArr[1]=1;
    for(int i = 2; i < n; i++){
      // we find the next fibonacci number in terms of the previous ones.
      fibArr[i]=fibArr[i-1]+fibArr[i-2];
    }
    return fibArr;
  }

/**
* This method rotates an array to the left.
* @param arr The array that is rotated.
*/
  public static void rotateLeft(int[] arr){
    // temp stores the first element before it is changed.
    int temp = arr[0];
    for(int i = 0; i < arr.length-1; i++){
      arr[i]=arr[i+1];
    }
    arr[arr.length-1] = temp;
  }

/**
* This method rotates an array to the right.
* @param arr The array that is rotated.
*/
  public static void rotateRight(int[] arr){
    // temp stores the last element before it is changed.
    int temp = arr[arr.length-1];
    for(int i = arr.length-1; i >= 1; i--){
      arr[i]=arr[i-1];
    }
    arr[0]=temp;
  }

/**
* This method rotates an array d times to the left or right, depending on the sign.
* @param arr The array that is rotated.
* @param d The amount of times rotated in a particular direction.
*/
  public static void rotate(int[] arr, int d){
    // if d is positive, rotate to the right.
    if(d>0){
      for(int i = 0; i < d; i++){
        rotateRight(arr);
      }
    }
    // if d is negative, rotate to the left.
    else if(d<0){
      for(int j = 0; j < -1*d; j++){
        rotateLeft(arr);
      }
    }
    // if d is 0, we can do nothing.
  }

/**
* This method populates the seating in a theater.
* @param n The number of rows.
* @param arr The ArrayList containing strings with positions of taken seats.
* @return A 2d array with 1 in a taken position, and 0 in an empty seat.
*/
  public static int[][] populateSeating(int n, ArrayList<String> arr){
    int[][] seats = new int[n][];
    for(int i = 0; i < n; i++){
      // We need to create a jagged 2d array.
      // Each time we move back a row, we add 2 seats.
      seats[i] = new int[10+2*i];
    }
    for(int j = 0; j < arr.size(); j++){
      String s = arr.get(j);
      int index = s.indexOf(",");
      // first number is r.
      int r = Integer.parseInt(s.substring(0,index));
      // second number is c.
      int c = Integer.parseInt(s.substring(index+1));
      seats[r][c]=1;
    }
    return seats;
  }
/**
* @param seats The seating arrangement that will be printed.
*/
  public static void printSeating(int[][] seats)
  {
    // if there are n rows, then there are 2n+1 lines we need to print out.
    // in this method, I'm trying to organize the curly brackets differently.

    int longestRow = seats[seats.length-1].length;
    // we first print out the top row:
    for(int i = 0; i < longestRow; i++){
      System.out.print("+---");
    }
    System.out.println("+");

    // At the end of each line, we have to print an extra "*" or "|"
    // x will help us determine which one to print out at the end.
    boolean x=true;

    for(int r = 2*seats.length-1; r >= 0 ; r--)
    {
      for(int c = 0; c < longestRow/2+seats[r/2].length/2; c++)
      {
        if(r%2==0)
        {
          x=true;
          if(c>=longestRow/2-seats[r/2].length/2 && c <= longestRow/2+seats[r/2].length/2)
          {
            System.out.print("+---");
          }
          else
          {
            System.out.print("    ");
          }
        }
        else
        {
          x=false;
          if(c>=longestRow/2-seats[r/2].length/2 && c <= longestRow/2+seats[r/2].length/2)
          {
            System.out.print("| ");
            System.out.print(seats[r/2][c-longestRow/2+seats[r/2].length/2]);
            System.out.print(" ");
          }
          else
          {
            System.out.print("    ");
          }
        }
      }
      if(x)
        System.out.print("+");
      else
        System.out.print("|");
      System.out.println();
    }
  }
/**
* This method determines whether there exists n consecutive seats in any row.
* @return true or false, depending on whether there exists a row of n open.
*/
  public static boolean bookSeats(int[][] seatingChart, int n){
    for(int r = seatingChart.length-1; r >= 0; r--)
    {
      // counter keeps track of how many consecutive seats we have.
      int counter = 0;
      for(int c = 0; c < seatingChart[r].length; c++)
      {
        if(seatingChart[r][c] == 1)
        {
          counter = 0;
        }
        else
        {
          counter++;
        }
        // if we ever reach n consecutive seats, we return true.
        if(counter == n)
        {
          return true;
        }
      }
    }
    return false;
  }
/**
* This method multiplies two matricies, a and b.
* @param a The first matrix.
* @param b The second matrix.
* @return The product of the two matricies.
*/
  public static int[][] multiply(int[][] a, int[][] b){
    int[][] c = new int[a.length][b[0].length];
    for(int i = 0; i < c.length; i++)
    {
      for(int j = 0; j < c[0].length; j++)
      {
        for(int k = 0; k < a[0].length; k++)
        {
          c[i][j] += a[i][k]*b[k][j];
        }
      }
    }
    return c;
  }

/**
* This method finds the top 5 integers in an array.
* @param arr The array of integers.
* @return An ArrayList containing the largest 5 integers.
*/
  public static ArrayList<Integer> top5(int[] arr)
  {
    ArrayList<Integer> top = new ArrayList<Integer>(6);
    for(int i = 0; i < arr.length; i++)
    {
      if(i == 0)
      {
        top.add(arr[i]);
      }
      // we do something similar to insertion sort here.
      else
      {
        int j = top.size();
        while(j > 0 && arr[i]>top.get(j-1))
        {
          j--;
        }
        top.add(j, arr[i]);
        if(top.size()>5)
        {
          top.remove(5);
        }
      }
    }
    return top;
  }
/**
* This method removes any duplicate copies of each string.
* @param arr The ArrayList containing the strings.
*/
  public static void removeDuplicates(ArrayList<String> arr){
    for(int i = 0; i < arr.size(); i++)
    {
      int index = arr.indexOf(arr.get(i));
      if(index != i)
      {
        arr.remove(i);
        i--;
      }
    }
  }
/**
* This method replaces all numbers with "z".
* @param arr The ArrayList containing strings.
*/
  public static void replace(ArrayList<String> arr){
    for(int i = 0; i < arr.size(); i++)
    {
      String s = arr.get(i);
      for(int j = 0; j < s.length(); j++)
      {
        s = arr.get(i);
        if("0123456789".indexOf(s.substring(j, j+1)) >= 0)
        {
          arr.set(i, s.substring(0,j)+"z"+s.substring(j+1));
        }
      }
    }
  }
}
