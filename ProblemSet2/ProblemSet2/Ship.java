/**
* Class to create a ship.
* @author Max Liu
* @version 1.0
*/
public class Ship extends Sea{
  /**
  * This method constructs a ship.
  * @param numOfTicketsSold The number of tickets that are sold.
  * @param farePerPerson The amount each ticket costs.
  * @param fireExtinguisher If there is a fire extinguisher or not.
  */
  public Ship(int numOfTicketsSold, double farePerPerson, boolean fireExtinguisher){
    super(numOfTicketsSold, farePerPerson, fireExtinguisher, 0, 0, 0);
  }
  /**
  * This method allows a ship to be printed.
  * @return # of tickets, fare, and if there is a fire extinguisher.  None of everything else.
  */
  public String toString(){
    return "Ship" + super.toString();
  }
  /**
  * This method checks whether a ship is safe or not.
  * @return true if it is safe, false otherwise.
  */
  public boolean checkSafety(){
    if(super.checkSafety()){
      return this.getNumTickets() <= SHIPCAPACITY;
    }
    else{
      return false;
    }
  }
}
