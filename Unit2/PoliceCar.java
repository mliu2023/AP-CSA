public class PoliceCar implements isEmergency
{
  private String name;
  private int maxPassengers;
  private int maxSpeed;
  private int numWheels;
  public PoliceCar(String name, int maxPassengers, int maxSpeed){
    this.name = name;
    this.maxPassengers = maxPassengers;
    this.maxSpeed = maxSpeed;
  }
  public PoliceCar(String name){
    this.name = name;
    maxPassengers = 4;
    maxSpeed = 160;
  }
  public String getName(){return name;}
  public int getMaxPassengers(){return maxPassengers;}
  public int getMaxSpeed(){return maxSpeed;}
  public int getNumWheels(){return numWheels;}

  public void setName(String name){this.name = name;}
  public void setMaxPassengers(int maxPassengers){this.maxPassengers = maxPassengers;}
  public void setMaxSpeed(int maxSpeed){this.maxSpeed = maxSpeed;}
  public void setNumWheels(int numWheels){this.numWheels = numWheels;}

  public void soundSiren(){
    System.out.println("wee woo!");
  }

  public void drive(){
    System.out.println("Driving...");
  }
  public void giveTicket(int n){
    System.out.println("Ticket: " + n);
  }

}
