import java.util.Scanner;

public class WindChillIndex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int windSpeed;
		int temp;

		System.out.println("Endter Wind Speed: ");
		windSpeed = scan.nextInt();
		System.out.println("Endter Temperature: " );
		temp = scan.nextInt();

		double windChill;
		if (windSpeed < 3) {
			windChill = temp;
		}
		else if (temp >= 50) {
			windChill = temp;
		}
		else {
			windChill = 35.74 + (0.6215 * temp) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * temp * Math.pow(windSpeed, .16));			
		}
		System.out.println(windChill);
	}

}