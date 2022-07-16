/**
* Public class containing methods that solve problems in Problem Set 0.
* @author Max Liu
* @version 1.0
*/

public class ProblemSet0{
/**
* This method converts a base 10 integer to binary.
* @param value the integer that is converted to binary.
* @return the integer in binary.
*/
  public static String toBinary(int value){
    String x="";
    String str="";
    // We keep dividing the number by 2 and adding the remainder to the string.
    if(value==0)
      return "0";
    while(value>0){
      if(value%2==0){
        x+="0";
        value=value/2;
      }
      else{
        x+="1";
        value=value/2;
      }
    }
    // This for loop reverses all the digits.
    for(int i=x.length()-1; i>=0; i--){
      str+=x.substring(i, i+1);
    }
    return str;
}

/**
* This method generates a random number between 1 and n (like rolling a die).
* @param sides The number of sides on the die.
* @return A random number between 1 and n.
*/
  public static int rollDie(int sides){
    int randomNumber=(int)(Math.random()*sides)+1;
    return randomNumber;
  }
  /**
  * This method prints a multiple table.
  * @param a The number of rows.
  */
  public static void multiples(int a){
    // These nested loops print a trianglular pattern.
    for(int i=1; i<=a; i++){
      for(int j=1; j<=i; j++){
        System.out.print(i*j+"\t");
      }
    System.out.println();
    }
  }
  /**
  * This method swaps the units digit and the tens digit.
  * @param a The number whose digits will be swapped.
  * @return The number with swapped units and tens digits.
  */
  public static int swap(int a){
    int units=(a%10);
    int tens=(a%100-units)/10;
    return (a/100*100+tens+10*units);
  }
  /**
  * This method prints three ways to express the XOR operation.
  */
  public static void xor(){
    System.out.println("(a || b) && !(a && b)");
    System.out.println("!(a==b)");
    System.out.println("(a && !b) || (!a && b)");
  }
  /**
  * This method prints a row of n stars.
  * @param n The number of stars.
  */
  public static void printStars(int n){
    for(int i=0; i<n; i++){
    System.out.print("*");
    }
  }
  /**
  * This method prints a triangle with a certain number of rows.
  * @param rows The number of rows.
  */
  public static void printTriangle(int rows){
    for(int i=1; i<=rows; i++){
      printStars(i);
      System.out.println();
    }
  }
  /**
  * This method prints a triangle with a certain number of rows, recursively.
  * @param rows The number of rows.
  */
  public static void printRecursive(int rows){
    if(rows==1)
      System.out.println("*");
    else{
    printRecursive(rows-1);
    printStars(rows);
    System.out.println();}
  }
  /**
  * This method recursively prints an upside down triangle.
  * @param rows The number of rows.
  */
  public static void printRecursive2(int rows){
    if(rows==1)
      System.out.println("*");
    else{
      printStars(rows);
      System.out.println();
      printRecursive2(rows-1);
    }
  }
  /**
  * This method returns the sum of the digits of a number.
  * @param number the number whose digits are summed.
  * @return the sum of the digits.
  */
  public static int sumDigits(int number){
    // Base case
    if (number<10)
      return number;
    // recursive step
    else
      return (number % 10 + sumDigits(number/10));
  }
  /**
  * This method tests whether a number is divisible by 3 or not.
  * @param number The number that is tested for divisibility by 3.
  * @return true if divisible by 3, false if not divisible by 3.
  */
  public static boolean isDivisible(int number){
    if (number==0 || number==3 || number==6 || number==9){
      return true;
    }
    else if(number<10){
      return false;
    }
    else{
      return isDivisible(sumDigits(number));
    }
  }
  /**
  * This method prints stars in a diamond-formation.
  * @param n The number of rows with different lengths.
  */
  public static void printMoreStars(int n){
    int counter=1;
    while(counter<=2*n-1){
      if (counter<=n){
        for(int i=1; i<=n-counter; i++){
          System.out.print(" ");
        }
        printStars(2*counter-1);
        System.out.println();
      }
      else{
        for (int j=1; j<=counter-n; j++){
          System.out.print(" ");
        }
        printStars(4*n-2*counter-1);
        System.out.println();
      }
    counter++;
    }
  }
  /**
  * This method finds the least # of coins needed to create a value.
  * @param value The value the coins should add up to.
  * @return Array containing the # of coins {quarters, dimes, nickels, pennies}.
  */
  public static int[] leastCoins(int value){
    // int[0] is # of quarters, int [1] is # of dimes,
    // int[2] is # of nickels, and int[3] is # of pennies.
    int [] coins = new int[4];
    while (value>=25){
      value-=25;
      coins[0]++;
    }
    while (value>=10){
      value-=10;
      coins[1]++;
    }
    while (value>=5){
      value-=5;
      coins[2]++;
    }
    while (value>=1){
      value-=1;
      coins[3]++;
    }
    return coins;
  }
  /**
  * This method prints all combinations of coins that add up to a certain value.
  * @param value The value that the coins add up to.
  * @return The number of possible combinations of coins.
  */
  public static int coins(int value){
    int counter=0;
    for(int quarters=0; quarters<value/25+1; quarters++){
      int quarterValue=25*quarters;
      for(int dimes=0; dimes<(value-quarterValue)/10+1; dimes++){
        int dimeValue=10*dimes;
        for(int nickels=0; nickels<(value-quarterValue-dimeValue)/5+1; nickels++){
          int nickelValue=5*nickels;
          int pennies=value-quarterValue-dimeValue-nickelValue;
          System.out.println(quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies.");
          counter++;
        }
      }
    }
    return counter;
  }
}
