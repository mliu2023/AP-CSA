import java.util.Scanner;
public class testing{
  public static void main(String[] args){
    Scanner keyboard=new Scanner(System.in);
    System.out.println("Choose the first number:");
    int a=keyboard.nextInt();
    keyboard.nextLine();
    System.out.println("Choose the sencond number:");
    int b=keyboard.nextInt();
    System.out.println(gcd(a, b));
  }
  public static int gcd(int a, int b){
    if(a==0){
      return 0;
    }
    else if(a==1)
      return 1;
    else if(b==1)
      return 1;
    else if(a>b){
      int n=a%b;
      return gcd(b, n);
    }
    else if (b>a){
      int n=b%a;
      return gcd(a, n);
    }
    else
      return a;
  }
}
