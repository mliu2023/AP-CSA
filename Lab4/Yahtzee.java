import java.util.Scanner;
import java.util.ArrayList;
/**
 * Class to play the game of Yahtzee.
 * @author Max Liu
 */
public class Yahtzee
{
  /**
   * Main method to test valid combinations or play the game.
   * @param args command line arguments.
   */
  public static void main(String[] args)
  {
    ScoreSheet s = new ScoreSheet();
    int[] counts = new int[13];
    ArrayList<Dice> dice = generateAllDiceCombinations();
    for(int i = 0; i < dice.size(); i++){
      for(int j = 0; j < 13; j++){
        if(s.get(j).isValid(dice.get(i))){
          counts[j]+=1;
        }
      }
    }
    for(int k: counts){
      System.out.println(k);
    }
    playGame();
  }

  /**
   * Play the game of Yahtzee.
   */
  public static void playGame()
  {
    ScoreSheet s = new ScoreSheet();
    while(!s.isFull()){
      Dice dice = rollDice();
      pickRow(s, dice);
      System.out.println(s);
    }
  }

  /**
   * Roll the dice up to 3 times with user interaction.
   * @return the final rolled dice.
   */
   public static Dice rollDice(){
     int turn = 3;
     Dice dice = new Dice();
     // The 6th element of this array is for whether the user typed in "q" or not.
     boolean[] arr = new boolean[6];
     Scanner keyboard = new Scanner(System.in);
     while(turn > 0 && !arr[5]){
       if(turn == 3){
         System.out.print("Your first roll of dice is: ");
         dice.rollDice(arr);
         System.out.println(dice);
         System.out.println("Enter the pattern xxxxx with 1 for keep and 0 for reroll.");
         System.out.print("Enter q to stop rolling and pick your row in the score sheet: ");
         if(checkInput(keyboard.nextLine(), arr)){
           turn--;
         }
       }
       else if(turn == 2){
         System.out.print("Your second roll of dice is: ");
         dice.rollDice(arr);
         System.out.println(dice);
         System.out.println("Enter the pattern xxxxx with 1 for keep and 0 for reroll.");
         System.out.print("Enter q to stop rolling and pick your row in the score sheet: ");
         if(checkInput(keyboard.nextLine(), arr)){
           turn--;
         }
       }
       else if(turn == 1){
         turn--;
         System.out.print("Your dice are: ");
         dice.rollDice(arr);
         System.out.println(dice);
         System.out.println();
       }
     }
     return dice;
   }

  /**
   * Get the user to pick the row where to insert the new score.
   * @param s the score sheet to be updated.
   * @param dice the dice combination to be used to add a new score.
   */
  public static void pickRow(ScoreSheet s, Dice dice)
  {
    Scanner keyboard = new Scanner(System.in);
    boolean go = true;
    boolean usedRow = false;
    boolean invalid = false;
    boolean number = true;
    String row;
    int val = 1;
    while(go){
      go = false;
      usedRow = false;
      invalid = false;
      number = true;
      System.out.print("Enter the row number for the score: ");
      row = keyboard.nextLine();
      for(int i = 0; i < row.length(); i++){
        if("0123456789".indexOf(row.substring(i, i+1)) == -1){
          go = true;
          number = false;
        }
      }
      if(!go){
        val = Integer.parseInt(row);
        if(val < 1 || val > 13){
          go = true;
          number = false;
        }
        else if(s.get(val-1).getScore() != -1){
          usedRow = true;
          go = true;
        }
        else if(!s.get(val-1).isValid(dice)){
          invalid = true;
          go = true;
        }
        else{
          s.get(val-1).calculateScore(dice);
        }
      }
      if(go){
        if(!number){
          System.out.println("The row should be a number between 1 and 13.");
        }
        else if(usedRow){
          System.out.println("The row " + "\'"+s.get(val-1).getName()+"\'" + " already has a score.");
        }
        else if(invalid){
          System.out.println("The row " + "\'"+s.get(val-1).getName()+"\'" + " does not accept this combination of dice.");
          System.out.println("Do you really want to enter 0 for " + "\'"+s.get(val-1).getName()+"\'? (y/n) ");
          String str = keyboard.nextLine();
          if(str.equals("y")){
            s.get(val-1).setScore(0);
            go = false;
          }
          else if(!str.equals("n")){
            System.out.println("That is an unacceptable answer.");
          }
        }
      }
    }
  }


  /**
  * This method checks the input in rollDice and sets go to the proper boolean.
  * @param str The string that is checked to be valid.
  * @param arr The array of booleans that is modified given the input.
  */
  public static boolean checkInput(String str, boolean[] arr){
    if(str.equals("q")){
      arr[5] = true;
      return true;
    }
    else if(str.length() == 5){
      for(int i = 0; i < 5; i++){
        String s = str.substring(i, i+1);
        if(s.equals("0")){
          arr[i] = false;
        }
        else if(s.equals("1")){
          arr[i] = true;
        }
        else{
          for(int j = 0; j < 5; j++){
            arr[j] = true;
          }
          System.out.println("This is not an acceptable answer.");
          return false;
        }
      }
      return true;
    }
    else{
      System.out.println("This is not an acceptable answer.");
      for(int i = 0; i < 5; i++){
        arr[i] = true;
      }
      return false;
    }
  }

  /**
   * Generate all possible combinations of dice to be used in testing the
   * ScoreRow isValid method for different kinds of rows
   * @return An array list of all possible dice combinations
   */
  public static ArrayList<Dice> generateAllDiceCombinations()
  {
    ArrayList<Dice> diceCombinations = new ArrayList<Dice>();
    // Starting values for the dice
    int[] values = new int[5];
    for(int i = 0; i < 5; i++)
      values[i] = 1;
    boolean done = false;
    while (!done)
    {
      // Create the dice using the set of values
      Dice dice = new Dice();
      for(int i = 0; i < 5; i++)
        dice.getDie(i).setValue(values[i]);
      // Add this new Dice object to the array list of combinations
      diceCombinations.add(dice);
      int currentDie = 0;
      boolean foundDie = false;
      // Change dice one at a time, look for the die to change
      while (!foundDie)
      {
        // If the value of the current die has not reached the last face value
        if (values[currentDie] < 6)
        {
          // Increment the value of the die
          values[currentDie]++;
          foundDie = true;
        }
        else
        {
          // Move on to the next die, reset this die back to starting value 1
          values[currentDie] = 1;
          currentDie++;
          // If the current die is beyond the last die, we're done
          if (currentDie == 5)
          {
            foundDie = true;
            done = true;
          }
        }
      }
    }
    return diceCombinations;
  }
}
