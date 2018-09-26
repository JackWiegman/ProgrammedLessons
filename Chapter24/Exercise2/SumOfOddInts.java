import java.util.Scanner;

public class SumOfOddInts {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Integer N: ");
		int n = scan.nextInt();

		int sumOdds = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 != 0) {
				sumOdds += i;
			}
		}
		System.out.println("Sum of odd numbers: " + sumOdds);
		System.out.println("N squared: " + Math.pow(n, 2));
	}

}