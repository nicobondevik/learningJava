// Declaring an enum type with a constructor

public enum Book{
	// declaring enum constants
	JHTP("Java How to Program", "2015"),
	CHTP("C How to Program", "2013"),
	IW3HTP("Internet & World Wide Web How to Program", "2012"),
	CPPHTP("C++ How to Program", "2014"),
	VBHTP("Visual Basic How to Program", "2014"),
	CSHARPHTP("Visual C# How to Program", "2014");

	// init instance constants
	private final String title;
	private final String copyrightYear;

	// constructor
	Book(String title, String copyrightYear){
		this.title = title;
		this.copyrightYear = copyrightYear;
	}

	// accessors
	public String getTitle(){
		return title;
	}

	public String getCopyrightYear(){
		return copyrightYear;
	}
} // end enum Book
