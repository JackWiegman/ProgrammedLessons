public class Box {

	private double width, height, length, side;

	public Box(double width, double height, double length) {
		this.width = width;
		this.height = height;
		this.length = length;
	}

	Box(Box oldBox) {
		return new Box(width, height, length);
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

	public double width() {
		return width;
	}

	public double height() {
		return height;
	}

	public double length() {
		return length;
	}

	public Box biggerBox(Box oldBox) {
		return new Box(1.25 * oldBox.width(), 1.25 * oldBox.height, 1.25 * oldBox.length);
	}



}