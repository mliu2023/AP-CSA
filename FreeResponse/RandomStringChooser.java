public class RandomStringChooser{

  private String[] wordArr;
  private ArrayList<String> randomArr;

  public RandomStringChooser(String[] arr){
    wordArr = arr;
    randomArr = new ArrayList<String>();
    for(int i = 0; i < arr.length; i++){
      randomArr.add(arr[i]);
    }
  }

  public String getNext(){
    int length = randomArr.length;
    if(length == 0){
      return "NONE";
    }
    int randomNumber = (int)(Math.random()*(double)length);
    String temp = randomArr.get(randomNumber);
    randomArr.remove(randomNumber);
    return temp;
  }

}
