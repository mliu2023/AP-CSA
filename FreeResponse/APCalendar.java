public class APCalendar{
  public static int numberOfLeapYears(int year1, int year2){
  	int counter = 0;
  	for(int i = year1; i <= year2; i++){
  		if(isLeapYear(i)){
  			counter++;
  		}
  	}
  	return counter;
  }
  public static dayOfWeek(int month, int day, int year){
    int daysPassed = dayOfYear(monty, day, year);
    int firstDay = firstDayOfYear(year);
    return (firstDay + daysPassed - 1) % 7;
  }
}
