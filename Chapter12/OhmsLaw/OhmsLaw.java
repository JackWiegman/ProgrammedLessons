import java.util.Scanner;

public class OhmsLaw {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int voltage;
		int resistance;

		System.out.println("How many volts: ");
		voltage = scan.nextInt();

		System.out.println("Whats the resistance: ");
		resistance = scan.nextInt();

		double current = (voltage + 0.0) / resistance;
		System.out.println("The current is " + current);
	}

}