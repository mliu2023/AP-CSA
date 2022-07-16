import java.util.*;
public class practiceexam1{
  public static void main(String[] args){
    System.out.println(Arrays.toString(initTwoD(5)));
  }
  public static char[][] initTwoD(int n ){
    char[][] arr = new char[n][];
    for(int r = 0; r < n; r++)
    {
      arr[r]=new char[n-r];
      for(int c = 0; c < n-r; c++){
        arr[r][c]='*';
      }
    }
    return arr;
  }
  public static void removeDuplicateChar(ArrayList<String> arr)
  {
    for(int i = 0; i < arr.size(); i++)
    {
      for(int j = 0; j < arr.get(i).length(); j++)
      {
        String s=arr.get(i);
        if(s.substring(0,j).indexOf(s.substring(j,j+1))>=0)
        {
          arr.set(i, s.substring(0,j)+s.substring(j+1));
        }
      }
    }
  }

  public static void distributeToekns(ArrayList<Integer> arr, int n)
  {
    int counter = n;
    while(arr.get(n)>0)
    {
      arr.set(n, arr.get(n)-1);
      counter = (counter+1)%(arr.size());
      arr.set(counter, arr.get(counter)+1);
    }
  }

  public static void switchPairs(ArrayList<String> arr)
  {
    for(int i = 0; i < 2*(arr.size()/2); i+=2)
    {
      String temp = arr.remove(i);
      arr.add(i+1,temp);
    }
  }

  public static void markLength4(ArrayList<String> arr)
  {
    for(int i = 0; i < arr.size(); i++)
    {
      if(arr.get(i).length()==4)
      {
        arr.add(i, "****");
        i++;
      }
    }
  }

  public static String[][] convertArrayList(ArrayList<String> arr)
  {
    String[][] d = new String[arr.size()][];
    for(int i = 0; i < arr.size(); i++)
    {
      for(int j = 0; j < arr.get(i).length(); j++)
      {
        d[i] = new String[arr.get(i).length()];
        d[i][j] = arr.get(i).substring(j, j+1);
      }
    }
    return d;
  }
}
