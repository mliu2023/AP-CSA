public class FrogSimulation{

  public boolean simulate(){
    int position = 0;
    int hops = 0;
    while(position < goalDistance && hops < maxHops && position >= 0){
      position += hopDistance();
      hops++;
    }
    if(position < 0 || hops == maxHops){
      return false;
    }
    return true;
  }

  public double numSimulations(int num){
    int pass = 0;
    for(int i = 0; i < num; i++){
      if(simulate()){
        pass++;
      }
    }
    return (double)pass/num;
  }
}
