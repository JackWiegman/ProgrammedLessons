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

    int[] colSums;
    int colSumsLength = 0;
    
    // compute the sums for each row
    for (int row = 0; row < data.length; row++) {

      colSumsLength = 0;

      for (int col = 0; col < data[row].length; col++) {
        if (data[row] == null) {
          break;
        }

        System.out.println("Testing col");
        colSumsLength += data[row][col];
      }
      System.out.println("Testing row");
      System.out.println(colSumsLength);
    }   


  }
}      