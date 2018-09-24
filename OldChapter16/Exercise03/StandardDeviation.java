import java.util.Scanner;

public class StandardDeviation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double avg;
		double avgSquare;
		int totalNums;

		System.out.println("How many numbers:");
		totalNums = scan.nextInt();

		double sum = 0;
		double sumSquare = 0;
		int count = 0;
		while (count < totalNums) {
			System.out.println("Enter number: ");
			double num = scan.nextDouble();
			sum += num;
			sumSquare += Math.pow(num, 2);
			count += 1;
		}
		avg = sum / totalNums;
		avgSquare = sumSquare / totalNums;

		double standardDeviation = Math.sqrt(avgSquare - (Math.pow(avg, 2)));

		System.out.println("Standard Deviation is: " + standardDeviation);

	}

}