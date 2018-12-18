import java.io.* ;

public class ColumnSums
{

  public static void main ( String[] args ) 
  {
    int[][] data = { {3, 2, 5},
                     {1, 4, 4, 8, 13},
                     {9, 1, 0, 2},
                     {0, 2, 6, 3, -1, -8} };
    
    // declare the sum
    int sum = 0;
    int colSumsLength = 0;
    int max = 0;

    int[] rowLengths = new int[data.length];
    
    // find the length of each row
    for (int row = 0; row < data.length; row++) {
      rowLengths[row] = data[row].length;
    }

    // find biggest row length
    for (int i : rowLengths) {
      if (i > max) {
        max = i;
      }
    }

    int[] colSums = new int[max];

    for (int row = 0; row < data.length; row++) {
      for (int i = 0; i < rowLengths[row]; i++) {
        colSums[i] += data[row][i];
      }
    }

    for (int i = 0; i < colSums.length; i++) {
      System.out.println("Column " + i + " sum: " + colSums[i]);
    }

  }
}      