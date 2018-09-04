import java.util.Scanner;

public class MovieTickets {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age;
		int time;

		System.out.println("How old are you: ");
		age = scan.nextInt();
		System.out.println("What time is it: ");
		time = scan.nextInt();

		int cost;
		if (age >= 13) {
			if (time >= 1700) {
				cost = 8;
			} else {
				cost = 5;
			}
		} else {
			if (time >= 1700) {
				cost = 4;
			} else {
				cost = 2;
			}
		}

		System.out.println("Ticket price is $" + cost);

	}

}