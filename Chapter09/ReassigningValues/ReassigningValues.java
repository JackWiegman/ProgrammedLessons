public class ReassigningValues {

	public static void main(String[] args) {
		double x = 0;
		double value = (3*(Math.pow(x, 2))) - (8*x) + 4;
		System.out.println("At x = " + x + " the value is " + value);
		x = 2;
		value = (3*(Math.pow(x, 2))) - (8*x) + 4;
		System.out.println("At x = " + x + " the value is " + value);
		x = 4;
		value = (3*(Math.pow(x, 2))) - (8*x) + 4;
		System.out.println("At x = " + x + " the value is " + value);
	}

}