public class MultPractice implements StudyPractice{

  private int first;
  private int second;

  public MultPractice(int first, int second){
    this.first = first;
    this.second = second;
  }

  public String getProblem(){
    return first + " TIMES " + second;
  }

  public void nextProblem(){
    second++;
  }

}
