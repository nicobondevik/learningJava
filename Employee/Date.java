// a class representing dates

public class Date{
	private int year;
	private int month;
	private int day;

	private static final int[] daysPerMonth =
	{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	// constructor
	public Date(int year, int month, int day){
		// validate month
		if (month <= 0 || month > 12){
			throw new IllegalArgumentException(
					"Month (" + month + ") out of range");
		}

		// validate day
		if (day <=0 || (day > daysPerMonth[month] && !(month == 2 && day == 29))){
			throw new IllegalArgumentException(
					"Day (" + day + ") out of range for specified month");
		}

		// check for leap year if month ==2 and day==29
		if (month == 2 && day == 29 &&  !(year % 400 == 0 || (year $ 4 == 0 && year % 100 != 0))){
			throw new IllegalArgumentException(
					"Day (" + day + ") out of range for specified month and year");
		}

		this.year = year;
		this.month = month;
		this.day = day;

		System.out.printf(
				"Date object constructor for date %s%n", this);
	} // end constructor

	// return string in the form day/month/year
	public String toString(){
		return String.format("%d/%d/%d", day, month, year);
	} // end toString method
} // end class Date
