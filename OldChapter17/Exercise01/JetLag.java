import java.util.Scanner;

public class JetLag {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many hours of travel: ");
		int hours = scan.nextInt();
		System.out.println("How many time zones crossed: ");
		int zones = scan.nextInt();
		System.out.println("Departure time: ");
		int departTime = scan.nextInt();
		System.out.println("Arrival time: ");
		int arriveTime = scan.nextInt();

		int departNum = 0;
		if (departTime >= 8 && departTime < 12) {
			departNum = 0;
		} else if (departTime >= 12 && departTime < 18) {
			departNum = 1;
		} else if (departTime >= 18 && departTime < 22) { 
			departNum = 3;
		} else if (departTime >= 22 || departTime < 1) {
			departNum = 4;
		} else if (departTime >= 1 && departTime < 8) {
			departNum = 5;
		}

		int arriveNum = 0;
		if (arriveTime >= 18 && arriveTime < 22) {
			arriveNum = 0;
		} else if (arriveTime >= 22 || arriveTime < 1) {
			arriveNum = 1;
		} else if (arriveTime >= 12 && arriveTime < 18) {
			arriveNum = 2;
		} else if (arriveTime >= 1 && arriveTime < 8) {
			arriveNum = 3;
		} else if (arriveTime >= 8 && arriveTime < 12) {
			arriveNum = 4;
		}

		double recovery = ((hours / 2.0) + (zones - 3.0) + departNum + arriveNum) / 10.0;
		System.out.println("You need " + recovery + " days to recover.");

	}

}