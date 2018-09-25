import java.util.Scanner;

public class Permutations {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		System.out.println("Enter N: ");
		int n = scan.nextInt();
		System.out.println("Enter R: ");
		int r = scan.nextInt();

		long nFactorial = n;
		if (n >= 0) {
			for (int i = n - 1; i > 1; i--) {
				nFactorial *= i;
			}
		} else {
			System.out.println("N can't be negative.");
		}

		int difference = n - r;
		long differenceFactorial = difference;
		if (n >= 0 && r >= 0) {
			if (n > r) {
				for (int i = difference - 1; i > 1; i--) {
					differenceFactorial *= i;
				}
				long total = nFactorial / differenceFactorial;
				System.out.println("Number of permutations is " + total);
			} else {
				System.out.println("R must be less than or equal to N.");
			}
		} else {
			System.out.println("R can't be negative.");
		}

	}

}