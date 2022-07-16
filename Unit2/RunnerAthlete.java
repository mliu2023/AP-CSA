public class RunnerAthlete{
  public static void main(String[] args){
    Person p = new Person("Caleb", 80, 1.6);
    Athlete a = new Athlete();
    Athlete b = new Athlete("Leo", 75, 1.7, 3, "Basketball");
    System.out.println(p);
    System.out.println(a);
    System.out.println(b);
  }
}
