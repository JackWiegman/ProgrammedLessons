import java.util.Scanner;

public class PeriodLineLength {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String first;
		String second;

		System.out.println("Enter first word: ");
		first = scan.nextLine();
		System.out.println("Enter second word: ");
		second = scan.nextLine();

		int lenFirst = first.length();
		int lenSecond = second.length();
		int count = 1;

		String periods = "";
		while (count <= (30 - (lenFirst + lenSecond))) {
			periods = periods + ".";
			count += 1;
		}
		System.out.println(first + periods + second);
	}

}