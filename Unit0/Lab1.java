import java.util.Scanner;
/**
* Public class containing Lab1.
* This lab is about blackjack.
* My general approach was to be organized while writing my code.
* I encountered problems while making sure the indicies were correct.
* I learned that testing methods and printing out everything was helpful.
* @author Max Liu
* @version 1.0
*/
public class Lab1{
  public static double[] count = new double[21];
  public static double[] safe = new double[21];
  /**
  * Main function in Lab1.
  * @param args The command line arguments.
  */
  public static void main(String[] args){
    int[] deck=buildDeck();
    shuffle(deck);
    simulate(deck, 1000);
    double[] odds=calculateOdds();
    printArray(count);
    printArray(safe);
    printArray(odds);
    System.out.println(shouldIHit(14, odds));
    game(deck, odds);
  }
  /**
  * This method builds a new deck in order with 53 spots using loops.
  * @return the new deck
  */
  public static int[] buildDeck(){
    // Last element of the array is the index of the card on top.
    int [] deck = new int [53];
    // We iterate through the indicies and add the correct value to the array.
    for(int i=0; i<36; i++){
      // We integer divide by 4 and add 1.
      deck[i]+=(i/4+1);
    }
    for(int j=36; j<52; j++){
      // The rest of the cards have a value of 10.
      deck[j]=10;
    }
    deck[52]=0;
    return deck;
  }
  /**
  * This method shuffles the deck.
  * @param deck The deck that will be shuffled.
  */
  public static void shuffle(int[] deck){
    for(int i=0; i<52; i++){
      int randomNumber=(int)(Math.random()*52);
      int storeValue=deck[i];
      deck[i]=deck[randomNumber];
      deck[randomNumber]=storeValue;
    }
  }
  /**
  * This method gets a card and increments the top card variable.
  * @param deck The deck where the card comes from.
  * @return The card that is at the top of the deck.
  */
  public static int getCard(int[] deck){
    int index=deck[52];
    deck[52]+=1;
    // We check if we hit the end of the array.
    if(deck[52]==53){
      shuffle(deck);
      deck[52]=0;
      return deck[0];
    }
    return deck[index];
  }
  /**
  * This method plays one hand of blackjack.  It records the number of times
  we get a value and the number of times we are safe when we hit at that value.
  * @param deck The deck that is used to play the game.
  */
  public static void playHand(int[] deck){
    int firstCard=getCard(deck);
    int secondCard=getCard(deck);
    int sum=firstCard+secondCard;
    while(sum<=20){
      count[sum]+=1;
      int storeSum=sum;
      sum+=getCard(deck);
      if(sum<=21){
        safe[storeSum]+=1;
      }
    }
  }
  /**
  * Simulates numTimes different games by calling playHand.
  * @param deck The deck that is used to play the games.
  * @param numTimes The number of simulations that are run.
  */
  public static void simulate(int[] deck, int numTimes){
    for(int i=0; i<numTimes; i++){
      playHand(deck);
    }
  }
  /**
  * This method calculates the odds of winning when hitting on a number.
  * @return An array containing the odds for each number.
  */
  public static double[] calculateOdds(){
    double[] odds=new double[21];
    for(int i=2; i<21; i++){
      odds[i]=safe[i]/count[i];
    }
    return odds;
  }
  /**
  * This method returns a boolean based on the odds of winning.
  * @param currVal The current value.
  * @param odds The array containing the odds.
  * @return whether the user should hit or not.
  */
  public static boolean shouldIHit(int currVal, double[] odds){
    double randomNumber=Math.random();
    if(odds[currVal]>randomNumber)
      return true;
    return false;
  }
  /**
  * This method plays a game of blackjack.
  * @param deck The deck that is used to play the game.
  * @param odds The odds that are used to determine whether to hit or not.
  */
  public static void game(int[] deck, double[] odds){
    // The code below sets up the initial part of the game.
    // The dealer gets one card, and the player gets two cards.
    int dealerTotal=0;
    int playerTotal=0;
    int firstCard=getCard(deck);
    System.out.println("Dealer gets: " + firstCard);
    dealerTotal+=firstCard;
    System.out.println("Current dealer hand: " + dealerTotal);
    int secondCard=getCard(deck);
    int thirdCard=getCard(deck);
    System.out.println("Player gets: " + secondCard);
    System.out.println("Player gets: " + thirdCard);
    playerTotal=playerTotal+secondCard+thirdCard;
    System.out.println("Current player hand: " + playerTotal);
    // We check if the player is allowed to hit and if the player stays.
    // This loop keeps running until the player stays or reaches something > 20.
    while(playerTotal<21 && shouldIHit(playerTotal, odds)){
      System.out.println("Player hits");
      int newCard=getCard(deck);
      System.out.println("Player gets: " + newCard);
      playerTotal+=newCard;
      System.out.println("Current player hand: " + playerTotal);
    }
    // If the player total is <=20, then the player must have stayed.
    if(playerTotal<=20)
      System.out.println("Player stays");
    // The dealer keeps playing until the dealer's total is >=17.
    while(dealerTotal<=16 && playerTotal<=21){
      int dealerCard=getCard(deck);
      System.out.println("Dealer gets: " + dealerCard);
      dealerTotal+=dealerCard;
      System.out.println("Current dealer hand: " + dealerTotal);
    }
    // Now, no more cards are being dealt, so we check who won, given the totals.
    if(playerTotal>21)
      System.out.println("Dealer wins!");
    else if(dealerTotal>21)
      System.out.println("Player wins!");
    else if(playerTotal>dealerTotal)
      System.out.println("Player wins!");
    else if(dealerTotal>playerTotal)
      System.out.println("Dealer wins!");
    else if(dealerTotal==playerTotal)
      System.out.println("Push!");
  }
  /**
  * This method prints an array.
  * @param arr The array that is printed
  */
  public static void printArray(double[] arr){
    System.out.print("{ ");
    for(int i=0; i<arr.length; i++){
      if(i==arr.length-1)
        System.out.print(arr[i]);
      else
        System.out.print(arr[i] + ", ");
    }
    System.out.println(" }");
  }
}
