/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar1 
{	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) 
	{
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	    int debugDaysCounter = 0; 
		int sundayCounter = 0;
	 	while (year < 2000) 
		{
			if (dayOfWeek == 1)
			{
				System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
				if (dayOfMonth == 1)
				{
					sundayCounter++;
				}
			}	
			else
			{
				System.out.println(dayOfMonth + "/" + month + "/" + year);
			}
			advance();
	 		debugDaysCounter++;
	 		//// If you want to stop the loop after n days, replace the condition of the
	 		//// if statement with the condition (debugDaysCounter == n)
	 		//if (false) 
			//{ 
	 		//	break;
	 		//}
        }
		System.out.println("During the 20th century, " + sundayCounter + " Sundays fell on the first day of the month" + debugDaysCounter);
	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() 
	 {
		if ((dayOfMonth == 31) && (month == 12)) //if it is the end of the year
		{
			dayOfMonth = 1;
			month = 1;
			year = year + 1;
			dayOfWeek = (dayOfWeek + 1) % 7;
			if (dayOfWeek == 0)
			{
				dayOfWeek = 7;
			}
			nDaysInMonth = 31;
		}
		else
		{
			if ((dayOfMonth == nDaysInMonth(month, year))) //if it is the end of the month
			{
				dayOfMonth = 1;
				month = month + 1;
				dayOfWeek = (dayOfWeek + 1) % 7;
				if (dayOfWeek == 0)
				{
					dayOfWeek = 7;
				}
				nDaysInMonth = nDaysInMonth(month, year);
			}
			else
			{
				dayOfMonth = dayOfMonth + 1;
				dayOfWeek = (dayOfWeek + 1) % 7;
				if (dayOfWeek == 0)
				{
					dayOfWeek = 7;
				}
			}
		}

	 } 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) 
	{
	    if ((year % 4) == 0) 
		{
			if (year % 100 == 0)
			{
				if (year % 400 == 0)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				return true;
			}	
		}
		else
		{
			return false;
		}
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) 
	{
		Boolean isLeap = isLeapYear(year);
		int days;
		if (month == 2)
		{
			if (isLeap)
			{
				days = 29;
			}
			else days = 28;
		}
		else
		{
		if ((month == 4) || (month == 6) || (month == 9) || (month == 11))
		{
				days = 30;
		}
		else
		{
				days = 31;
		}
		}
		return days;
	}
}
