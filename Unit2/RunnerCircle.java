public class RunnerCircle{
  public static void main(String[] args){
    Circle o = new Circle(5);
    System.out.println(o);
    System.out.println(o.area());
    CylinderHas c = new CylinderHas(o, 10);
    System.out.println(c);
    System.out.println(c.volume());
    CylinderIs d = new CylinderIs(o, 10);
    System.out.println(d);
  }
}
