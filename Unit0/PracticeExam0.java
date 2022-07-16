public class PracticeExam0{
  public static void main(String[] args){
    System.out.println(convertName("von Neumann,John"));
    System.out.println(addNums("faz31qr0hn8"));
    System.out.println(pairStar("Skitt**les__ftw"));
    System.out.println(howMany(1238834888, 8));

  }
  public static String convertName(String name){
    int index=name.indexOf(",");
    String first=name.substring(index+1);
    String last=name.substring(0, index);
    return first + " " + last;
  }
  public static int addNums(String s){
    int counter=0;
    for(int i=0; i<s.length(); i++){
      String c=s.substring(i,i+1);
      String a="0123456789";
      int index=a.indexOf(c);
      if (index>=0)
        counter+=index;
      }
      return counter;
  }
  public static String pairStar(String s){
    for(int i=0; i<s.length()-1; i++){
      if(s.substring(i,i+1).equals(s.substring(i+1,i+2))){
        s=s.substring(0,i+1) + "*" + s.substring(i+1);
        i++;
      }
    }
    return s;
  }
  public static int howMany(int n, int digit){
    int counter=0;
    if(n==0 && digit==0)
      return 1;
    while(n>0){
      if(n%10==digit){
        counter++;
      }
      n=n/10;
    }
    return counter;
  }
}
