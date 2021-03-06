// a class representing dates

public class Date{
	private int year;
	private int month;
	private int day;

	private static final int[] daysPerMonth =
	{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	// constructor
	public Date(int day, int month, int year){
		
		// validate day
		if (day <=0 || (day > daysPerMonth[month] && !(month == 2 && day == 29))){
			throw new IllegalArgumentException(
					"Day (" + day + ") out of range.");
		}

		// check for leap year if month ==2 and day==29
		if (month == 2 && day == 29 &&  !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))){
			throw new IllegalArgumentException(
					"Day (" + day + ") out of range.");
		}

        // validate month
		if (month <= 0 || month > 12){
			throw new IllegalArgumentException(
					"Month (" + month + ") out of range.");
		}

        // validate year
        if (year < 0 || year >= 3000){
            throw new IllegalArgumentException(
                    "Year (" + year + ") out of range.");
        }
		this.year = year;
		this.month = month;
		this.day = day;

		System.out.printf(
				"Date object constructor for date %s%n", this);
	} // end constructor

    // increment-methods
    public void nextDay(){
        if (day + 1 > daysPerMonth[month]){
            if (month + 1 > 12){
                this.year++;
                this.month = 1;
                this.day = 1;
            }
            else{
                this.month++;
                this.day = 1;
            }
        }
        else
            day++;
    } // end nextDay()

	// return string in the form day/month/year
	public String toString(){
		return String.format("%d/%d/%d", day, month, year);
	} // end toString method
} // end class Date
