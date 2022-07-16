public class Hailstone{

  public static int hailstoneLength(int n){
    int counter = 1;
    while(n != 1){
      if(n%2 == 0){
        n = n/2;
      }
      else{
        n = 3n+1;
      }
      counter++;
    }
    return counter;
  }
  public static int isLongSeq(int n){
    int length = hailstoneLength(n);
    return(length > n);
  }

  public static double propLong(int n){
    int longSeq = 0;
    for(int i = 1; i <= n; i++){
      if(isLongSeq(i)){
        longSeq++;
      }
    }
    return (double)longSeq/n;
  }
}
