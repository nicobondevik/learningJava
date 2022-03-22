import java.security.SecureRandom;

public class Craps{
	// secure random number generator to use in rollDice()
	private static final SecureRandom randomNumbers = new SecureRandom();

	// enum with constants that represent game status
	private enum Status {CONTINUE, WON, LOST};

	// constants that represent common rolls of the dice
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
	
	// single game of craps
	public static void main(String[] args){
		int myPoint = 0; // point if no win or loss on first roll
		Status gameStatus; // contains CONTINUE, WON or LOST
		int sumOfDice = rollDice();

		// determine game status and point based on first roll
		switch (sumOfDice){
		case SEVEN:
		case YO_LEVEN:
			gameStatus = Status.WON;
			break;
		case SNAKE_EYES:
		case TREY:
		case BOX_CARS:
			gameStatus = Status.LOST;
			break;
		default: // not win or lose
			gameStatus = Status.CONTINUE;
			myPoint = sumOfDice;
			System.out.printf("Point is %d%n", myPoint);
			break;
		}
		// while game not complete
		while (gameStatus == Status.CONTINUE){
			sumOfDice = rollDice();

			// determine game status
			if (sumOfDice == myPoint){ // win by making point
				gameStatus = Status.WON;
			}
			else if (sumOfDice == SEVEN){ //lose by rolling 7 b4 point
				gameStatus = Status.LOST;
			}
		}
		if (gameStatus == Status.WON){
			System.out.println("Player wins");
		}
		else
			System.out.println("Player loses");
	}

	// roll dice, calculate sum and display results
	public static int rollDice(){
		// pick random values
		int dice1 = 1 + randomNumbers.nextInt(6);
		int dice2 = 1 + randomNumbers.nextInt(6);
		int sum = dice1 + dice2;

		// display results of the roll
		System.out.printf("Player rolled %d + %d = %d%n", dice1, dice2, sum);
		return sum;
	}
} // end class Craps

