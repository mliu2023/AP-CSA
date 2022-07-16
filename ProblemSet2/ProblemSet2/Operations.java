import java.util.ArrayList;
/**
* Class to create an arraylist of operations.
* @author Max Liu
* @version 1.0
*/
public class Operations{
  private ArrayList<Safety> transportOperations;
  /**
  * Constructor for operations.
  * @param transportOperations The transport operations in an arraylist.
  */
  public Operations(ArrayList<Safety> transportOperations){
    this.transportOperations = transportOperations;
  }
  /**
  * This method returns all the safe operations in an arraylist.
  * @return An arraylist with all the safe operations.
  */
  public ArrayList<Safety> getSafeOperations(){
    ArrayList<Safety> safeOperations = new ArrayList<Safety>();
    for(int i = 0; i < transportOperations.size(); i++){
      if(transportOperations.get(i).checkSafety()){
        safeOperations.add(transportOperations.get(i));
      }
    }
    return safeOperations;
  }
  /**
  * This method finds the total revenue of all safe operations in the arraylist.
  * @return The total revenue of all safe operations.
  */
  public double totalRevenue(){
    ArrayList<Safety> safe = this.getSafeOperations();
    double total = 0;
    for(int i = 0; i < safe.size(); i++){
      total += safe.get(i).revenue();
    }
    return total;
  }
  /**
  * This method returns the total revenue of all safe land operations in the transportOperations.
  * @return the total revenue of all safe land operations.
  */
  public double totalLandRevenue(){
    ArrayList<Safety> safe = this.getSafeOperations();
    double total = 0;
    for(int i = 0; i < safe.size(); i++){
      if(safe.get(i) instanceof Land){
        total += safe.get(i).revenue();
      }
    }
    return total;
  }
  /**
  * This method returns the total revenue of all safe air operations in the transportOperations.
  * @return the total revenue of all safe air operations.
  */
  public double totalAirRevenue(){
    ArrayList<Safety> safe = this.getSafeOperations();
    double total = 0;
    for(int i = 0; i < safe.size(); i++){
      if(safe.get(i) instanceof Air){
        total += safe.get(i).revenue();
      }
    }
    return total;
  }
  /**
  * This method returns the total revenue of all safe sea operations in the transportOperations.
  * @return the total revenue of all safe sea operations.
  */
  public double totalSeaRevenue(){
    ArrayList<Safety> safe = this.getSafeOperations();
    double total = 0;
    for(int i = 0; i < safe.size(); i++){
      if(safe.get(i) instanceof Sea){
        total += safe.get(i).revenue();
      }
    }
    return total;
  }
}
