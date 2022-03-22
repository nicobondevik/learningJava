import java.security.SecureRandom;
import java.util.Scanner;

public class MathGame{
	public static void main(String[] args){
		SecureRandom random = new SecureRandom();
		Scanner input = new Scanner(System.in);

		int num1 = random.nextInt(100);
		int num2 = random.nextInt(100);
		System.out.printf("What is %d + %d?%n", num1, num2);
		int ans = input.nextInt();
		while (ans != num1 + num2){
			System.out.printf("Wrong! Try again.%n");
			ans = input.nextInt();
		}
		System.out.println("Correct! Nice job.");
	} // end main
} // end class
