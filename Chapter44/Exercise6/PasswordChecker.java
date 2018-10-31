import java.util.Scanner;

public class PasswordChecker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		

		String errorMessage = "That password is not acceptable.";
		boolean hasUpperCase = false;
		boolean hasLowerCase = false;
		boolean hasNumber = false;
		boolean acceptablePassword = false;

		while (!acceptablePassword) {
			System.out.println("Enter your password: ");
			String password = scan.nextLine();

			if (password.length() >= 7) {
				for (int i = 0; i < password.length(); i++) {
					if (Character.isUpperCase(password.charAt(i))) {
						hasUpperCase = true;
					} 
					if (Character.isLowerCase(password.charAt(i))) {
						hasLowerCase = true;
					}
					if (Character.isDigit(password.charAt(i))) {
						hasNumber = true;
					}
				}
				if (hasUpperCase && hasLowerCase && hasNumber) {
					System.out.println("Acceptable password.");
					acceptablePassword = true;
				} else {
					System.out.println(errorMessage);
				}
			} else {
				System.out.println(errorMessage);
			}
		}


	}

}