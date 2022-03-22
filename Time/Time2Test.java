// testing the overloaded constructors and other elements of the Time2 class

public class Time2Test{
	public static void main(String[] args){
		// intializing five correct and one incorrect Time-object.
		Time2 t1 = new Time2(); // default values
		Time2 t2 = new Time2(16);
		Time2 t3 = new Time2(16, 20);
		Time2 t4 = new Time2(16, 20, 42);
		Time2 t5 = new Time2(t4);

		System.out.println("Constructed with:");
		displayTime("t1: all default arguments", t1);
		displayTime("t2: specified hour", t2);
		displayTime("t3: specified hour and minute", t3);
		displayTime("t4: all specified", t4);
		displayTime("Specified with t4-object", t5);

		// attempt to intialize t6 with invalid values
		try{
			Time2 t6 = new Time2(420, 69, 420);
		}
		catch (IllegalArgumentException e){
			System.out.printf("%nException while initializing t6: %s%n",
					e.getMessage());
		}
	}

	// display Time2-object in 24-hour and 12-hour formats
	private static void displayTime(String header, Time2 t){
		System.out.printf("%s%n%s%n%s%n", header, t.toUniversalString(), t.toString());
	}
} // end class
