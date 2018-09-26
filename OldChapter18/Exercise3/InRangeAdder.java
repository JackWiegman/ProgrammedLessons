import java.util.Scanner;

public class InRangeAdder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Low end of range: ");
		int lowEnd = scan.nextInt();
		System.out.println("High end of range: ");
		int highEnd = scan.nextInt();

		int num = 1;
		int inRangeSum = 0;
		int outRangeSum = 0;
		while (num != 0) {
			System.out.println("Enter data: ");
			num = scan.nextInt();
			if (num != 0) {
				if (num >= lowEnd && num <= highEnd) {
					inRangeSum += num;
				}
				outRangeSum += num;
			} 
		}
		System.out.println("Sum of in range values: " + inRangeSum);
		System.out.println("Sum of out of range values: " + outRangeSum);
	}

}