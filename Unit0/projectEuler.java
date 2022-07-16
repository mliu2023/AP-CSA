public class projectEuler{
  public static void main(String[] args){
    System.out.println(sumfib());
  }
  public static int fib(int n){
    if(n<=1)
      return 1;
    return fib(n-1)+fib(n-2);
  }
  public static int sumfib(){
    int total=0;
    int n=0;
    while (fib(n)<=4000000){
      if(fib(n)%2==0)
        total+=fib(n);
      n+=1;
    }
    return total;
  }
}
