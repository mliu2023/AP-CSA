public class Segment
{
  // fields
  private Point p1;
  private Point p2;

  // constructors

  public Segment(Point p1, Point p2)
  {
    this.p1 = p1;
    this.p2 = p2;
  }
  public Segment()
  {
    this(new Point(), new Point(1,0));
  }

  // Accessors

  public Point getP1() {return p1;}
  public Point getP2() {return p2;}

  // Modifiers

  public void setP1(Point p) {p1 = p;}
  public void setP2(Point p) {p2 = p;}

  public String getName()
  {
    return p1.getName() + p2.getName();
  }

  public double getLength()
  {
    return p1.distanceFromPoint(p2);
  }

  public String toString()
  {
    return getName() + "[" + p1 + "," + p2 + "]";
  }
}
