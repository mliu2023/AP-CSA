/**
* Class to create a train.
* @author Max Liu
* @version 1.0
*/
public class Train extends Land{
  /**
  * Constructor for a train.
  * @param numOfTicketsSold The number of tickets that are sold.
  * @param farePerPerson The amount each ticket costs.
  * @param fireExtinguisher If there is a fire extinguisher or not.
  */
  public Train(int numOfTicketsSold, double farePerPerson){
    super(numOfTicketsSold, farePerPerson, false);
  }
  /**
  * This method allows a train to be printed.
  * @return # of tickets, fare, and if there is a fire extinguisher.
  */
  public String toString(){
    return "Train" + super.toString();
  }
  /**
  * This method checks if a train is safe or not.
  * @return true if it is safe, false otherwise.
  */
  public boolean checkSafety(){
    if(super.checkSafety()){
      return this.getNumTickets() <= TRAINCAPACITY;
    }
    else{
      return false;
    }
  }
}
