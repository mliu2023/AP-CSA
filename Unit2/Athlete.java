/**
* Class to create an athlete.
* @author Max Liu
* @version 1.0
*/
public class Athlete extends Person{
  // fields
  private double speed;
  private String sport;
/**
* Constructor for an athlete that takes in all arguments.
* @param name The name of the athlete.
* @param weight The weight of the athlete.
* @param height The height of the athlete.
* @param speed The athlete's speed.
* @param sport The sport that the athlete plays.
*/
  public Athlete(String name, double weight, double height, double speed, String sport){
    super(name, weight, height);
    this.speed = speed;
    this.sport = sport;
  }
/**
* No-args constructor for an athlete.
* The athlete is named Bob, weight is 78.5kg, height is 1.9m, speed is 1.5km/hr, sport is soccer.
*/
  public Athlete(){
    super();
    this.speed = 1.5;
    this.sport = "Soccer";
  }
  // accessors
  public double getSpeed(){return speed;}
  public String getSport(){return sport;}
  // modifiers
  public void setSpeed(double speed){this.speed = speed;}
  public void setSport(String sport){this.sport = sport;}
/**
* This method determines whether it is possible for someone to be a good athlete using BMI.
* @return true if it is possible, false otherwise.
*/
  public boolean isGoodAthlete(){
    double index = super.getBMI();
    return (index<30 && index>10);
  }
/**
* This method allows the user to print an athlete out.
* @return The name, weight, height, speed, and sport of the athlete.
*/
  public String toString(){
    return "Name: " + super.getName() + "\nWeight: " + super.getWeight() +
    "\nHeight: " + super.getHeight() + "\nSpeed: " + speed + "\nSport: " + sport;
  }
}
