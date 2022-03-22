public class Time1{
	private int hour; // 0 - 23
	private int minute; // 0 - 59
	private int second; // 0 - 59

	// set a new time value using universal time, throw an
	// exception if the hour, minute or second is invalid.
	public void setTime(int hour, int minute, int second){
		// format = HH:MM:SS
		// validate parameters
		if (hour < 0 || hour > 24 || minute < 0 || minute > 60 || second < 0 || second > 60){
			throw new IllegalArgumentException("Out of range.");
		}

		this.hour = hour;
		this.minute = minute;
		this.second = second;
	} // end setTime

	// convert to string in format HH:MM:SS
	public String toUniversalString(){
		return String.format("%02d:%02d:%02d", hour, minute, second);
	} // end method

	// convert to string in format H:MM:SS AM/PM
	public String toString(){
		// the method name "toString" runs whenever a
		// string is needed. If the object is printed
		// using %s, the toString method is automatically
		// called.
		return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour % 12), minute, second, (hour < 12 ? "AM" : "PM"));
	} // end method
} // end class
