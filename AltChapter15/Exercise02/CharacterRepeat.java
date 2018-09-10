import java.util.Scanner;

public class CharacterRepeat {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word;

		System.out.println("Enter a word: ");
		word = scan.nextLine();
		System.out.println("\n");

		int times = word.length();

		int count = 1;
		while (count <= times) {
			System.out.println(word);
			count += 1;
		}
	}

}