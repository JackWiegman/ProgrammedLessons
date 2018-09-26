import java.util.Scanner;

public class AreaOfRectangles {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int width = 1;
		int height = 1;
		int area = 1;

		while (width != 0 && height != 0) {
			System.out.println("First corner X coordinate: ");
			int firstCornerX = scan.nextInt();		
			System.out.println("First corner Y coordinate: ");
			int firstCornerY = scan.nextInt();		
			System.out.println("Second corner X coordinate: ");
			int secondCornerX = scan.nextInt();		
			System.out.println("Second corner Y coordinate: ");
			int secondCornerY = scan.nextInt();	

			width = Math.abs(firstCornerX - secondCornerX);
			height = Math.abs(firstCornerY - secondCornerY);
			area = width * height;

			System.out.println("Width: " + width + "\tHeight: " + height + "\nArea: " + area + "\n");

			if (width == 0 || height == 0) {
				System.out.println("Finished");
			}

		}

	}

}