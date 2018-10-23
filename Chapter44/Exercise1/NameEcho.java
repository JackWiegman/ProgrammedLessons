import java.util.Scanner;

public class NameEcho {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your name: ");
		String name = (scan.nextLine()).trim();

		int spaceIndex = name.indexOf(" ");
		String firstName = name.substring(0, spaceIndex);
		String lastName = (name.substring(spaceIndex, name.length())).toUpperCase();
		String finalName = firstName + lastName;

		System.out.println(finalName);
	}

}