import java.util.Scanner;

public class SumOfTwoSquares {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Integer N: ");
		int n = scan.nextInt();
		
		double checkNum = 0;
		double sumSquares = 0;
		for (double i = 1; Math.pow(i, 2) <= n; i++) {
			for (double j = 1; Math.pow(j, 2) <= n; j++) {
				sumSquares = Math.pow(i, 2) + Math.pow(j, 2);
				if (sumSquares == n) {
					System.out.println(n + " is the sum of " + i + "^2 + " + j + "^2." );
					checkNum = sumSquares;
				} 
			}

		}

		if (checkNum != n) {
			System.out.println("Integer is not the sum of 2 squares.");
		}
	}

}