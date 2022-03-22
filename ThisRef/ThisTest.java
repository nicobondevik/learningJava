// initializing two classes in one .java file, and shows the use oh this.reference

public class ThisTest{
	public static void main(String[] args){
		SimpleTime time = new SimpleTime(15, 30, 19);
		System.out.println(time.buildString());
	} // end main
} // end ThisTest

// not public, because we can only have one public class per file
// this means that SimpleTime only can be called from the other classes in the same package: ThisTest
class SimpleTime{
	private int hour;
	private int minute;
	private int second;

	// using this to distinguish the names in the constructor
	public SimpleTime(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	} // end constructor

	// using explicit and implicit "this" to call UniversalString
	public String buildString(){ // returns a String
		return String.format("%24s: %s%n%24s: %s", "this.toUniversalString()", this.toUniversalString(), "toUniversalString()", toUniversalString());
	} // end buildString

	// convert string to universal format (HH:MM:SS)
	public String toUniversalString(){
		return String.format("%02d:%02d:%02d", this.hour, minute, this.second);
		// "this" not really needed, because theres no need to differ between instance variables and local variables.
	} // end method
} // end class SimpleTime
