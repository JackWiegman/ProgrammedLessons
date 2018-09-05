import java.util.Scanner;

public class InternetDeli {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String item;
			double price;
			boolean delivery;

			System.out.println("Enter the item: ");
			item = scan.nextLine();
			System.out.println("Enter the price: ");
			price = scan.nextDouble();
			System.out.println("Overnight delivery (0==no, 1==yes): ");
			delivery = scan.nextBoolean();

			double total;
			double deliveryPrice = 3;
			double totalDelivery;
			if (price < 10) {
				if (delivery) {
					total = price + deliveryPrice + 2;
					totalDelivery = deliveryPrice + 2;
				} else {
					total = price + 2;
					totalDelivery = 2;
				}
			} else {
				if (delivery) {
					total = price + 3;
					totalDelivery = 3;
				} else {
					total = price;
					totalDelivery = 0;
				}
			}

			System.out.println("Invoice:\n\t" + item + "\t" + price + "\n\tDelivery\t" + totalDelivery + "\n\tTotal\t" + total);


		}
		

}