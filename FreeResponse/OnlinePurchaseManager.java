public class OnlinePurchaseManager{

  private ArrayList<Gizmo> purchases;

  public int countElectronicsByMaker(String maker){
    int counter = 0;
    for(int i = 0; i < purchases.size(); i++){
      if(purchases.get(i).isElectronic() && purchases.get(i).getMaker().equals(maker)){
        counter++;
      }
    }
  }

  public boolean hasAdjacentEqualPair(){
    for(int i = 0; i < purchases.size()-1; i++){
      if(purchases.get(i).equals(purchases.get(i+1))){
        return true;
      }
    }
    return false;
  }

  /**
  * Returns the cheapest Gizmo made by a given maker in purchases.
  */
  public Gizmo getCheapestGizmoByMaker(String maker){

  }
  // There would need to be a private double price variable in class Gizmo
  // which stores the price of the Gizmo so we can compare prices of different
  // Gizmos.
  // The Gizmo constructor would also have to take in the price as a parameter to initialize the private double price variable.
}
