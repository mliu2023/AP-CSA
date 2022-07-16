public class RandomLetterChooser extends RandomStringChooser{
  public RandomLetterChooser(String str){
    super(getSingleLetters(str));
  }
}
