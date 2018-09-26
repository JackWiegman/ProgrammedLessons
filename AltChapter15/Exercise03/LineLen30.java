import java.util.Scanner;

public class LineLen30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String first;
		String second;

		System.out.println("Enter first word: ");
		first = scan.nextLine();
		System.out.println("Enter second word: ");
		second = scan.nextLine();

		System.out.println(first);
		int count = first.length() + second.length();

		while (count <= 30) {

		}
	}

}