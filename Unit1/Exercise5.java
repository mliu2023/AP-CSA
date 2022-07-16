import java.util.Scanner;
import java.util.ArrayList;
public class Exercise5{
  public static void main(String[] args){
    ArrayList <String> arr=new ArrayList<String>();
    arr.add(0, "hi");
    arr.add(1, "hi");
    arr.add(2, "hello");
    System.out.println(arr.get(0));
    System.out.println(doubleNumber());
    replaceString(arr, "h", "b");
    System.out.println(arr.get(0));
  }
  public static int doubleNumber(){
    boolean stop=false;
    int max=Integer.MIN_VALUE;
    ArrayList <Integer> nums=new ArrayList <Integer>();
    Scanner keyboard=new Scanner(System.in);
    System.out.println("Enter some numbers: ");
    while(!stop){
    String ans=keyboard.nextLine();
    if(ans.equals("")){
      stop=true;
    }
    else{
      nums.add(nums.size(), Integer.parseInt(ans));
      }
    }
    int maxValue=nums.get(0);
    for(int j=0; j<nums.size(); j++){
      if(nums.get(j)>maxValue)
        maxValue=nums.get(j);
    }
    return maxValue*2;
  }
  public static void removeString(ArrayList<String> x, String s){
    for(int i=0; i<x.size(); i++){
      if(x.get(i).equals(s)){
        x.remove(i);
        i--;
      }
    }
  }
  public static void replaceString(ArrayList<String> x, String a, String b){
    for(int i=0; i<x.size(); i++){
      String s=x.get(i);
      for(int j=0; j<x.get(i).length(); j++){
        if(s.substring(j, j+1).equals(a)){
          x.set(i, s.substring(0, j)+b+s.substring(j+1));
        }
      }
    }
  }
}
