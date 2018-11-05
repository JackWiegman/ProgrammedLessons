import java.util.Scanner;

public class OdiousNumbers {

	public static boolean checkOdious(int num) {
		int numberOfOnes = 0;
		int numberOfZeros = 0;

		while (num != 0) {
			if (num % 2 == 1) {
				numberOfOnes++;
			} else {
				numberOfZeros++;
			}
			num = num / 2;
		}

		if (numberOfOnes % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num = scan.nextInt();

		if (checkOdious(num)) {
			System.out.println(num + " is an odious number.");
		} else {
			System.out.println(num + " is an evil number.");
		}
		
	}

}