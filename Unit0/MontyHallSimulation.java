import java.util.Scanner;
public class MontyHallSimulation{
public static void main(String[] args){
// These questions ask the user what to do in the simulation.
Scanner keyboard=new Scanner(System.in);
System.out.println("How many times should the simulation run?");
int condition1=keyboard.nextInt();
int condition2=(int)(Math.random()*3+1);

// This takes in the two conditions and runs the game a certain number of times and choosing a random door.
game(condition1, condition2);
}

// revealDoor(int a, int b) randomly chooses a door that isn't a or b.
// If a or b is chosen, then another random number will be chosen until it isn't a or b.
public static int revealDoor(int a, int b){
int reveal=(int)(Math.random()*3)+1;
while(reveal==a || reveal==b){
reveal=(int)(Math.random()*3)+1;
}
return reveal;
}

// game function takes in number of simulations and which door to pick first.
public static void game(int numberOfTimes, int userDoor){
int wins1=0;
int losses1=0;
int wins2=0;
int losses2=0;
while(numberOfTimes>0){
int carDoor=(int)(Math.random()*3) + 1;
int changeDoor=revealDoor(revealDoor(userDoor, carDoor), userDoor);
if (carDoor==changeDoor){
wins1++;
}
else{
losses1++;
}
if (carDoor==userDoor){
wins2++;
}
else{
losses2++;
}
numberOfTimes--;
}
System.out.println("Number of wins when switching: " + wins1);
System.out.println("Number of losses when switching: " + losses1);
System.out.println("Probability of winning when switching: " + ((double)wins1/(double)(wins1+losses1)));
System.out.println();
System.out.println("Number of wins when not switching: " + wins2);
System.out.println("Number of losses when not switching: " + losses2);
System.out.println("Probability of winning when not switching: " + ((double)wins2/(double)(wins2+losses2)));
}
}
