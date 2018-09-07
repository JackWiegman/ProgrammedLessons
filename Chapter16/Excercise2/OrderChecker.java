import java.util.Scanner;

public class OrderChecker {

	public static void main(String[] args) {
		int boltPrice = 5;
		int nutPrice = 3;
		Scanner scan = new Scanner(System.in);

		System.out.println("Number of bolts: ");
		int bolts = scan.nextInt();

		System.out.println("Number of nuts: ");
		int nuts = scan.nextInt();

		System.out.println("Number of washers: ");
		int washers = scan.nextInt();

		if (nuts < bolts || 2 * bolts > washers) {
			System.out.println("Check The Order: ");
		}
		if (nuts < bolts) {
			System.out.println("too few nuts");
		}
		if (2 * bolts > washers) {
			System.out.println("too few washers");
		}

		int price = (boltPrice * bolts) + (nutPrice * nuts) + (washers);

		System.out.println("\nTotal cost: " + price);

	}

}