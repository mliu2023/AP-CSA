import java.util.Scanner;
import java.io.*;
/**
* Public class containing methods for Lab 0.  This lab is about evaluating and creating reviews.
* My general approach was to test my methods as I was coding them.
* I printed out the words going through getSentimentalValue to make sure that the right words were being passed through getSentiment().
* I learned that testing can help find errors in the code (especially logic errors).
* I encountered problems in getSentiment because I tried using wordbank.indexOf(word), which was an issue because sometimes the word was just a fragment of another word.
* @author Max Liu
* @version 1.0
*/
public class Lab0{
  /**
  * Main function in the class where the methods are tested.
  * @param args The command line arguments.
  */
  public static void main(String[] args){
    String wordbank=readFile("sentimentValues.txt");
    String simpleReview=readFile("simpleReview.txt");
    String longerReview=readFile("longerReview.txt");
    String negativeReview=readFile("negativeReview.txt");
    String [] positiveAdjectives = readAdjectives("positiveAdjectives.txt");
    System.out.println("Test cases: ");
    System.out.println(getSentiment("yet", wordbank));
    System.out.println(getSentiment("happily", wordbank));
    System.out.println(getSentiment("a", wordbank));
    System.out.println(getSentiment("alabama", wordbank));
    System.out.println("Simple review: ");
    System.out.println(getTotalSentiment(simpleReview, wordbank));
    System.out.println(starRating(getTotalSentiment(simpleReview, wordbank)) + " stars");;
    System.out.println("Longer review: ");
    System.out.println(getTotalSentiment(longerReview, wordbank));
    System.out.println(starRating(getTotalSentiment(longerReview, wordbank))+ " stars");
    System.out.println("Fake review: ");
    System.out.println(generateFakeReview(negativeReview, positiveAdjectives));
  }
  /**
  * Removes punctuation or numbers from the beginning and the end of a string.
  * @param word the word that will be separated from its punctuation.
  * @return the word without punctuation.
  */
  public static String removePunctuation(String word){
    // We make sure the word has length>1.
    if(word.length()>1){
      char first=word.charAt(0);
      char last=word.charAt(word.length()-1);
      if(!isLetter(first)){
        word=word.substring(1);
      }
      if(!isLetter(last)){
        word=word.substring(0, word.length()-1);
      }
      return word;
    }
    return word;
  }
  /**
  * Determines if a string has only letters using ASCII values.
  * @param s the string that is being tested.
  * @return true if there are only letters, false otherwise.
  */
  public static boolean isLetter(char s){
    return (((int)s>=65 && (int)s<=90) || ((int)s>=97 && (int)s<=122));
  }
  /**
  * Determines the sentiment value of a word.
  * @param word the word whose sentiment value is used.
  * @param wordbank the wordbank where the word has a sentiment value.
  * @return the sentiment of the word found in the wordbank.
  */
  public static double getSentiment(String word, String wordbank){
    // Splitting the wordbank into strings in an array.
    String [] wordArr=wordbank.split(",");
    for(int i=0; i<wordArr.length-1; i++){
      if(word.equals(wordArr[i])){
      // wordArr[i+1] is the double to the right of wordArr[i] in the wordbank.
        double d=Double.parseDouble(wordArr[i+1]);
        return d;
      }
    }
    return 0;
  }
  /**
  * Determines total sum of sentiments of words in a review.
  * @param review the review whose total sentiment is calculated.
  * @param wordbank the words that have a sentimental value.
  * @return the total sentiment of the review.
  */
  public static double getTotalSentiment(String review, String wordbank){
    double counter=0;
    // Splitting the review into strings in an array.
    String [] wordArr=review.split(" ");
    for(int i=0; i<wordArr.length; i++){
      // Removes punctuation twice.
      String word=removePunctuation(removePunctuation(wordArr[i]));
      word=word.toLowerCase();
      // We find the sentimental value of each string in the array.
      counter+=getSentiment(word, wordbank);
    }
    return counter;
  }
  /**
  * This method calculates the star rating given a sentimental value.
  * @param sentiment The sentimental value that is converted to a star rating.
  * @return The star rating.
  */
  public static int starRating(double sentiment){
    if (sentiment<-10)
      return 0;
    else if (sentiment<0)
      return 1;
    else if (sentiment<10)
      return 2;
    else if (sentiment<20)
      return 3;
    else
      return 4;
  }
  /**
   * Reads a text file and store the text in a String.
   * @param filename The name of the file to be read.
   * @return The string containing the text.
   */
   public static String readFile(String filename)
  {
    File file = new File(filename);
    String text = "";
    Scanner input = null;
    // Open the file
    try
    {
      input = new Scanner(file);
    }
    catch (FileNotFoundException ex)
    {
      System.out.println(" Cannot open " + filename );
      System.exit(1);
    }
    // Read all the lines in the file and append to the string
    while(input.hasNextLine())
    {
      String s = input.nextLine();
      text += s;
    }
    return text;
  }
  /**
  * This method generates a fake positive review given an input review.
  * @param review The review that will be turned into a positive review.
  * @param posAdj Array containing positive adjectives.
  * @return a fake review with positive adjectives.
  */
  public static String generateFakeReview(String review, String[] posAdj){
    String newReview="";
    // Splitting the review into words in an array.
    String [] wordArr=review.split(" ");
    for(int i=0; i<wordArr.length; i++){
      // Check if the word has an asterisk at the beginning.
      if(wordArr[i].indexOf("*")==0){
        // Random positive adjective
        int randomNumber=(int)(Math.random()*posAdj.length);
        // Replacing the word with an asterisk in front of it.
        wordArr[i]=posAdj[randomNumber]+extractPunctuation(wordArr[i]);
      }
    }
    // Reconstructing the sentence.
    for(int j=0; j<wordArr.length; j++){
      newReview=newReview+wordArr[j]+" ";
    }
    return newReview;
  }

  /**
  * This method extracts the punctuation after a word (if any).
  * @param word the word whose punctuation is extracted.
  * @return the punctuation at the end of the word (if any).
  */
  public static String extractPunctuation(String word){
    char last=word.charAt(word.length()-1);
    // Using ASCII values to determine if the last character is punctuation.
    if((int)last<=64){
      return word.substring(word.length()-1, word.length());
    }
    return "";
  }


  /**
   * Read a text file and store each line in an array of strings
   * @param filename The name of the file to be read
   * @return The array of strings for all lines in the file
   */
  public static String[] readAdjectives(String filename)
  {
    File file = new File(filename);
    // Hard code the number of adjectives in the array
    String[] adjectives = new String[30];
    // Open the file
    Scanner input = null;
    try
    {
      input = new Scanner(file);
    }
    catch (FileNotFoundException ex)
    {
      System.out.println(" Cannot open " + filename );
      System.exit(1);
    }
    // Read the adjectives one by one and store them in the array
    int n = 0;
    while(input.hasNextLine())
    {
      String s = input.nextLine();
      adjectives[n] = s;
      n++;
    }
    return adjectives;
  }

}
