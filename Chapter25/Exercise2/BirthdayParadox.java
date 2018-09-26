import java.util.Scanner;

public class BirthdayParadox {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("People at party: ");
		int n = scan.nextInt();

		double totalChance = 1;
		for (int i = 1; i <= n; i++) {
			totalChance *= ((365.0 - i) / 365.0);
		}

		System.out.println("With " + n + " people at a party, there is a " + totalChance + "% chance that they don't share the same birthday.");

	}

}