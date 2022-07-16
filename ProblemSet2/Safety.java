/**
* Interface with a checkSafety method to check the safety of a means of transportation.
* @author Max Liu
* @version 1.0
*/
public interface Safety{
  public static final int BUSCAPACITY = 30;
  public static final int TRAINCAPACITY = 300;
  public static final int PLANECAPACITY = 150;
  public static final int HELICOPTERCAPACITY = 5;
  public static final int SHIPCAPACITY = 100;
  public static final int BOATCAPACITY = 20;
  /**
  * This is an abstract method which checks the safety of a method of transportation.
  * @return true if it is safe, false otherwise.
  */
  boolean checkSafety();
  /**
  * This is an abstract method which calculates the revenue of a method of transportation.
  * @return THe revenue.
  */
  double revenue();
}
