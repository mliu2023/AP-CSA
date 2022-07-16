public class SelfDivisor{
  public static boolean isSelfDivisor(int number){
    int digits = number;
    while(digits > 0){
      newDigit = digits % 10;
      if(newDigit == 0){
        return false;
      }
      else if(number % newDigit != 0){
        return false;
      }
      digits = digits / 10;
    }
    return true;
  }

  public static int[] firstNumSelfDivisors(int start, int num){
    int counter = 0;
    int i = start;
    int[] divisors = new int[num];
    while(counter < num){
      if(isSelfDivisor(i)){
        divisors[counter] = i;
        counter++;
      }
      i++;
    }
    return divisors;
  }
}
