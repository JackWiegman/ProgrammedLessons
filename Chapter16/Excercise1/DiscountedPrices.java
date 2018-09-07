import java.util.Scanner;

public class DiscountedPrices {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cents;

		System.out.println("Enter amount of purchases: ");
		cents = scan.nextInt();

		double discount;

		if (cents > 1000) {
			discount = cents * 0.9;
		} else {
			discount = cents;
		}

		System.out.println("Discounted Price: " + discount);

	}

}