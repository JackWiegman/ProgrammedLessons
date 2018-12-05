public class WeightTester
{
  public static void main ( String[] args )
  {
    /*int[] values = { 98,  99,  98,  99, 100, 101, 102, 100, 104, 105,
                    105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
                    105, 105, 104, 104, 103, 102, 102, 101, 100, 102};*/

    int[] values = {1, 7, 4, 13, 11, 8, 5, 6, 12, 15};
    Weight june = new Weight( values );
    int avg = june.average();
    System.out.println("Average: " + avg);
    int subAvg = june.subAverage(2, 6);
    System.out.println("Sub Average: " + subAvg);


  }
}      