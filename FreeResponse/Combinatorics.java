public class Combinatorics{

  public static int factorial(int n){
    if(n == 1){
      return 1;
    }
    else{
      return n*factorial(n-1);
    }
  }

  public static void numCombinations(int n, int r){
    if(r>n){
      return 0;
    }
    System.out.println(factorial(n)/(factorial(r)*factorial(n-r)));
  }

  // Add a private ArrayList<Integer> arr1 to keep track of what factorials have been calculated.
  // When a number's factorial is calculated, add the number to arr1.
  // We need another private ArrayList<Integer> arr2 to keep track of the factorials.
  // When a number's factorial is calculated, add the factorial to arr2.
  // When we need to look up a number's factorial, we check if the number is in arr1,
  // and if it is, we use the same index that the number was at in arr1 to find the factorial in arr2.
  // In the factorial method, we should add the numbers to the arraylists before returning 1.
}
