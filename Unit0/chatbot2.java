import java.util.Scanner;
public class chatbot2
{
public static void main(String[] args)
{
Scanner keyboard=new Scanner(System.in);
System.out.print("Enter your name: ");
String name=keyboard.nextLine();
System.out.println("Hello " + name + "!  How are you doing?");
String answer=keyboard.nextLine();
System.out.println("I'm glad that you're are doing " + answer + ".");
System.out.print("How old are you? ");
int age=keyboard.nextInt();
keyboard.nextLine();
if (age<5){
  System.out.println("Hi kid!");
}
else if (age<=25){
  System.out.println("Where do you go to school?");
}
else{
  System.out.println("What college did you go to?");
}
String topic=keyboard.nextLine();

while (!topic.equals("bye")){

System.out.print("What would you like to talk about? ");
topic=keyboard.nextLine();

if (topic.equals("Weather")){
  System.out.println("It is cloudy today.");
}
if (topic.equals("Fortnite")||topic.equals("fortnite")){
  System.out.println("Fortnite has released the 10.30 patch notes.");
}
if (topic.equals("Movies")){
  System.out.println("My favorite movie is End Game.");
}
if (topic.equals("School")){
  System.out.println("Pingry is the best school!");
}
if (topic.equals("Memes")){
  System.out.println("do u kno da wae");
}



}
}
}
