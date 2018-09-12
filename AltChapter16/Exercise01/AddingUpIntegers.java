import java.util.Scanner;

public class AddingUpIntegers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nums;

		System.out.println("How many integers will be added: ");
		nums = scan.nextInt();

		int sum = 0;
		int integer;
		int count = 1;
		while (count <= nums) {
			System.out.println("Enter an integer: ");
			integer = scan.nextInt();
			sum = sum + integer;
			count += 1;
		}

		System.out.println("The sum is " + sum);
	}

}