public class GameSpinner{

  private int sides;
  private ArrayList<Integer> spins;

  public GameSpinner(int sides){
    this.sides = sides;
    spins = new ArrayList<Integer>();
  }

  public int spin(){
    return (int)(Math.random()*sides+1);
  }

  public int currentRun(){
    if(spins.size() == 0){
      return 0;
    }
    int counter = 1;
    for(int i = spins.size()-2; i>=0; i--){
      if(spins.get(i) == spins.get(spins.size()-1)){
        counter++;
      }
    }
    return counter;
  }
}
