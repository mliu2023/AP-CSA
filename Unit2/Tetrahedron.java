/**
* Class to create a tetrahedron.
* @author Max Liu
* @version 1.0
*/

public class Tetrahedron
{
  // fields
  private Triangle t1;
  private double d;
  private double e;
  private double f;
  private String color;
  private boolean isTetrahedron;

/**
* Constructor to create a tetrahedron using a triangle and 3 lengths.
* @param t1 The triangle that is the base of the tetrahedron.
* @param d The length of an edge that connects to a vertex of the triangle.
* @param e The length of an edge that connects to a vertex of the triangle.
* @param f The length of an edge that connects to a vertex of the triangle.
*/
  public Tetrahedron(Triangle t1, double d, double e, double f, boolean isTetrahedron)
  {
    this.t1 = t1;
    this.d = d;
    this.e = e;
    this.f = f;
    this.color = t1.getColor();
    this.isTetrahedron = isTetrahedron;
  }
/**
* Constructor to create a tetrahedron with sidelengths of 1.
*/
  public Tetrahedron(){this(new Triangle(1,1,1),1,1,1,true);}

  // Accessors
  public Triangle getTriangle() {return t1;}
  public double getD() {return d;}
  public double getE() {return e;}
  public double getF() {return f;}
  public String getColor() {return color;}
  public boolean getIsTetrahedron() {return isTetrahedron;}

  // Modifiers
  public void setTriangle(Triangle t1) {this.t1 = t1;}
  public void setD(double d) {this.d = d;}
  public void setE(double e) {this.e = e;}
  public void setF(double f) {this.f = f;}
  public void setColor(String color) {this.color = color;}
  public void setIsTetrahedron(boolean isTetrahedron) {this.isTetrahedron = isTetrahedron;}

/**
* This method determines whether the tetrahedron exists with the lengths d,e,f and t1.
* @return true or false.
*/
  public boolean isTetrahedron()
  {
    return false;
  }
/**
* This method calculates the area of a tetrahedron.
* @return the area.
*/
  public int calcArea()
  {
    return 0;
  }
/**
* This method allows a runner to print the tetrahedron.
* @return All the lengths with the color and isTetrahedron.
*/
  public String toString()
  {
    return color + "(" + t1.getA() + "," + t1.getB() + "," + t1.getC() +
    "," + d + "," + e + "," + f + ") " + isTetrahedron;
  }

/**
* This method tests whether a tetrahedron is equal to another tetrahedron.
* @return true if they are the same, false if not.
*/
  public boolean equals(Tetrahedron other)
  {
    return (color.equals(other.color) && d == other.d && e == other.e && f == other.f
    && t1.equals(other.t1));
  }
}
