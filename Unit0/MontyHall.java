import java.util.Scanner;
public class MontyHall{
public static void main(String[] args){
game();
}
// This returns a door that isn't a or b.
// If the random number is equal to a or b, it picks another random number.
public static int revealDoor(int a, int b){
int reveal=(int)(Math.random()*3)+1;
while(reveal==a || reveal==b){
reveal=(int)(Math.random()*3)+1;
}
return reveal;
}

public static void game(){
Scanner keyboard=new Scanner(System.in);
// Randomly choose the car door:
int carDoor=(int)(Math.random()*3) + 1;
// We ask the user questions here:
System.out.println("Pick a door between 1 and 3: ");
int userDoor=keyboard.nextInt();
keyboard.nextLine();
// This door is revealed.
int showDoor=revealDoor(userDoor, carDoor);
System.out.println("Door " + showDoor + " has a goat.");
System.out.println("Do you want to switch? (yes or no)");
String answer=keyboard.nextLine();

if(answer.equals("yes")){
// revealDoor(showDoor, userDoor) chooses a door that isn't showDoor or userDoor.
int changeDoor=revealDoor(showDoor, userDoor);
if(changeDoor==carDoor){
System.out.println("You win!");
}
else{
System.out.println("You lose!");
}
}

if(answer.equals("no")){

if(userDoor==carDoor){
System.out.println("You win!");
}
else{
System.out.println("You lose!");
}
}

}
}
