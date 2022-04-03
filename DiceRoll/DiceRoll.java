import java.util.Random;
import java.util.ArrayList;

// This program simulates dice-rolling.
// Usage: java DiceRoll number_of_throws

public class DiceRoll{
	public static void main(String[] args){
		if (args.length != 1){
			System.out.println("Please specify the number of rolls to throw.");
		}

		else{
			int die1;
			int die2;
			int sum;
			int[] rolls = new int[12];

			int n = Integer.parseInt(args[0]);
			Random random = new Random();
			
			for (int i=0; i<n; i++){
				die1 = 1 + random.nextInt(6);
				die2 = 1 + random.nextInt(6);
				sum = die1 + die2;
				++rolls[sum-1];
			} // end dicerolling

			System.out.printf("Roll\tFrequency%n");
			for (int i=1; i<rolls.length; i++){
				System.out.printf("%d\t%d%n", i+1, rolls[i]);
			} // end print
		} // end else
	} // end main
} // end class
