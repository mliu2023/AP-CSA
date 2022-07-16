/**
* Class to create a date.
* @author Max Liu
* @version 1.0
*/
public class Date
{
  // fields
  private int year;
  private int month;
  private int day;
  private static String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
  "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
  public static String[] strDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
  private static int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  /**
  * Constructor for a date which takes in the year, month, and day.
  * @param year The year
  * @param month The month
  * @param day The day
  */
  public Date(int year, int month, int day){
    if(isValidDate(year, month, day)){
      this.year = year;
      this.month = month;
      this.day = day;
    }
    // if an invalid date is provided, we just set the date to Jan 1, 1.
    else{
      this.year = 1;
      this.month = 1;
      this.day = 1;
    }
  }
  // accessors
  public int getYear(){return year;}
  public int getMonth(){return month;}
  public int getDay(){return day;}
  // modifiers
  public void setYear(int year){this.year = year;}
  public void setMonth(int month){this.month = month;}
  public void setDay(int day){this.day = day;}
  /**
  * This method returns the day after this date.
  * @return The next day's date.
  */
  public Date nextDay(){
    Date returnDate = new Date(year, month, day);
    if(day == daysInMonth[month-1]){
      returnDate.setDay(1);
      if(month == 12){
        returnDate.setMonth(1);
        returnDate.setYear(year+1);
      }
      else{
        returnDate.setMonth(month + 1);
      }
    }
    else{
      returnDate.setDay(day+1);
    }
    return returnDate;
  }
  /**
  * This method calculates and returns the day of the week given the date (day, month, year).
  * @return The day of the week.
  */
  public String getDayOfWeek()
  {
    // The year is the year - 1 if the month is January or February
    int Y = year;
    if (month == 1 || month == 2)
      Y--;
    // Last two digits of the year
    int y = Y % 100;
    // Century
    int c = Y / 100;
    // Shifted month (March = 1, ..., February = 12)
    int m = month - 2;
    if (m <= 0)
      m += 12;
    // Calculate the day of the week
    int w = (day + (int)(2.6*m - 0.2) + y + y/4 + c/4 - 2*c);
    while (w < 0)
      w += 7;
    w %= 7;
    return strDays[w];
  }
  /**
  * This method determines if a year is a leap year or not.
  * @param year The year that is possibly a leap year.
  * @return true if year is a leap year, false otherwise.
  */
  public static boolean isLeapYear(int year){
    if(year % 4 == 0){
      if(year % 400 == 0){
        return true;}
      else if (year % 100 == 0){
        return false;}
      else{
        return true;}
    }
    else{
      return false;
    }
  }
  /**
  * This method determines if a date is a valid date.
  * @param year The year of the date.
  * @param month The month of the date.
  * @param day The day of the date.
  * @return true if it is a valid date, false otherrwise.
  */
  public static boolean isValidDate(int year, int month, int day){
    boolean validMonth = (1 <= month && month <= 12);
    if(validMonth){
      boolean validYear = (1 <= year && year <= 9999);
      if(isLeapYear(year) && month == 2){
        boolean validDay = (1 <= day && day <= 29);
        return (validYear && validDay);
      }
      else{
        boolean validDay = (1 <= day && day <= daysInMonth[month-1]);
        return (validYear && validDay);
      }
    }
    else{
      return false;
    }
  }
  /**
  * This method allows a date to be printed.
  * @return The day of the week, day, month, and then year.
  */
  public String toString(){
    return this.getDayOfWeek() + " " + day + " " + strMonths[month-1] + " " + year;
  }
}
