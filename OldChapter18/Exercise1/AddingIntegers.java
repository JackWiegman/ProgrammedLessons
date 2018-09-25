import java.util.Scanner;

public class AddingIntegers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first integer (enter 0 to quit): ");
		int num = scan.nextInt();

		if (num == 0) {
			System.out.println("No integers were entered. \nbye");
		} else {
			int numSum = num;
			while (num != 0)  {
				System.out.println("Enter an integer (or 0 to quit): ");
				num = scan.nextInt();
				if (num != 0) {
					numSum += num;
				} else {
					System.out.println("Sum of the integers: " + numSum + "\nbye");
				}
			}
		}
	}

}