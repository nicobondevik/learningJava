import java.util.Scanner;

public class Switch {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter word letter (h, m, n, i, j):");
		String i = input.nextLine();
		switch (i)
		{
			case "h":
				System.out.print("Hey ");
			case "m":
				System.out.print("my ");
			case "n":
				System.out.print("name ");
			case "i":
				System.out.print("is ");
			case "j":
				System.out.print("jonbon.");
				break;
		} // end switch
	} // end main
} // end class
