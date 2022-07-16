/**
* Class to create a bus.
* @author Max Liu
* @version 1.0
*/
public class Bus extends Land{
  /**
  * Constructor for a bus.
  * @param numOfTicketsSold The number of tickets that are sold.
  * @param farePerPerson The amount each ticket costs.
  * @param fireExtinguisher If there is a fire extinguisher or not.
  */
  public Bus(int numOfTicketsSold, double farePerPerson, boolean fireExtinguisher){
    super(numOfTicketsSold, farePerPerson, fireExtinguisher);
  }
  /**
  * This method allows a bus to be printed.
  * @return the number of tickets, fare per person, and whether there is a fire extinguisher.
  */
  public String toString(){
    return "Bus" + super.toString();
  }
  /**
  * This method checks if a bus is safe or not.
  * @return true if the bus is safe, false otherwise.
  */
  public boolean checkSafety(){
    if(super.checkSafety()){
      return this.getNumTickets() <= BUSCAPACITY;
    }
    else{
      return false;
    }
  }
}
