import java.util.Scanner;

public class TriangleAndSquareNums {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Upper limit: ");
		int limit = scan.nextInt();

		System.out.println("Square and triangle numbers up to " + limit + " are: ");
		double totalTriangleNum = 0;
		double squareNum = 0;
		double realSquareNum = 0;
		for (double i = 1; i <= limit; i++) {
			totalTriangleNum += i;
			squareNum = Math.sqrt(i);
			if (squareNum % 1 == 0) {
				realSquareNum = i;
			}
			if (totalTriangleNum == realSquareNum) {
				System.out.println(squareNum);
			}
		}

	}

}