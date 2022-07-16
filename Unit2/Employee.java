public class Employee extends Person{
  private double salary;
  private int years;

  public Employee(String name, int age, double salary, int years){
    super(name, age);
    this.salary = salary;
    this.years = years;
  }
  public double getSalary(){return salary;}
  public int getYears(){return years;}

  public void setSalary(double salary){this.salary = salary;}
  public void setYears(int years){this.years = years;}

  public void increaseSalary(){
    this.salary = 1.1*this.salary;
  }

  public String toString(){
    return "Name: " + super.getName() + "\n" + "Age: " + Integer.toString(super.getAge()) + "\n" + "Salary: " +
    Double.toString(salary) + "\n" + "Years with Company: " + Integer.toString(years);
  }

}
