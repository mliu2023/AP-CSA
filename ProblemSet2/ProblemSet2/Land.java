/**
* Class with functionalities for land methods of transport.
* @author Max Liu
* @version 1.0
*/
public abstract class Land extends Transport{
  /**
  * Constructor for a land method of transportation.
  * @param numOfTicketsSold The number of tickets that are sold.
  * @param farePerPerson The amount each ticket costs.
  * @param fireExtinguisher If there is a fire extinguisher or not.
  */
  public Land(int numOfTicketsSold, double farePerPerson, boolean fireExtinguisher){
    super(numOfTicketsSold, farePerPerson, fireExtinguisher);
  }
  /**
  * This method checks the safety of the method of transportation.
  * @return true if it is safe, false otherwise.
  */
  public boolean checkSafety(){
    return super.checkSafety();
  }
  /**
  * This method allows a land transportation to be printed.
  * @return # of tickets, fare, and if there is a fire extinguisher.
  */
  public String toString(){
    return super.toString();
  }
}
