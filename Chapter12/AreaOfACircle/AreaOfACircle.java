import java.util.Scanner;

public class AreaOfACircle {

	public static void main(String[] args) {
		int radius;
		Scanner scan = new Scanner(System.in);

		System.out.println("Radius: ");
		radius = scan.nextInt();

		double area = Math.PI * Math.pow(radius, 2);

		System.out.println("Radius is: " + radius + "\nThe Area is: " + area);
	}

}