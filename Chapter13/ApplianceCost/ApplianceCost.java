import java.util.Scanner;

public class ApplianceCost {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double cost;
		int time;

		System.out.println("Enter cost per kilowatt-hour in cents");
		cost = scan.nextDouble();

		System.out.println("Enter kilowatt-hours used per year");
		time = scan.nextInt();

		double totalCost = time * (cost / 100);
		System.out.println("Annual cost: " + totalCost);
	}

}