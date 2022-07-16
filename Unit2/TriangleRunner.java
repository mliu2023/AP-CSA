public class TriangleRunner
{
  public static void main(String[] args)
  {
    Triangle X = new Triangle(3,4,5,"blue",true);
    Triangle Y = new Triangle(3,7,8,"green",true);
    Triangle Z = new Triangle(1,1,10,"orange",false);
    Triangle A = new Triangle(3,4,5,"blue",true);
    System.out.println(X);
    System.out.println(Y);
    System.out.println(Z);
    System.out.println(X==A);
  }
}
