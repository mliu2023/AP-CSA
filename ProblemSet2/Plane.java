/**
* Class to create a plane.
* @author Max Liu
* @version 1.0
*/
public class Plane extends Air{
  /**
  * This method constructs a plane.
  * @param numOfTicketsSold The number of tickets that are sold.
  * @param farePerPerson The amount each ticket costs.
  * @param fireExtinguisher If there is a fire extinguisher or not.
  * @param numberOfLifeJacket The number of life jackets.
  * @param numberOfLifeBoat The number of life boats.
  * @param capacityOfLifeBoat The capacity of the life boats.
  */
  public Plane(int numOfTicketsSold, double farePerPerson, boolean fireExtinguisher, int numberOfLifeJacket, int numberOfLifeBoat, int capacityOfLifeBoat){
    super(numOfTicketsSold, farePerPerson, fireExtinguisher, numberOfLifeJacket, numberOfLifeBoat, capacityOfLifeBoat);
  }
  /**
  * This constructor takes in the number of tickets and the cost per ticket.
  * @param numOfTicketsSold The number of tickets that are sold.
  * @param farePerPerson The amount each ticket costs.
  */
  public Plane(int numOfTicketsSold, double farePerPerson){
    super(numOfTicketsSold, farePerPerson, false, 0, 0, 0);
  }
  /**
  * This method allows a plane to be printed.
  * @return # of tickets, fare, if there is a fire extinguisher, # of life jackets, # of lifeboats, and capacity of life boats.
  */
  public String toString(){
    return "Plane" + super.toString();
  }
  /**
  * This method checks the safety of a plane.
  * @return true if it is safe, false otherwise.
  */
  public boolean checkSafety(){
    if(super.checkSafety()){
      return this.getNumTickets() <= PLANECAPACITY;
    }
    else{
      return false;
    }
  }
}
