import java.io.*;

public class ThreeSums {

	public static void main (String[] args) {
		int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};

		int sumAll = 0;
		int sumEven = 0;
		int sumOdd = 0;

		for (int i = 0; i < data.length; i++) {
			sumAll += data[i];

			if (data[i] % 2 == 0) {
				sumEven += data[i];
			} else {
				sumOdd += data[i];
			}
		}

		System.out.println("Sum All: " + sumAll
			+ "\nSum Even: " + sumEven
			+ "\nSumOdd: " + sumOdd);

	}

}