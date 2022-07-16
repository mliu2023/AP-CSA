public class StepTracker{
  private int minSteps;
  private ArrayList<Integer> stepArr = new ArrayList<Integer>();

  public StepTracker(int minSteps){
    this.minSteps = minSteps;
  }
  public void addDailySteps(int steps){
    stepArr.add(steps);
  }
  public int activeDays(){
    int counter = 0;
    for(int i = 0; i < stepArr.size(); i++){
      if(stepArr.get(i) >= minSteps){
        counter++;
      }
    }
    return counter;
  }
  public double averageSteps(){
    if(stepArr.size() == 0){
      return 0;
    }
    else{
      int total = 0;
      for(int i = 0; i < stepArr.size(); i++){
        total += stepArr.get(i);
      }
      return (double)total/stepArr.size();
    }
  }
}
