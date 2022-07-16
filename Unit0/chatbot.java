import java.util.Scanner;
public class chatbot
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
String answer2=keyboard.nextLine();


}
}
