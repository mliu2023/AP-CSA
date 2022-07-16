/**
* Class to create a triangle.
* @author Max Liu
* @version 1.0
*/
public class Triangle
{
  // fields
  private double a;
  private double b;
  private double c;
  private String color;
  private boolean isTriangle;

/**
 * Constructor to create a triangle using all parameters.
 * @param a The sidelength of the first side of the triangle.
 * @param b The sidelength of the second side of the triangle.
 * @param c The sidelength of the third side of the triangle.
 * @param color The color of the triangle.
 * @param isTriangle true if the sidelengths are a triangle, false if not
 */
  public Triangle(double a, double b, double c, String color, boolean isTriangle)
  {
    this.a = a;
    this.b = b;
    this.c = c;
    this.color = color;
    this.isTriangle = isTriangle;
  }
/**
 * This constructs a triangle given three sidelengths.
 * @param a The first sidelength.
 * @param b The second sidelength.
 * @param c The third sidelength.
 * The Triangle is automatically black and isTriangle is set to false.
 */
  public Triangle(double a, double b, double c) {this(a,b,c,"black", false);}

  public double getA() {return a;}
  public double getB() {return b;}
  public double getC() {return c;}
  public String getColor() {return color;}
  public boolean getIsTriangle() {return isTriangle;}

  public void setA(int a) {this.a = a;}
  public void setB(int b) {this.b = b;}
  public void setC(int c) {this.c = c;}
  public void setColor(String color) {this.color = color;}
  public void setIsTriangle(boolean isTriangle) {this.isTriangle = isTriangle;}

/**
* This method determines whether a triangle exists with sides a,b, and c.
*/
  public boolean isTriangle()
  {
    if(a>=b){
      if(c<=a){
        return a>(b+c);
      }
      else{
        return c>(a+b);
      }
    }
    else{
      if(c>=b){
        return c>(a+b);
      }
      else{
        return b>(a+c);
      }
    }
  }
/**
* This method calculates the area of the triangle.
* @return The area.
*/
  public int calcArea()
  {
    return 0;
  }
/**
* This method allows the runner to print a triangle.
* @return The lengths as an ordered triple, along with the color and isTriangle.
*/
  public String toString()
  {
    return "(" + a + ", " + b + ", " + c + "), " + color + ", " + isTriangle;
  }

/**
* This method tests whether a triangle's lengths are equal to another triangle.
* @param other The other triangle.
*/
  public boolean equals(Triangle other)
  {
    return (this.a==other.getA() && this.b==other.getB() && this.c==other.getC());
  }
}
