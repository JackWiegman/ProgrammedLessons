import java.io.*;

public class ArraySum {

	public static void main (String args[]) {
		int[][] data = { {3, 2, 5},
                     {1, 4, 4, 8, 13},
                     {9, 1, 0, 2},
                     {0, 2, 6, 3, -1, -8} };

        int sum = 0;

        for (int row = 0; row < data.length; row++) {
        	for (int col = 0; col < data[row].length; col++) {
        		if (data[row] == null) {
        			break;
        		}

        		sum += data[row][col];
        	}
        }

        System.out.println(sum);

	}

}