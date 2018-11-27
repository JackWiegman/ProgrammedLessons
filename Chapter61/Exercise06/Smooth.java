import java.io.* ;

class Smooth {

  public static void main (String[] args) {
    int[] signal  = {1, 5, 4, 5, 7, 6, 8, 6, 5, 4, 5, 4};
    int[] smooth = new int[signal.length];
    
    // compute the smoothed value for each
    //  cell of the array smooth
    smooth[0] = (signal[0] + signal[1]) / 2;
    smooth[signal.length - 1] = (signal[signal.length - 1] + signal[signal.length - 2]) / 2;
    int avg = 0;    
    for (int i = 1; i < smooth.length - 1; i++) {
        avg = (signal[i-1] + signal[i] + signal[i+1]) / 3; 
        smooth[i] = avg;
    }
      
    // write out the input
    System.out.println("Input: ");
    for ( int i=0; i < signal.length; i++) {
        System.out.println(smooth[i]);
    }
    
    // write out the result
    System.out.println("Result: ");
    for ( int i=0; i < smooth.length; i++) {
        System.out.println(smooth[i]);
    }

  }
}   