import java.util.Scanner;
/**
 * Public class where the game is created.
 * @author Max Liu
 * @version 1.0
 */
public class FarmersGame{

  /**
  * Main function in the class.
  * @param args The command line arguments.
  */
  public static void main(String[] args){


    // This array will have the boolean values of the objects.
    // true is below the river, false is on top of the river.
    // Index 0 is farmer, index 1 is wolf, index 2 is sheep, index 3 is cabbage.
    // All values are set to false, so they all start on top of the river.

    boolean[] objects = new boolean [4];

    Scanner keyboard= new Scanner(System.in);

    // While the game is not won or lost, the game will continue on.
    while (!(checkWin(objects)) && !(checkLoss(objects))){
    // The board is printed so the user can see the game status.
      printBoard(objects);
    // We take in user input to determine which object to move.
      String answer=keyboard.nextLine();
      moveObject(answer, objects);

    }
    // The board is printed at the end.
    printBoard(objects);

}
/**
* This function will move an object based on the user's input.
* When a wolf, sheep, or cabbage is moved, the farmer is moved too.
* @param answer The object the user chooses to move.
* @param objects[] Array of 4 booleans that is changed based on the answer.
*/
public static void moveObject(String answer, boolean objects[]){
  // We change the boolean value when an object is moved to the other side.
  if (answer.equals("F")){
    objects[0]=!(objects[0]);
  }
  else if (answer.equals("W") && objects[1]==objects[0]){
    // The farmer is moved with the wolf.
    objects[1]=!(objects[1]);
    objects[0]=!(objects[0]);
  }
  else if (answer.equals("S") && objects[2]==objects[0]){
    // The farmer is moved with the sheep.
    objects[2]=!(objects[2]);
    objects[0]=!(objects[0]);
  }
  else if (answer.equals("C") && objects[3]==objects[0]){
    // The farmer is moved with the cabbage.
    objects[3]=!(objects[3]);
    objects[0]=!(objects[0]);
  }
  // We check if the input is valid.
  else if (!answer.equals("F") && !answer.equals("W") && !answer.equals("S") && !answer.equals("C"))
    System.out.println("Please choose F, W, S, or C.");
  // We make sure that the farmer doesn't move something on the other side.
  else{
    System.out.print("The farmer can't move an object");
    System.out.println(" that is on the other side.");
  }
}
/**
* This function will print the position of the objects and the river.
* @param objects[] Array of 4 booleans.
* Objects are printed below/above the river based on whether the boolean is t/f.
*/
public static void printBoard(boolean objects[]){
  System.out.println();

  // This loop prints things above the river.
  for(int i=0; i<=3; i++){
    if (!(objects[i])){
      if (i==0)
        System.out.print("Farmer ");
      if (i==1)
        System.out.print("Wolf ");
      if (i==2)
        System.out.print("Sheep ");
      if (i==3)
        System.out.print("Cabbage ");
    }
  }
  System.out.println();
  System.out.println("----------------------------");
  System.out.println();
  System.out.println();
  System.out.println("----------------------------");

  // This loop prints thing below the river.
  for(int i=0; i<=3; i++){
    if (objects[i]){
      if (i==0)
        System.out.print("Farmer ");
      if (i==1)
        System.out.print("Wolf ");
      if (i==2)
        System.out.print("Sheep ");
      if (i==3)
        System.out.print("Cabbage ");
}
}
  System.out.println();
  System.out.println();
  if(!checkWin(objects) && !checkLoss(objects)){
    System.out.println("Choose and object to move.");
    System.out.print("F for farmer, W for wolf, S for sheep,");
    System.out.println(" and C for cabbage");
}
  else if(checkWin(objects)){
    System.out.println("You win!");
  }
  else if(checkLoss(objects)){
    System.out.println("You lose.");
  }
}

/**
* This function will check if all 3 objects are below the river.
* @param objects[] Array of 4 booleans.
* @return true if the user won, false if the user didn't win.
*/
public static boolean checkWin(boolean objects[]){
  return (objects[1]==objects[2] && objects[2]==objects[3] && objects[1]==true);
}
/**
* This function will check if the wolf is alone with the sheep or if the sheep is along with the cabbage.
* @param objects[] Array of 4 booleans.
* @return true if the user lost, false if the user didn't lose.
*/
public static boolean checkLoss(boolean objects[]){
  return ((objects[1]==objects[2] && objects[0]!=objects[1]) || (objects[2]==objects[3] && objects[0]!=objects[2]));
}
}
