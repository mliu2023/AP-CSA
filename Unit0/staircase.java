import java.util.Scanner;
public class staircase{
public static void main(String[] args){

Scanner keyboard=new Scanner(System.in);
System.out.println("Enter the length of the triangle: ");
int n=keyboard.nextInt();
for(int i=0;i<n; i++){
for(int j=0;j<=i; j++){
System.out.print("*");
}
System.out.println();
}
System.out.println("Enter the length of the inverted triangle: ");
keyboard.nextLine();
int m=keyboard.nextInt();
for(int a=0;a<m; a++){
for(int b=m;b>a; b--){
System.out.print("*");
}
System.out.println();
}

}
}
