public class PracticeQuiz3{
  public static void main(String[] args){
    System.out.println(interlaceStrings("1234", "abcd"));
    System.out.println(countChar("c", "accceedc"));
    System.out.println(countChar("a", "accceedc"));
    triangularPattern(3);
    triangularPattern(4);
    triangularPattern(5);
  }
  public static String interlaceStrings(String a, String b){
    String str="";
    int counter=0;
    while(b.length()>0){
      if(counter%2==0){
        str+=a.substring(0,1);
        a=a.substring(1);
        counter++;
      }
      else{
        str+=b.substring(0,1);
        b=b.substring(1);
        counter++;
      }
    }
    return str;
  }
  public static int countChar(String a, String s){
    int k=s.indexOf(a);
    if(k<0)
      return 0;
    else
        return 1+countChar(a, s.substring(k+1));
  }
  public static void triangularPattern(int n){
    for(int i=1; i<=n; i++){
      for(int j=1; j<=i; j++){
        if(j%2==0)
          System.out.print("$");
        else
          System.out.print("#");
      }
      System.out.println();
    }
  }
}
