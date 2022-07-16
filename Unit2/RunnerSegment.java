public class RunnerSegment
{
  public static void main(String[] args)
  {
    Point p2 = new Point(3, 10, "A");
    Point p3 = new Point(5, 1, "B");

    Segment S = new Segment(p2, p3);
    System.out.println("Segment: " + S);
  }
}
