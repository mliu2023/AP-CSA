public class CodeWordChecker implements StringChecker{

  private int min;
  private int max;
  private String s;

  public CodeWordChecker(int min, int max, String s){
    this.min = min;
    this.max = max;
    this.s = s;
  }

  public CodeWordChecker(String s){
    min = 6;
    max = 20;
    this.s = s;
  }

  public boolean isValid(String str){
    return(str.length()>= min && str.length()<=max && str.indexOf(s)==-1);
  }
}
