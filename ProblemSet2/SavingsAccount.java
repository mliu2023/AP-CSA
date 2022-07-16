/**
* Class to create a savings account.
* @author Max Liu
* @version 1.0
*/
public class SavingsAccount{
  // fields
  private static double annualInterestRate = 0.01;
  private double balance;
  /**
  * Default constructor for a savings account; sets balance to 0.
  */
  public SavingsAccount(){
    balance = 0;
  }
  /**
  * Constructor that takes in the balance.
  * @param balance The balance that the savings account will be constructed with.
  */
  public SavingsAccount(double balance){
    if(balance >= 0){
      this.balance = balance;
    }
    else{
      this.balance = 0;
    }
  }
  public double getBalance(){return balance;}
  public static double getAnnualInterestRate(){return annualInterestRate;}
  /**
  * This method adds an amount to the balance.
  * @param amount The amount that is added to the balance.
  */
  public void addAmount(double amount){balance += amount;}
  public static void setInterestRate(double rate){annualInterestRate = rate;}
  /**
  * This method calculates the monthly interest and updates the balance.
  * @return The amount of interest earned after a month.
  */
  public double calculateMonthlyInterest(){
    double interest = balance*(annualInterestRate/(double)12);
    balance += interest;
    return interest;
  }
}
