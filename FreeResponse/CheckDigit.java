public class CheckDigit{


  public static boolean isValid(int numWithCheckDigit){
    int num = numWithCheckDigit/10;
    return(getCheck(num)==numWithCheckDigit%10)
  }

  // We need a variable that keeps track of how many invalid check digits there have been.
  // This variable could be private int counter.
  // We need to check if the check digit is invalid.  if(getCheck(num)!=numWithCheckDigit%10),
  // then we increment counter by 1.
  // We should add a constructor for this class to initialize counter to 0.

}
