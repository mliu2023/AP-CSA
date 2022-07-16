/**
* Abstract class to help assess the safety of a method of transportation by water.
* @author Max Liu
* @version 1.0
*/
public abstract class WaterSafety extends Transport{
  private int numberOfLifeJacket;
  private int numberOfLifeBoat;
  private int capacityOfLifeBoat;
  /**
  * This method constructs a method transportation involving water safety.
  * @param numOfTicketsSold The number of tickets that are sold.
  * @param farePerPerson The amount each ticket costs.
  * @param fireExtinguisher If there is a fire extinguisher or not.
  * @param numberOfLifeJacket The number of life jackets.
  * @param numberOfLifeBoat The number of life boats.
  * @param capacityOfLifeBoat The capacity of the life boats.
  */
  public WaterSafety(int numOfTicketsSold, double farePerPerson, boolean fireExtinguisher, int numberOfLifeJacket, int numberOfLifeBoat, int capacityOfLifeBoat){
    super(numOfTicketsSold, farePerPerson, fireExtinguisher);
    this.numberOfLifeJacket = numberOfLifeJacket;
    this.numberOfLifeBoat = numberOfLifeBoat;
    this.capacityOfLifeBoat = capacityOfLifeBoat;
  }
  /**
  * This method allows methods of transport involved with water safety to be printed.
  * @return # of tickets, fare, if there is a fire extinguisher, # of life jackets, # of lifeboats, and capacity of lifeboats.
  */
  public String toString(){
    String printWater = "";
    printWater += super.toString();
    printWater += "--" + numberOfLifeJacket + " lifejackets--";
    printWater += numberOfLifeBoat + " lifeboats--";
    printWater += "Capacity of life boats: " + capacityOfLifeBoat;
    return printWater;
  }
  /**
  * This method checks the safety involving lifejackets and lifeboats.
  * @return true if there are enough lifejackets and lifeboats, false otherwise.
  */
  public boolean checkSafety(){
    boolean enoughJackets = this.getNumTickets() <= numberOfLifeJacket;
    boolean enoughLifeboats = this.getNumTickets() <= numberOfLifeBoat*capacityOfLifeBoat;
    if(enoughJackets && enoughLifeboats && super.checkSafety()){
      return true;
    }
    else{
      return false;
    }
  }
}
