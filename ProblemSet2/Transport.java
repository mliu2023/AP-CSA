/**
* Abstract class to get details about a method transportation.
* @author Max Liu
* @version 1.0
*/
public abstract class Transport implements Safety{
  private int numOfTicketsSold;
  private double farePerPerson;
  private boolean fireExtinguisher;
  /**
  * Contructor for a method of transport.
  * @param numOfTicketsSold The number of tickets that are sold.
  * @param farePerPerson The amount each ticket costs.
  * @param fireExtinguisher If there is a fire extinguisher or not.
  */
  public Transport(int numOfTicketsSold, double farePerPerson, boolean fireExtinguisher){
    this.numOfTicketsSold = numOfTicketsSold;
    this.farePerPerson = farePerPerson;
    this.fireExtinguisher = fireExtinguisher;
  }
  /**
  * Returns the amount of revenue made from tickets.
  * @return price per ticket multiplied by the number of tickets sold.
  */
  public double revenue(){
    return (double)numOfTicketsSold*farePerPerson;
  }
  public int getNumTickets(){return numOfTicketsSold;}
  /**
  * This method allows a method of transport to be printed.
  * @return # of tickets, fare, and if there is a fire extinguisher.
  */
  public String toString(){
    String printTransport = "";
    printTransport += "(" + numOfTicketsSold + ")";
    printTransport += "--$" + farePerPerson;
    if(fireExtinguisher){
      printTransport += "--has fire extinguisher";
    }
    else{
      printTransport += "--no fire extinguisher";
    }
    return printTransport;
  }
  /**
  * This method checks if there is a fire extinguisher.
  * @return true if there is a fire extinguisher, false otherwise.
  */
  public boolean checkSafety(){
    if(fireExtinguisher){
      return true;
    }
    else{
      return false;
    }
  }
}
