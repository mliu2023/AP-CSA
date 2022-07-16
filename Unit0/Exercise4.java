public class Exercise4{
  public static void main(String[] args){
    System.out.println(hasDigit("abasda;alksdfj;lkj;alskdjf"));
    System.out.println(isPalindrome("707"));
    System.out.println(isPalindromeRecursion("707"));
  }

  public static boolean hasDigit(String s){
    String a=s.substring(1);
    String b=s.substring(0,1);

    if(s.length()==1){
      if(s.compareTo("9")>0 || s.compareTo("0")<0)
        return false;}

    else{
      return(hasDigit(a) || hasDigit(b));}
    return true;}

    public static boolean hasDigitRecursion(String s){
      int i=s.length();
      for(int j=0; j<i; j++){
        char x=s.charAt(j);
        int a=(int)x;
        if (a>=48 && a<=57)
          return true;
      }
    return false;
    }

    public static boolean isPalindrome(String s){
      int i=s.length();
      for(int j=0; j<=i/2; j++){
        char x=s.charAt(j);
        char y=s.charAt(i-j-1);
        if(x!=y)
          return false;
      }
      return true;
    }

    public static boolean isPalindromeRecursion(String s){
      int i=s.length();
      if(i<2)
        return true;
      else{
        String x=s.substring(0,1);
        String y=s.substring(i-1,i);
        return(x.equals(y) && isPalindrome(s.substring(1,i-1)));
      }

    }

}
