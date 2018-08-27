import java.util.Scanner;

public class BrickDistance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double time;
		double g = 32.174;

		System.out.println("Enter number of seconds: ");
		time = scan.nextDouble();

		double d = (0.5) * g * (time * time);
		System.out.println("Distance: " + d);
	}

}