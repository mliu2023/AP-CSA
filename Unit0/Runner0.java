public class Runner0{
  public static void main(String[] args){
    // To binary
    System.out.println(ProblemSet0.toBinary(0));
    System.out.println(ProblemSet0.toBinary(15));
    System.out.println(ProblemSet0.toBinary(32));
    System.out.println();
    // rollDie
    System.out.println(ProblemSet0.rollDie(6));
    System.out.println(ProblemSet0.rollDie(10));
    System.out.println(ProblemSet0.rollDie(15));
    System.out.println();
    // multiples
    ProblemSet0.multiples(1);
    System.out.println();
    ProblemSet0.multiples(3);
    System.out.println();
    ProblemSet0.multiples(4);
    System.out.println();
    // swap
    System.out.println(ProblemSet0.swap(169));
    System.out.println(ProblemSet0.swap(3));
    System.out.println(ProblemSet0.swap(30));
    System.out.println();
    // xor
    ProblemSet0.xor();
    System.out.println();
    // printStars
    ProblemSet0.printStars(1);
    System.out.println();
    ProblemSet0.printStars(4);
    System.out.println();
    ProblemSet0.printStars(5);
    System.out.println();
    System.out.println();
    // printTriangle
    ProblemSet0.printTriangle(3);
    System.out.println();
    ProblemSet0.printTriangle(4);
    System.out.println();
    ProblemSet0.printTriangle(5);
    System.out.println();
    // printRecursive
    ProblemSet0.printRecursive(1);
    System.out.println();
    ProblemSet0.printRecursive(3);
    System.out.println();
    ProblemSet0.printRecursive(5);
    System.out.println();
    // printRecursive2
    ProblemSet0.printRecursive2(1);
    System.out.println();
    ProblemSet0.printRecursive2(3);
    System.out.println();
    ProblemSet0.printRecursive2(5);
    System.out.println();
    System.out.println();
    // sumDigits
    System.out.println(ProblemSet0.sumDigits(69));
    System.out.println(ProblemSet0.sumDigits(420));
    System.out.println(ProblemSet0.sumDigits(11129000));
    System.out.println();
    // isDivisible
    System.out.println(ProblemSet0.isDivisible(0));
    System.out.println(ProblemSet0.isDivisible(69));
    System.out.println(ProblemSet0.isDivisible(421));
    System.out.println();
    // printMoreStars
    ProblemSet0.printMoreStars(1);
    ProblemSet0.printMoreStars(2);
    ProblemSet0.printMoreStars(5);
    System.out.println();
    // leastCoins
    int a []=ProblemSet0.leastCoins(55);
    int b []=ProblemSet0.leastCoins(67);
    int c []=ProblemSet0.leastCoins(91);
    System.out.println("{ " + a[0] + ", " + a[1] + ", " + a[2] + ", " + a[3] + " }");
    System.out.println("{ " + b[0] + ", " + b[1] + ", " + b[2] + ", " + b[3] + " }");
    System.out.println("{ " + c[0] + ", " + c[1] + ", " + c[2] + ", " + c[3] + " }");
    System.out.println();
    // coins
    // We call the method and then also print the number of combinations.
    System.out.println(ProblemSet0.coins(0));
    System.out.println();
    System.out.println(ProblemSet0.coins(1));
    System.out.println();
    System.out.println(ProblemSet0.coins(26));
    
  }
}
