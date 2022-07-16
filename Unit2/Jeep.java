// The Jeep class
class Jeep implements IsLandVehicle
{
  // Fields
  private String name;
  private int    maxPassengers;
  private int    maxSpeed;
  private int    numWheels;

  // Constructor
  public Jeep(String aName)
  {
    name = aName;
    maxPassengers = 5;
    maxSpeed      = 180;
  }

  // IsVehicle methods
  public String getName() {return name;}
  public void setName(String aName) {name = aName;}
  public int getMaxPassengers() {return maxPassengers;}
  public void setMaxPassengers(int aMaxPassengers) {maxPassengers = aMaxPassengers;}
  public int getMaxSpeed() {return maxSpeed;}
  public void setMaxSpeed(int aMaxSpeed) {maxSpeed = aMaxSpeed;}

  // IsLandVehicle methods
  public void drive() {System.out.println("Jeep driving!");}

  // Jeep methods
  public void soundHorn() {System.out.println("Honk Honk!");}

  public int getNumWheels(){return 4;}
  public void setNumWheels(int n){numWheels = 4;}
}
