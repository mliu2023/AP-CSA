/**
* Class to create a point in space.
* @author Max Liu
* @version 1.0
*/

public class Point
{
  // fields
  private int x;
  private int y;
  private String name;
  private static int numPoints = 0;

  public Point(){this(0,0,"O");}
  public Point(int a, int b){this(a,b,"A");}
  public Point(int x, int y, String s)
  {
    this.x = x;
    this.y = y;
    name = s;
    numPoints++;
  }

  public int getX() {return x;}
  public int getY() {return y;}
  public String getName() {return name;}
  public static int getNumPoints() {return numPoints;}

  public void setX(int a) {x = a;}
  public void setY(int b) {y = b;}
  public void setName(String s) {name = s;}

  // distance from point
  public double distanceFromPoint(Point other)
  {
    double dx = this.x - other.x;
    double dy = this.y - other.y;
    double dist = Math.sqrt(dx*dx+dy*dy);
    return dist;
  }

  public String toString()
  {
    return name + "(" + x + "," + y + ")";
  }

  public boolean equals(Point other)
  {
    return x == other.x && y == other.y;
  }
}
