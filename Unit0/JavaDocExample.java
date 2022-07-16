/**
 * Public class to demonstrate how to create documentation in java
 * @author Marie-Pierre Jolly
 * @version 1.0
 */
public class JavaDocExample
{
  /**
   * Main function in the class
   * @param args The command line arguments
   */
  public static void main(String[] args)
  {
    int a = 3;
    int b = increment(a, 0);
    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }

  /**
   * Function to increment an integer
   * @param a The integer to be incremented
   * @param a2 Another integer
   * @return The incremented integer
   */
  public static int increment(int a, int a2)
  {
    a2 = 0;
    int b = a + 1;
    return b;
  }
}
