import java.util.Scanner;

public class PantryTester
{
  public static void main ( String[] args )
  {
    Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
    Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
    Jam rhub  = new Jam( "Rhubarb", "10/31/99", 16 );

    Pantry hubbard = new Pantry( goose, apple, rhub );
    System.out.println( "The jams are:\n" + hubbard );

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter your selection (1, 2, or 3): ");
    int jamChoice = scan.nextInt();

  }
}