// class for testing Time1
public class Time1Test{
	public static void main(String[] args){
		Time1 time = new Time1(); // create time-object

		// output string-representations
		System.out.printf("After time object is created:%n%s%n", time);

		// change time and output
		time.setTime(16, 20, 00);
		System.out.printf("After setting time:%n%s%n", time);
		// attempt invalid setTime params
		try{
			time.setTime(420, 69, 420);
		}
		catch (IllegalArgumentException e){
			System.out.printf("Exception: %s%n%n", e.getMessage());
		}

		// display time after invalid attempt
		System.out.printf("After invalid attempt:%n%s%n", time);
	} // end main
} // end class
