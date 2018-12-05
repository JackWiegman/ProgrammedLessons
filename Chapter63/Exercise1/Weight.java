class Weight
{
  private int[] data;
  private int sum = 0;
  private int avg = 0;

  // Constructor
  public Weight(int[] init)
  {
    // Make data the same length
    // as the array referenced by init.
    data = new int[init.length];
    
    // Copy values from the 
    // input data to data.
    for (int i = 0; i < init.length; i++)
    {
      data[i] = init[i];
    }
  }
  
  //Print
  public String toString()
  {

    String dataStr = "";

    for (int i = 0; i < data.length; i++) {
      dataStr += ("\n" + data[i]);
    }

    return ("Data: " + dataStr + "\nAverage: " + avg);
 
  }

  public int average() {


    for (int i = 0; i < data.length; i++) {
      sum += data[i];
    }

    avg = sum / data.length;
    return avg;
  }

  public int subAverage(int start, int end) {
    sum = 0;
    for (int i = start; i < end; i++) {
      sum += data[i];
    }

    avg = sum / (end - start);

    return avg;

  }

}

