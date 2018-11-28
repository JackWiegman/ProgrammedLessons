class Weight
{
  private int[] data;
  
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
      dataStr += (data[i]);
    }

    return dataStr;
 
  }
}

