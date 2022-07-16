public class CylinderIs extends Circle{
  private double height;

  public CylinderIs(Circle c, double height){
    super(c.getR());
    this.height = height;
  }
  public CylinderIs(double r, double height){
    super(r);
    this.height = height;
  }
  public double getHeight(){return height;}
  public void setHeight(double height){this.height = height;}

  public double surfaceArea(){
    return 2*super.area()+super.perimeter()*height;
  }
  public double volume(){
    return super.area()*height;
  }
  public String toString(){
    return Double.toString(super.getR())+" "+Double.toString(height);
  }
}
