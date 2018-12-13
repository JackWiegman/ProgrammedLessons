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
    
    // compute the sums for each row
    for (int row = 0; row < data.length; row++) {
      for (int col = 0; col < data[row].length; col++) {
        if (col > max) {
          max = col;
        }
      }
      System.out.println("Testing row");
      System.out.println(colSumsLength);
    }   

    int[] colSums = new int[max + 1];

    int colsLeft = 0;

    for (int row = 0; row < data.length; row++) {
      if (data[row].length < max) {

        colsLeft = max - data[row].length;

        for (int col = 0; col < data[row].length + colsLeft; col++) {

          if (col < data[row].length) {
            colSums[col] += data[row][col];
          } else {
            colSums[col] = 0;
          }

        }

      }
    }  

    for (int i = 0; i < colSums.length; i++) {
      System.out.println("Column " + (i + 1) + " sum: " + colSums[i]);
    }
  }
}      