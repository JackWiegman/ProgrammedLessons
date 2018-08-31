import java.util.Scanner;

public class LastChanceGas {

	public static void main(String[] args) {
		int tank;
		int gage;
		int mpg;
		Scanner scan = new Scanner(System.in);

		System.out.println("Tank capacity: ");
		tank = scan.nextInt();
		System.out.println("Gage reading: ");
		gage = scan.nextInt();
		System.out.println("Miles per gallon: ");
		mpg = scan.nextInt();

		int range = tank * mpg * (gage/100);

		if (range < 200) {
			System.out.println("Get Gas!");
		}
		else {
			System.out.println("You're good to go!");
		}
	}

}