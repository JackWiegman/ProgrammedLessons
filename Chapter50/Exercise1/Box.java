public class Box {

	private double width, height, length, side;

	public Box(double width, double height, double length) {
		this.width = width;
		this.height = height;
		this.length = length;
	}

	public double volume() {
		return width * length * height;
	}

	public double area() {
		return 2 * (faceArea() + topArea() + sideArea());
	}

	private double faceArea() {
		return width * height;
	} 

	private double topArea() {
		return width * length();
	}

	private double sideArea() {
		return length * height;
	}



}