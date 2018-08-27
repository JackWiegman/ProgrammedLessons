import java.util.Scanner;

public class HarmonicMean {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x;
		double y;

		System.out.println("Enter X");
		x = scan.nextDouble();

		System.out.println("Enter Y");
		y = scan.nextDouble();

		double arithmaticMean = (x + y) / 2.0;
		double harmonicMean = 2 / ((1 / x) + (1 / y));

		System.out.println("Arithmatic mean: " + arithmaticMean);
		System.out.println("Harmonic mean: " + harmonicMean);
	}

}