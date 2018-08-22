public class Trigonometry {

	public static void main(String[] args) {
		double num = 0.866;
		double sin = Math.sin(num);
		double cos = Math.cos(num);
		double squareSum = (Math.pow(sin, 2)) + (Math.pow(cos,2));
		System.out.println("sine: " + sin + "\ncosine: " + cos + "\nsum of squares: " + squareSum);
	}

}