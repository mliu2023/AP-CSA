public class TetrahedronRunner
{
  public static void main(String[] args)
  {
    Triangle m = new Triangle(1,1,1);
    Tetrahedron t = new Tetrahedron(m,3,3,3,true);
    Tetrahedron s = new Tetrahedron(m,2,2,2,true);
    Tetrahedron x = new Tetrahedron();
    System.out.println(t);
    System.out.println(x);
    System.out.println(t == s);
  }
}
