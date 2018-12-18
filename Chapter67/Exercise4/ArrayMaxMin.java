import java.io.* ;

public class ArrayMaxMin
{

  public static void main ( String[] args )  
  {
    int[][] data = { {3, 2, 5},
                     {1, 4, 4, 8, 13},
                     {9, 1, 0, 2},
                     {0, 2, 6, 3, -1, -8,} };
    
    // declare and initialize the max and the min
    int max = data[0][0];
    int min = data[0][0];
    
    //  Calculate max and min
    for ( int row=0; row < data.length; row++)
    {
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
    }
      
    // write out the results
    System.out.println( "max = " + max + "; min = " + min );

  }
}