import java.util.Scanner;

public class SubstringFun {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String stringInput;
		int startIndex;
		int endIndex;

		System.out.println("Enter a string:");
		stringInput = scan.nextLine();

		System.out.println("Enter beginning index: ");
		startIndex = scan.nextInt();

		System.out.println("Enter ending index: ");
		endIndex = scan.nextInt();

		System.out.println("Original string:\n" + stringInput);
		System.out.println("\nSubstring:\n" + stringInput.substring(startIndex, endIndex));

	}

}