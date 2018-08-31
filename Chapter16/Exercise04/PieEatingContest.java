import java.util.Scanner;

public class PieEatingContest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int weight;

		System.out.println("Contestant weight: ");
		weight = scan.nextInt();

		if (weight < 220 || weight > 280) {
			System.out.println("Contestant not allowed in contest.");
		}
		else {
			System.out.println("P I E T I M E");
		}

	}

}