import java.util.Scanner;

public class CorrectChange {

	public static void main(String[] args) {
		int cents;
		Scanner scan = new Scanner(System.in);

		System.out.println("How many cents: ");
		cents = scan.nextInt();

		int dollars = cents / 100;
		int dollarRemainder = cents % 100;
		int quarters = dollarRemainder / 25;
		int quartersRemainder = dollarRemainder % 25;
		int dimes = quartersRemainder / 10;
		int dimesRemainder = quartersRemainder % 10;
		int nickles = dimesRemainder / 5;
		int nicklesRemainder = dimesRemainder % 5;
		int pennies = nicklesRemainder / 1;

		System.out.println("Your change is " + dollars +" dollars, " + quarters + " quarters, " + dimes + " dimes, " + nickles + " nickles, and " + pennies + " pennies.");

	}

}