public class Circle{
  // fields
  private double r;

  // constructor
  public Circle(double r){
    this.r=r;
  }
  // accessor
  public double getR(){return r;}

  // modifier
  public void setR(int r){this.r=r;}

  public double perimeter(){
    return 2*r*Math.PI;
  }
  public double area(){
    return r*r*Math.PI;
  }
  public String toString(){
    return Double.toString(r);
  }
}
