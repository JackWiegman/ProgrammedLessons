import java.util.Scanner;

public class Exercise1
{
  public static void main ( String[] args )
  {
    Scanner scan = new Scanner(System.in);
    Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
    Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
    Jam rhub  = new Jam( "Rhubarb", "10/31/99", 3 );

    Pantry hubbard = new Pantry(goose, apple, rhub);
    int jamSelection = 0;

    while (jamSelection != -1) {
      System.out.println(hubbard + "\nEnter your selection (1, 2, or 3): ");
      jamSelection = scan.nextInt();

      if (jamSelection > 3) {
        System.out.println("That is not a jam jar.");
      } else {

        if (jamSelection == -1) {
          System.out.println("Goodbye");
          break;
          
        } else {

          System.out.println("Enter amount to spread: ");
          int amountSpread = scan.nextInt();
      
          hubbard.select(jamSelection);
          hubbard.spread(amountSpread);
        }
      }
    }

  }
}