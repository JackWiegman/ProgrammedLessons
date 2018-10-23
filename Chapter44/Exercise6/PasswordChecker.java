import java.util.Scanner;

public class PasswordChecker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your password: ");
		String password = scan.nextLine();

		String errorMessage = "That password is not acceptable.";

		if (password.length() >= 7) {
			
		} else {
			System.out.println(errorMessage);
		}
	}

}