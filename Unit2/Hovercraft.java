// The Hovercraft class
public class Hovercraft implements IsLandVehicle, IsSeaVessel
{
  // Fields
  private String name;
  private int    maxPassengers;
  private int    maxSpeed;
  private int    numWheels;
  private int    displacement;

  // Constructor
  public Hovercraft(String aName)
  {
    name          = aName;
    maxPassengers = 40;
    maxSpeed      = 30;
    numWheels     = 0;
  }

  // IsVehicle methods
  public String getName() {return name;}
  public void setName(String aName) {name = aName;}
  public int getMaxPassengers() {return maxPassengers;}
  public void setMaxPassengers(int aMaxPassengers) {maxPassengers = aMaxPassengers;}
  public int getMaxSpeed() {return maxSpeed;}
  public void setMaxSpeed(int aMaxSpeed) {maxSpeed = aMaxSpeed;}

  // IsLandVehicle methods
  public int getNumWheels() {return numWheels;}
  public void setNumWheels(int aNumWheels) {numWheels = aNumWheels;}
  public void drive() {System.out.println("Brmmm Brmmm!");}

  // IsSeaVessel methods
  public int getDisplacement() {return displacement;}
  public void setDisplacement(int aDisplacement) {displacement = aDisplacement;}
  public void launch() {System.out.println("Hovercraft launched!");}

  // Hovercraft methods
  public void enterLand() {System.out.println("Hovercraft now travelling on land!");}
  public void enterSea() {System.out.println("Hovercraft now travelling on the sea!");}
}
