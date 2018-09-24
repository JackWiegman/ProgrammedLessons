import java.util.Scanner;

public class WedgeOfStars {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Initial number of stars: ");
		int initialStars = scan.nextInt();

		int count = initialStars;

		while (count > 0) { 
			int starLength = count;
			String str = "";
			while (starLength > 0) {
				str += "*";
				starLength--;
			} 
			System.out.println(str);
			count--;
		} 

	}

}