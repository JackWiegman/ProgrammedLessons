import java.util.Scanner;

public class NumbersBetween {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int start;
		int end;

		System.out.println("Enter Start: ");
		start = scan.nextInt();
		System.out.println("Enter End: ");
		end = scan.nextInt();
		System.out.println("\n");

		int count = start;
		while (count <= end) {
			System.out.println(count);
			count += 1;
		}
	}

}