import java.util.Scanner;

public class DoubleTime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double rate;

		System.out.println("Interest rate (percentage): ");
		rate = scan.nextDouble();
		double time = 72.0 / rate;

		System.out.println("It takes " + time + " years to double your value");
	}

}