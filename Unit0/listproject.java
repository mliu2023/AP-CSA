import java.util.ArrayList;
public class listproject{
  public static void main(String[] args){
    for(int i = 2; i <= 2000; i++){
      if(checkJuicy(i) && checkSquare(i)){
        System.out.println(i);
      }
    }
  }
  public static boolean divisible(int n, int divisor){
    if(n % divisor == 0){
      return true;
    }
    return false;
  }
  public static ArrayList<Integer> listDivisors(int n){
    ArrayList<Integer> divisors= new ArrayList<Integer>(100);
    for(int i=1; i <= n; i++){
      if(n % i == 0){
        divisors.add(i);
      }
    }
    return divisors;
  }
  public static boolean checkJuicy(int n){
    ArrayList<Integer> divisors = listDivisors(n);
    for(int i = 1; i < divisors.size(); i++){
      int k = divisors.get(i) - divisors.get(i-1);
      if(n % k != 0){
        return false;
      }
    }
    return true;
  }
  public static boolean checkSquare(int n){
    ArrayList<Integer> divisors = listDivisors(n);
    for(int i = 1; i < divisors.size(); i++){
      int k = divisors.get(i) * divisors.get(i);
      if(n % k == 0){
        return false;
      }
    }
    return true;
  }
}
