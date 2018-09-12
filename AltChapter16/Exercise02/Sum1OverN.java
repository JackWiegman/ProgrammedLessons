import java.util.Scanner;

public class Sum1OverN {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberOfInts;

		System.out.println("Enter N: ");
		numberOfInts = scan.nextInt();

		int count = 1;
		int n = 1;
		double sum = 0;
		while (count <= numberOfInts) {
			sum = sum + (1.0/n);
			n += 1;
			count += 1;
		}
		System.out.println("Sum is: " + sum);
	}

}