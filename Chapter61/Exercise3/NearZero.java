import java.io.*;

class NearZero {

	public static void main (String[] args) {
		int[] data = {3, 5, 7, 4, 12, -3, 8, -2};

		int closest = data[0];


		for (int i = 0; i < data.length; i++) {
			int posNum = Math.abs(data[i]);
			if (posNum - 0 < closest) {
				closest = posNum;
			}
		}

		System.out.println("Closest number to 0 is: " + closest);

	}

}