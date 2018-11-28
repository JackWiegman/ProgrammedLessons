import java.util.Arrays;

class SameElements {

  public static boolean sameElts( int[] a, int[] b ) {

    if (a.length != b.length) {
      return false;
    }

    int[] sortA = new int[a.length];
    for (int i = 0; i < a.length; i++) {
      sortA[i] = a[i];
    }

    int[] sortB = new int[b.length];
    for (int i = 0; i < b.length; i++) {
      sortB[i] = b[i];
    }

    Arrays.sort(sortA);
    Arrays.sort(sortB);
    return Arrays.equals(sortA, sortB);



  }
  
  public static void main ( String[] args ) {

    int[] arrayA = { 1, 2, 3, 4, 2 };
    int[] arrayB = { 4, 2, 3, 2, 1 };

    if ( sameElts(arrayA, arrayB) ) {
      System.out.println( "Same Elements" );
    }
    else {
      System.out.println( "DIFFERENT elements" );      
    }

    System.out.println("Array A: ");
    for (int i = 0; i < arrayA.length; i++) {
      System.out.println(arrayA[i]);
    }

    System.out.println("Array B: ");
    for (int i = 0; i < arrayB.length; i++) {
      System.out.println(arrayB[i]);
    }
    
  }
}