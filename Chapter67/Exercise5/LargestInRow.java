import java.io.* ;

public class LargestInRow
{

  public static void main ( String[] args )  
  {
    int[][] data = { {3, 2, 5},
                     {1, 4, 4, 8, 13},
                     {9, 1, 0, 2},
                     {0, 2, 6, 3, -1, -8,} };

    int max = 0;
    int min = 0;


    // Initialize array of biggest ints in row
    int[] largestInRow = new int[data.length];
    
    //  Calculate max and min
    for ( int row=0; row < data.length; row++)
    {
      max = data[row][0];
      min = data[row][0];
      for ( int col=0; col < data[row].length; col++) 
      {
        int val = data[row][col];

        if (val > max) {
          max = val;
        }
        if (val < min) {
          min = val;
        }
      }
      System.out.println( "max = " + max + "; min = " + min );

    }

  }
}