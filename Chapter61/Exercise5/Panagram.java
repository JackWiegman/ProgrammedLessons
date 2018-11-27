import java.util.Scanner;

public class Panagram {

	public static void main (String[] args) {
		boolean allLetters = true;

		int[] letterCount = new int[26];
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a sentence: ");
		String sentence = scan.nextLine();
		String lowerSen = (sentence.toLowerCase()).trim();
		System.out.println(lowerSen);

		int letter = 0;
		for (char i = 'a'; i <= 'z'; i++) {
			for (int j = 0; j <= lowerSen.length() - 1; j++) {
				if (lowerSen.charAt(j) == i) {
					letterCount[j]++;
				}
			}
		}

		for (int i = 0; i <= letterCount.length - 1; i++) {
			if (letterCount[i] == 0) {
				allLetters = false;
			}
		}

		if (allLetters) {
			System.out.println("Sentence is a Panagram.");
		} else {
			System.out.println("Sentence is not a Panagram.");
		}


	}

}