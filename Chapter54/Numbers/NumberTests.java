import java.util.Scanner;

public class NumberTests {

	// Check for Odious number
	public static boolean checkOdious(int num) {
		int numberOfOnes = 0;
		int numberOfZeros = 0;

		// See how many 1s and 0s in number
		while (num != 0) {
			if (num % 2 == 1) {
				numberOfOnes++;
			} else {
				numberOfZeros++;
			}
			num = num / 2;
		}

		// Check if there is an odd number of 1s
		if (numberOfOnes % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

	// Check if number is unlucky
	public static boolean checkUnlucky(int num) {
		while (num != 0) {
			if (num == 13) {
				return true;
			} 
			num = num / 10;
		}
		return false;
	}

	public static boolean checkPerfect(int num) {
		int sumDivisors = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sumDivisors += i;
			}
		}

		if (sumDivisors == num) {
			return true;
		} else {
			return false;
		}
	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		/*/ Check Odious number
		System.out.println("Enter an integer: ");
		int odiousNum = scan.nextInt();

		if (checkOdious(odiousNum)) {
			System.out.println(odiousNum + " is an odious number.");
		} else {
			System.out.println(odiousNum + " is an evil number.");
		}

		// Check unlucky number
		System.out.println("Enter an integer to : ");
		int unluckyNum = scan.nextInt();

		if (checkUnlucky(unluckyNum)) {
			System.out.println(unluckyNum + " is an unlucky number.");
		} else {
			System.out.println(unluckyNum + " is not an unlucky number.");
		}*/

		// Find all evil and unlucky numbers from 0 to some upper limit
		/*for (int i = 0; i <= 10000; i++) {
			if (!checkOdious(i) && checkUnlucky(i)) {
				System.out.println(i + " is odious and unlucky.");
			}
		}*/

		// Find if any numbers to an upper limit are perfect numbers
		System.out.println("Enter upper limit: ");
		int upperLimit = scan.nextInt();

		for (int i = 1; i <= upperLimit; i++) {
			if (checkPerfect(i)) {
				System.out.println(i + " is a perfect number.");
			}
		}
		
	}

}