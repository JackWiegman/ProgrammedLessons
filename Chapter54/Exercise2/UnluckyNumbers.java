import java.util.Scanner;

public class UnluckyNumbers {

	public static boolean checkUnlucky(int num) {
		while (num != 0) {
			if (num == 13) {
				return true;
			} 
			num = num / 10;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num = scan.nextInt();

		if (checkUnlucky(num)) {
			System.out.println(num + " is an unlucky number.");
		} else {
			System.out.println(num + " is not an unlucky number.");
		}
	}

}
