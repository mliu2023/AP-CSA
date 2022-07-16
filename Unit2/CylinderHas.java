public class CylinderHas{
  private double height;
  private Circle o;

  public CylinderHas(Circle o, double height){
    this.o = o;
    this.height = height;
  }
  public CylinderHas(double r, double height){
    Circle x = new Circle(r);
    this.o = x;
    this.height = height;
  }
  public double getHeight(){return height;}
  public Circle getCircle(){return o;}

  public void setHeight(double height){this.height = height;}
  public void setCircle(Circle o){this.o = o;}

  public double surfaceArea(){
    double x = o.getR();
    return 2*x*x*Math.PI+2*x*Math.PI*height;
  }

  public double volume(){
    double x = o.getR();
    return x*x*Math.PI*height;
  }

  public String toString(){
    return Double.toString(o.getR())+" "+Double.toString(height);
  }
}
