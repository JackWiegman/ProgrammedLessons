import java.util.Scanner;
import java.text.*;

public class InterestRate {

	public static void main(String[] args) {
		DecimalFormat round = new DecimalFormat("0.00");

		Scanner scan = new Scanner(System.in);
		System.out.println("Initial deposit: ");
		int p = scan.nextInt();

		System.out.println("Interest rate: ");
		double r = scan.nextDouble();

		System.out.println("Times per year: ");
		int n = scan.nextInt();

		System.out.println("Number of years: ");
		int t = scan.nextInt();

		double inParentheses = (1 + (r / n));
		double withPower = Math.pow(inParentheses, n * t);
		double value = withPower * p;

		System.out.println("Value: $" + round.format(value));
	}

}