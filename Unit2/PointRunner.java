public class PointRunner
{
  public static void main(String[] args)
  {
    Point A = new Point(2, 1, "A");
    Point Origin = new Point();
    System.out.println(Origin);
    System.out.println(A);
    double d = A.distanceFromPoint(Origin);
    System.out.println(d);
    System.out.println(A.equals(Origin));
    System.out.println("We created " + Point.getNumPoints() + " points.");
  }
}
