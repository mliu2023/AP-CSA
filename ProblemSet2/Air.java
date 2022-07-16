/**
* Class with functionalities for air transportation.
* @author Max Liu
* @version 1.0
*/
public class Air extends WaterSafety{
  /**
  * This method constructs a method transportation involving air.
  * @param numOfTicketsSold The number of tickets that are sold.
  * @param farePerPerson The amount each ticket costs.
  * @param fireExtinguisher If there is a fire extinguisher or not.
  * @param numberOfLifeJacket The number of life jackets.
  * @param numberOfLifeBoat The number of life boats.
  * @param capacityOfLifeBoat The capacity of the life boats.
  */
  public Air(int numOfTicketsSold, double farePerPerson, boolean fireExtinguisher, int numberOfLifeJacket, int numberOfLifeBoat, int capacityOfLifeBoat){
    super(numOfTicketsSold, farePerPerson, fireExtinguisher, numberOfLifeJacket, numberOfLifeBoat, capacityOfLifeBoat);
  }
  /**
  * This method checks the safety of the method of transportation.
  * @return true if it is safe, false otherwise.
  */
  public boolean checkSafety(){
    return super.checkSafety();
  }
  /**
  * This method allows air transport to be printed.
  * @return # of tickets, fare, if there is a fire extinguisher, # of life jackets, # of lifeboats, and capacity of life boats.
  */
  public String toString(){
    return super.toString();
  }
}
