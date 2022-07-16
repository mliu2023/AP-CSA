// The IsVehicle interface
interface IsVehicle
{
  String getName();
  void   setName(String aName);
  int    getMaxPassengers();
  void   setMaxPassengers(int aMaxPassengers);
  int    getMaxSpeed();
  void   setMaxSpeed(int aMaxSpeed);
}

// The IsLandVehicle interface
interface IsLandVehicle extends IsVehicle
{
  int  getNumWheels();
  void setNumWheels(int aNumWheels);
  void drive();
}

// The IsSeaVessel interface
interface IsSeaVessel extends IsVehicle
{
  int  getDisplacement();
  void setDisplacement(int aDisplacement);
  void launch();
}

interface isEmergency extends IsLandVehicle
{
  void soundSiren();
}

public class Runner
{
  public static void main(String[] args)
  {
    IsVehicle[] myArray = new IsVehicle[5];

    myArray[0] = new Jeep("Fred's Jeep");
    myArray[1] = new Jeep("Frank's Jeep");
    myArray[2] = new Hovercraft("Sue's Hovercraft");
    myArray[3] = new Frigate("Money Waster");
    myArray[4] = new PoliceCar("Police Car", 4, 150);

    for (int i = 0; i < myArray.length; i++)
    {
      System.out.println(myArray[i].getName());
      if (myArray[i] instanceof IsLandVehicle)
      {
        IsLandVehicle lv = (IsLandVehicle)myArray[i];
        lv.drive();
        System.out.println("Number of wheels: " + lv.getNumWheels());
      }
      if (myArray[i] instanceof IsSeaVessel)
      {
        IsSeaVessel sv = (IsSeaVessel)myArray[i];
        sv.launch();
        System.out.println("Displacement: " + sv.getDisplacement());
      }
      if (myArray[i] instanceof PoliceCar)
      {
        ((isEmergency)myArray[i]).soundSiren();
      }
    }

  }
}
