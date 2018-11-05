class Pantry
{
  // Instance Variables
  private Jam  jar1 ;
  private Jam  jar2 ;
  private Jam  jar3 ;
  private Jam  selected ;

  // Constructors
  Pantry( Jam jar1, Jam jar2, Jam jar3 )
  {
    this . jar1 = jar1 ;
    this . jar2 = jar2 ;
    this . jar3 = jar3 ;
    selected = null ;
  }

  Pantry(Jam jar1) {
    this.jar1 = jar1;
    jar2 = null;
    jar3 = null;
    selected = null;
  }

  Pantry(Jam jar1, Jam jar2) {
    this.jar1 = jar1;
    this.jar2 = jar2;
    jar3 = null;
    selected = null;
  }

  // Methods
  public String toString()
  {
    String str = "";
    str += "1: " +  jar1.toString()  + "\n";

    if (jar2 != null) {
      str += "2: " +  jar2.toString()  + "\n";
    }
    if (jar3 != null) {
      str += "3: " +  jar3.toString()  + "\n";
    }
      return str;
    
  }

  // assume that the user entered a correct selection, 1, 2, or 3
  public boolean select( int jarNumber )
  {
    if ( jarNumber == 1) {
      selected = jar1;
      return true;
    }

    else if ( jarNumber == 2 ) {
      if (jar2 != null) {
        selected = jar2;
        return true; 
      } else {
        return false;
      }
    }

    else if (jarNumber == 3 ) {
      if (jar3 != null) {
        selected = jar3;
        return true; 
      } else {
        return false;
      }
    } else {
      return false;
    }
  }

  // spread the selected jam
  public void spread( int oz )
  {
    selected.spread(oz);
  }

  public void replace(Jam j, int slot) {
    
  }

  

}

