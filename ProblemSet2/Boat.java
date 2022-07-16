/**
* Class to create a boat.
* @author Max Liu
* @version 1.0
*/
public class Boat extends Sea{
  /**
  * This method constructs a boat.
  * @param numOfTicketsSold The number of tickets that are sold.
  * @param farePerPerson The amount each ticket costs.
  * @param fireExtinguisher If there is a fire extinguisher or not.
  * @param numberOfLifeJacket The number of life jackets.
  * @param numberOfLifeBoat The number of life boats.
  * @param capacityOfLifeBoat The capacity of the life boats.
  */
  public Boat(int numOfTicketsSold, double farePerPerson, boolean fireExtinguisher, int numberOfLifeJacket, int numberOfLifeBoat, int capacityOfLifeBoat){
    super(numOfTicketsSold, farePerPerson, fireExtinguisher, numberOfLifeJacket, numberOfLifeBoat, capacityOfLifeBoat);
  }
  /**
  * This constructor takes in the number of tickets and the cost per ticket.
  * @param numOfTicketsSold The number of tickets that are sold.
  * @param farePerPerson The amount each ticket costs.
  */
  public Boat(int numOfTicketsSold, double farePerPerson){
    super(numOfTicketsSold, farePerPerson, false, 0, 0, 0);
  }
  /**
  * This method allows a boat to be printed.
  * @return # of tickets, fare, if there is a fire extinguisher, # of life jackets, # of lifeboats, and capacity of life boats.
  */
  public String toString(){
    return "Boat" + super.toString();
  }
  /**
  * This method checks whether a boat is safe or not.
  * @return true if it is safe, false otherwise.
  */
  public boolean checkSafety(){
    if(super.checkSafety()){
      return this.getNumTickets() <= BOATCAPACITY;
    }
    else{
      return false;
    }
  }
}
