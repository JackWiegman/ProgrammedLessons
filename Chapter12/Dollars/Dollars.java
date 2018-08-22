import java.util.Scanner;

public class Dollars {

	public static void main(String[] args) {
		int cents;
		Scanner scan = new Scanner(System.in);

		System.out.println("How many cents: ");
		cents = scan.nextInt();

		int dollars = cents / 100;
		int extraCents = cents % 100;

		System.out.println("That is " + dollars + " dollars and " + extraCents + " cents.");
	}

}