import java.util.Scanner;

public class AgeInSeconds {

	public static void main(String[] args) {
		int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner scan = new Scanner(System.in);

		System.out.println("How many years: ");
		int years = scan.nextInt();

		System.out.println("How many months: ");
		int months = scan.nextInt();

		System.out.println("How many days: ");
		int days = scan.nextInt();

		int totalDaysFromYears = years * 365;

		int totalDaysFromMonths = 0;
		for (int i = 0; i < months; i++) {
			totalDaysFromMonths += monthDays[i];
		}

		int totalDays = totalDaysFromYears + totalDaysFromMonths + days;
		int seconds = totalDays * 24 * 60 * 60;

		System.out.println("You have lived " + seconds + " seconds.");

	}

}