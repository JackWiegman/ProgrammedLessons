import java.util.Scanner;

public class MilesPerGallon {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int initialMiles = 0;
		while (initialMiles >= 0) {
			System.out.println("Inititial miles: ");
			initialMiles = scan.nextInt();
			if (initialMiles >= 0) {
				System.out.println("Final miles: ");
				int finalMiles = scan.nextInt();
				System.out.println("Gallons: ");
				int gallons = scan.nextInt();

				double milesPerGallon = (finalMiles - initialMiles) / gallons;
				System.out.println("Miles per Gallon: " + milesPerGallon + "\n");
			} else {
				System.out.println("bye");
			}
		}
	}

}