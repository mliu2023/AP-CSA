import java.util.ArrayList;
/**
* Class to test code from problem set 2.
* @author Max Liu
* @version 1.0
*/
public class Runner
{
  public static void main(String[] args)
  {
    // 1. Complex
    System.out.println("Complex: ");
    System.out.println();
    Complex complexNum1 = new Complex(5.5, 23.1);
    System.out.println(complexNum1.modulus());
    System.out.println(complexNum1.angle());
    System.out.println(complexNum1.getReal());
    System.out.println(complexNum1);
    System.out.println();
    Complex complexNum2 = new Complex(0, 0);
    System.out.println(complexNum2.modulus());
    System.out.println(complexNum2.angle());
    System.out.println(complexNum2.getImag());
    System.out.println(complexNum2);
    System.out.println();
    Complex complexNum3 = new Complex(0, 10);
    System.out.println(complexNum3.modulus());
    System.out.println(complexNum3.angle());
    System.out.println(complexNum3);
    System.out.println();
    // 2. Qubit
    System.out.println("Qubit: ");
    System.out.println();
    Qubit qubit1 = new Qubit(complexNum1, complexNum2);
    System.out.println(qubit1.measure());
    System.out.println(qubit1);
    System.out.println();
    Qubit qubit2 = new Qubit();
    System.out.println(qubit2.measure());
    System.out.println(qubit2);
    System.out.println();
    Qubit qubit3 = new Qubit(new Complex(.36, .48), new Complex(.48, .64));
    System.out.println(qubit3.measure());
    System.out.println(qubit3);
    System.out.println();
    // 3. Date
    System.out.println("Dates: ");
    System.out.println();
    Date date1 = new Date(2001, 11, 30);
    System.out.println(date1);
    System.out.println(date1.nextDay());
    Date date2 = new Date(2004, 10, 21);
    System.out.println(date2);
    System.out.println(date2.nextDay());
    System.out.println(Date.isLeapYear(1900));
    System.out.println(Date.isValidDate(9999, 12, 100));
    Date date3 = new Date(1949, 10, 31);
    System.out.println(date3);
    System.out.println(date3.nextDay());
    System.out.println();
    Date date4 = new Date(2001, 11, 9);
    System.out.println(date4);
    System.out.println(date4.nextDay());
    System.out.println();
    Date date5 = new Date(1000, 9, 30);
    System.out.println(date5);
    System.out.println(date5.nextDay());
    System.out.println();
    // 4. Songs
    System.out.println("Songs: ");
    System.out.println();
    Song song1 = new Song("YoungBoy Never Broke Again", "Make No Sense");
    Song song2 = new Song("Rich Brian", "The Sailor");
    Song song3 = new Song("Imagine Dragons", "Believer");
    Song song4 = new Song("Joji", "Run");
    Song song5 = new Song("PewDiePie", "Congradulations");
    Top10Songs songArr1 = new Top10Songs();
    System.out.println(songArr1);
    System.out.println(songArr1.add(song1));
    System.out.println(songArr1);
    System.out.println(songArr1.add(song2, 9));
    System.out.println(songArr1);
    System.out.println(songArr1.add(song3));
    System.out.println(songArr1);
    System.out.println(songArr1.add(song4, 5));
    System.out.println(songArr1);
    System.out.println(songArr1.add(song5));
    System.out.println(songArr1);
    System.out.println(songArr1.add(song1));
    System.out.println(songArr1);
    System.out.println(songArr1.add(song1));
    System.out.println(songArr1);
    System.out.println(songArr1.add(song1));
    System.out.println(songArr1);
    System.out.println(songArr1.add(song1));
    System.out.println(songArr1);
    System.out.println(songArr1.add(song3));
    System.out.println(songArr1);
    System.out.println(songArr1.add(song3));
    System.out.println(songArr1);
    System.out.println(songArr1.add(song3));
    System.out.println(songArr1);
    System.out.println(songArr1.add(song3, 5));
    System.out.println(songArr1);
    // 5. Poems
    System.out.println("Poems: ");
    System.out.println();
    Haiku haiku1 = new Haiku();
    System.out.println(haiku1.numLines());
    System.out.println(haiku1.getSyllables(1));
    System.out.println(haiku1.printRhythm());
    Limerick limerick1 = new Limerick();
    System.out.println(limerick1.numLines());
    System.out.println(limerick1.getSyllables(3));
    System.out.println(limerick1.printRhythm());
    System.out.println();
    // 6. SavingsAccount
    System.out.println("SavingsAccount: ");
    System.out.println();
    System.out.println("Annual interest rate: " + SavingsAccount.getAnnualInterestRate());
    SavingsAccount account1 = new SavingsAccount(5000);
    System.out.println(account1.getBalance());
    account1.addAmount(5000);
    System.out.println(account1.getBalance());
    System.out.println(account1.calculateMonthlyInterest());
    System.out.println(account1.getBalance());
    System.out.println();
    SavingsAccount account2 = new SavingsAccount(1);
    SavingsAccount.setInterestRate(.1);
    System.out.println("Annual interest rate: " + SavingsAccount.getAnnualInterestRate());
    System.out.println(account2.getBalance());
    System.out.println(account2.calculateMonthlyInterest());
    System.out.println(account2.getBalance());
    System.out.println();
    SavingsAccount account3 = new SavingsAccount(100);
    for(int i = 0; i < 12; i++){account3.calculateMonthlyInterest();}
    System.out.println(account3.getBalance());
    System.out.println();
    SavingsAccount account4 = new SavingsAccount();
    SavingsAccount.setInterestRate(.60);
    for(int i = 0; i < 12; i++){account4.calculateMonthlyInterest();}
    System.out.println(account4.getBalance());
    System.out.println();
    SavingsAccount account5 = new SavingsAccount(3);
    account5.addAmount(12345);
    for(int i = 0; i < 12; i++){account5.calculateMonthlyInterest();}
    System.out.println(account5.getBalance());
    System.out.println();
    // 7. Transport classes
    System.out.println("7. Transport Classes");
    ArrayList<Safety> transportOperations = new ArrayList<Safety>();
    // 25 tickets sold, $5 per ticket, and has a fire extinguisher on board
    transportOperations.add(new Bus(25, 5, true));
    // 200 tickets sold, $25 per ticket
    transportOperations.add(new Train(200, 25));
    // 100 tickets sold, $375 per ticket, and has a fire extinguisher on board,
    // 150 lifejackets, 30 lifeboats which can carry 5 people per lifeboat
    transportOperations.add(new Plane(100, 375, true, 150, 30, 5));
    // 105 tickets sold, $370 per ticket
    transportOperations.add(new Plane(105, 370));
    // 15 tickets sold, $500 per ticket, and has a fire extinguisher on board
    transportOperations.add(new Helicopter(15, 500, true));
    // 90 tickets sold, $150 per ticket, and has a fire extinguisher on board
    transportOperations.add(new Ship(90, 150, true));
    // 25 tickets sold, $450 per ticket, and has a fire extinguisher on board,
    // 25 lifejackets, 5 lifeboats which can carry 5 people per lifeboat
    transportOperations.add(new Helicopter(25, 450, true, 25, 5, 5));
    // 5 tickets sold, $500 per ticket
    transportOperations.add(new Boat(5, 500));
    // 12 tickets sold, $250 per ticket, no fire extinguisher on board,
    // 20 lifejackets, 5 lifeboats which can carry 4 people per lifeboat
    transportOperations.add(new Boat(12, 250, false, 25, 5, 4));

    Operations current = new Operations(transportOperations);
    // Find out how many transport operations pass the safety test
    System.out.println("Safe operations: " + current.getSafeOperations());
    // Find out the total revenue for all operations that pass the safety test
    System.out.println("Total revenue: " + current.totalRevenue());
    // Find out the total Land transport operation revenue for all Land
    // transport operations that pass the safety test
    System.out.println("Land revenue: " + current.totalLandRevenue());
    // Find out the total Air transport operation revenue for all Air
    // transport operations that pass the safety test
    System.out.println("Air revenue: " + current.totalAirRevenue());
    // Find out the total Sea transport operation revenue for all Sea
    // transport operations that pass the safety test
    System.out.println("Sea revenue: " + current.totalSeaRevenue());
    System.out.println();
    // 8. Shopper
    Shopper shopper1 = new Shopper("Bob");
    Shopper shopper2 = new Shopper("John");
    ArrayList<Money> money2 = Money.makeCoins(63);
    ArrayList<Money> money3 = Money.makeCoins(29);
    Snack snack1 = new Snack("Skittles", 1);
    Snack snack2 = new Snack("Snickers", 2);
    Snack snack3 = new Snack("Lays", 1);
    VendingMachine vendingMachine1 = new VendingMachine(snack1, 20);
    VendingMachine vendingMachine2 = new VendingMachine(snack2, 50);
    VendingMachine vendingMachine3 = new VendingMachine(snack3, 30);
    VendingMachine vendingMachine4 = new VendingMachine(snack1, 0);
    ArrayList<Money> money1 = Shopper.prepareCoins(snack1);
    shopper1.addFunds(money1);
    shopper1.buySnack(snack1);

    vendingMachine1.addMoney(Money.makeCoins(Money.totalAmount(shopper1.getFunds())));
    shopper1.removeFunds(Money.totalAmount(shopper1.getFunds()));
    System.out.println(vendingMachine1.getStock());
    vendingMachine1.makeSale();
    shopper1.addFunds(vendingMachine1.getChange());
    System.out.println(shopper1.getFunds());

    shopper2.addFunds(money2);
    shopper2.buySnack(snack2);
    shopper2.buySnack(snack3);

    vendingMachine2.addMoney(shopper2.getFunds());
    shopper2.removeFunds(Money.totalAmount(shopper2.getFunds()));
    System.out.println(vendingMachine2.getStock());
    vendingMachine2.makeSale();
    shopper2.addFunds(vendingMachine2.getChange());
    System.out.println(shopper2.getFunds());
    vendingMachine2.addMoney(Shopper.prepareCoins(snack2));
    System.out.println(vendingMachine2.getStock());
    System.out.println(shopper2.getTotalValue());
    vendingMachine2.makeSale();
    shopper2.addFunds(vendingMachine2.getChange());
    System.out.println(shopper2.getFunds());
    vendingMachine3.addMoney(shopper2.getFunds());
    shopper2.removeFunds(Money.totalAmount(shopper2.getFunds()));
    vendingMachine3.makeSale();
    shopper2.addFunds(vendingMachine3.getChange());
    System.out.println(shopper2.getFunds());

    shopper1.addFunds(money3);

    vendingMachine4.addMoney(shopper1.getFunds());
    shopper1.removeFunds(Money.totalAmount(shopper1.getFunds()));
    vendingMachine4.makeSale();
    System.out.println(vendingMachine4.getChange());
    shopper1.addFunds(vendingMachine4.getChange());
  }
}
